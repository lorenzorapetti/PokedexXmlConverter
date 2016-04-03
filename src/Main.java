import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.*;

public class Main {

    public static final int LANGUAGE_IT = 8;
    public static final int LANGUAGE_EN = 9;


    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");

        Connection connection = null;
        try {
            File itFile = new File("values-it/pokedex.xml");
            File enFile = new File("values-en/pokedex.xml");

            itFile.getParentFile().mkdirs();
            enFile.getParentFile().mkdirs();

            PrintWriter it = new PrintWriter(itFile, "UTF-8");
            PrintWriter en = new PrintWriter(enFile, "UTF-8");

            Set<String> names = new HashSet<>();

            printHeader(it);
            printHeader(en);
            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:pokedex.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            for (Table table : Table.tables) {
                String languageId = table.languageId == null ? "local_language_id" : table.languageId;
                String identifierColumn = table.originalTableIdentifier != null ? table.originalTableIdentifier : "identifier";
                ResultSet rs = statement.executeQuery(buildSql(table, languageId));

                while (rs.next()) {
                    String identifier = rs.getString(identifierColumn);

                    String stringName = normalizeName(table.xmlName + "_" + identifier + "_" + table.suffix);
                    String secondStringName = normalizeName((table.secondSuffix != null && table.secondTextColumn != null) ? table.xmlName + "_" + identifier + "_" + table.secondSuffix : "");
                    String thirdStringName = normalizeName((table.thirdSuffix != null && table.thirdTextColumn != null) ? table.xmlName + "_" + identifier + "_" + table.thirdSuffix : "");

                    String text = rs.getString(table.textColumn);
                    String secondText = (table.secondSuffix != null && table.secondTextColumn != null) ? rs.getString(table.secondTextColumn) : "";
                    String thirdText = (table.thirdSuffix != null && table.thirdTextColumn != null) ? rs.getString(table.thirdTextColumn) : "";
                    int langId = rs.getInt(languageId);
                    if (!names.contains(stringName) || names.contains(secondStringName) || names.contains(thirdStringName)) {
                        if (langId == LANGUAGE_EN) {
                            if (text != null && !text.isEmpty())
                                printString(en, stringName, normalize(text));
                            if (secondText != null && !secondText.isEmpty())
                                printString(en, secondStringName, normalize(secondText));
                            if (thirdText != null && !thirdText.isEmpty())
                                printString(en, thirdStringName, normalize(thirdText));
                        } else if (langId == LANGUAGE_IT && !text.isEmpty()) {
                            if (!text.isEmpty())
                                printString(it, stringName, normalize(text));
                            if (secondText != null && !secondText.isEmpty())
                                printString(it, secondStringName, normalize(secondText));
                            if (thirdText != null && !thirdText.isEmpty())
                                printString(it, thirdStringName, normalize(thirdText));
                        }
                        names.add(stringName);
                        if (!secondStringName.isEmpty()) names.add(secondStringName);
                        if (!thirdStringName.isEmpty()) names.add(thirdStringName);
                    }
                }

                it.println();
                en.println();
            }

            printFooter(it);
            printFooter(en);

            it.close();
            en.close();
        } catch(SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch(SQLException e) {
                // connection close failed.
                System.err.println(e);
            }
        }
    }

    public static String normalize(String str) {
        return str.replace("'", "\\'").replace("&", "&amp;").replace("?", "\\u003F");
    }

    public static String normalizeName(String str) {
        return str.replace("-", "_").replace("+", "_");
    }

    public static String buildSql(Table table, String languageId) {
        String sql = "SELECT * FROM " + table.tableName +
                " INNER JOIN " + table.originalTableName + " ON " + table.tableName + "." + table.originalTableKey + " = " + table.originalTableName + ".id" +
                " WHERE " +
                    table.tableName + "." + languageId + " = 8 OR " + table.tableName + "." + languageId + " = 9";
        System.out.println(sql);
        return sql;
    }

    public static void printHeader(PrintWriter pw) {
        pw.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        pw.println("<resources>");
        pw.println();
    }

    public static void printString(PrintWriter pw, String name, String string) {
        pw.println("\t<string name=\"" + name + "\" formatted=\"false\">" + string + "</string>");
    }

    public static void printFooter(PrintWriter pw) {
        pw.println("</resources>");
    }

    public static boolean contains(Set<String> names, String first, String second, String third) {
        return names.contains(first) || names.contains(second) || names.contains(third);
    }

}
