
@SuppressWarnings("WeakerAccess")
public class Table {

    public static final Table[] tables = new Table[] {
            new Table.Builder()
                    .xmlName("ability")
                    .tableName("ability_names")
                    .originalTableName("abilities")
                    .originalTableKey("ability_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("ability")
                    .tableName("ability_prose")
                    .originalTableName("abilities")
                    .originalTableKey("ability_id")
                    .textColumn("short_effect")
                    .suffix("short_effect")
                    .secondTextColumn("effect")
                    .secondSuffix("effect").build(),

            new Table.Builder()
                    .xmlName("berry_firmness")
                    .tableName("berry_firmness_names")
                    .originalTableName("berry_firmness")
                    .originalTableKey("berry_firmness_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("characteristic")
                    .tableName("characteristic_text")
                    .originalTableName("characteristics")
                    .originalTableKey("characteristic_id")
                    .originalTableIdentifier("id")
                    .textColumn("message")
                    .suffix("text").build(),

            new Table.Builder()
                    .xmlName("contest_effect")
                    .tableName("contest_effect_prose")
                    .originalTableName("contest_effects")
                    .originalTableKey("contest_effect_id")
                    .originalTableIdentifier("id")
                    .textColumn("flavor_text")
                    .suffix("flavor_text")
                    .secondTextColumn("effect")
                    .secondSuffix("effect").build(),

            new Table.Builder()
                    .xmlName("contest_type")
                    .tableName("contest_type_names")
                    .originalTableName("contest_types")
                    .originalTableKey("contest_type_id")
                    .textColumn("name")
                    .suffix("name")
                    .secondTextColumn("flavor")
                    .secondSuffix("flavor")
                    .thirdTextColumn("color")
                    .thirdSuffix("color").build(),

            new Table.Builder()
                    .xmlName("egg_group")
                    .tableName("egg_group_prose")
                    .originalTableName("egg_groups")
                    .originalTableKey("egg_group_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("encounter_condition")
                    .tableName("encounter_condition_prose")
                    .originalTableName("encounter_conditions")
                    .originalTableKey("encounter_condition_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("encounter_condition_value")
                    .tableName("encounter_condition_value_prose")
                    .originalTableName("encounter_condition_values")
                    .originalTableKey("encounter_condition_value_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("encounter_method")
                    .tableName("encounter_method_prose")
                    .originalTableName("encounter_methods")
                    .originalTableKey("encounter_method_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("encounter_method")
                    .tableName("encounter_method_prose")
                    .originalTableName("encounter_methods")
                    .originalTableKey("encounter_method_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("evolution_trigger")
                    .tableName("evolution_trigger_prose")
                    .originalTableName("evolution_triggers")
                    .originalTableKey("evolution_trigger_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("generation")
                    .tableName("generation_names")
                    .originalTableName("generations")
                    .originalTableKey("generation_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("growth_rate")
                    .tableName("growth_rate_prose")
                    .originalTableName("growth_rates")
                    .originalTableKey("growth_rate_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("item_category")
                    .tableName("item_category_prose")
                    .originalTableName("item_categories")
                    .originalTableKey("item_category_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("item_flag")
                    .tableName("item_flag_prose")
                    .originalTableName("item_flags")
                    .originalTableKey("item_flag_id")
                    .textColumn("name")
                    .suffix("name")
                    .secondTextColumn("description")
                    .secondSuffix("description").build(),

            new Table.Builder()
                    .xmlName("item_fling_effect")
                    .tableName("item_fling_effect_prose")
                    .originalTableName("item_fling_effects")
                    .originalTableKey("item_fling_effect_id")
                    .originalTableIdentifier("id")
                    .textColumn("effect")
                    .suffix("effect").build(),

            new Table.Builder()
                    .xmlName("item")
                    .tableName("item_names")
                    .originalTableName("items")
                    .originalTableKey("item_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("item_pocket")
                    .tableName("item_pocket_names")
                    .originalTableName("item_pockets")
                    .originalTableKey("item_pocket_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("location_area")
                    .tableName("location_area_prose")
                    .originalTableName("location_areas")
                    .originalTableKey("location_area_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("location")
                    .tableName("location_names")
                    .originalTableName("locations")
                    .originalTableKey("location_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("move_battle_style")
                    .tableName("move_battle_style_prose")
                    .originalTableName("move_battle_styles")
                    .originalTableKey("move_battle_style_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("move_damage_class")
                    .tableName("move_damage_class_prose")
                    .originalTableName("move_damage_classes")
                    .originalTableKey("move_damage_class_id")
                    .textColumn("name")
                    .suffix("name")
                    .secondTextColumn("description")
                    .secondSuffix("description").build(),

            new Table.Builder()
                    .xmlName("move_effect_changelog")
                    .tableName("move_effect_changelog_prose")
                    .originalTableName("move_effect_changelog")
                    .originalTableKey("move_effect_changelog_id")
                    .originalTableIdentifier("id")
                    .textColumn("effect")
                    .suffix("effect").build(),

            new Table.Builder()
                    .xmlName("move_effect")
                    .tableName("move_effect_prose")
                    .originalTableName("move_effects")
                    .originalTableKey("move_effect_id")
                    .originalTableIdentifier("id")
                    .textColumn("short_effect")
                    .suffix("short_effect")
                    .secondTextColumn("effect")
                    .secondSuffix("effect").build(),

            new Table.Builder()
                    .xmlName("move_flag")
                    .tableName("move_flag_prose")
                    .originalTableName("move_flags")
                    .originalTableKey("move_flag_id")
                    .textColumn("name")
                    .suffix("name")
                    .secondTextColumn("description")
                    .secondSuffix("description").build(),

            new Table.Builder()
                    .xmlName("move_meta_ailment")
                    .tableName("move_meta_ailment_names")
                    .originalTableName("move_meta_ailments")
                    .originalTableKey("move_meta_ailment_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("move_meta_category")
                    .tableName("move_meta_category_prose")
                    .originalTableName("move_meta_categories")
                    .originalTableKey("move_meta_category_id")
                    .textColumn("description")
                    .suffix("description").build(),

            new Table.Builder()
                    .xmlName("move")
                    .tableName("move_names")
                    .originalTableName("moves")
                    .originalTableKey("move_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("move_target")
                    .tableName("move_target_prose")
                    .originalTableName("move_targets")
                    .originalTableKey("move_target_id")
                    .textColumn("name")
                    .suffix("name")
                    .secondTextColumn("description")
                    .secondSuffix("description").build(),

            new Table.Builder()
                    .xmlName("pal_park_area")
                    .tableName("pal_park_area_names")
                    .originalTableName("pal_park_areas")
                    .originalTableKey("pal_park_area_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("pokeathlon_stat")
                    .tableName("pokeathlon_stat_names")
                    .originalTableName("pokeathlon_stats")
                    .originalTableKey("pokeathlon_stat_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("pokedex")
                    .tableName("pokedex_prose")
                    .originalTableName("pokedexes")
                    .originalTableKey("pokedex_id")
                    .textColumn("name")
                    .suffix("name")
                    .secondTextColumn("description")
                    .secondSuffix("description").build(),

            new Table.Builder()
                    .xmlName("pokemon_color")
                    .tableName("pokemon_color_names")
                    .originalTableName("pokemon_colors")
                    .originalTableKey("pokemon_color_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("pokemon_form")
                    .tableName("pokemon_form_names")
                    .originalTableName("pokemon_forms")
                    .originalTableKey("pokemon_form_id")
                    .textColumn("form_name")
                    .suffix("form_name")
                    .secondTextColumn("pokemon_name")
                    .secondSuffix("pokemon_name").build(),

            new Table.Builder()
                    .xmlName("pokemon_habitat")
                    .tableName("pokemon_habitat_names")
                    .originalTableName("pokemon_habitats")
                    .originalTableKey("pokemon_habitat_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("pokemon_move_method")
                    .tableName("pokemon_move_method_prose")
                    .originalTableName("pokemon_move_methods")
                    .originalTableKey("pokemon_move_method_id")
                    .textColumn("name")
                    .suffix("name")
                    .secondTextColumn("description")
                    .secondSuffix("description").build(),

            new Table.Builder()
                    .xmlName("pokemon_shape")
                    .tableName("pokemon_shape_prose")
                    .originalTableName("pokemon_shapes")
                    .originalTableKey("pokemon_shape_id")
                    .textColumn("name")
                    .suffix("name")
                    .secondTextColumn("awesome_name")
                    .secondSuffix("awesome_name").build(),

            new Table.Builder()
                    .xmlName("pokemon_species")
                    .tableName("pokemon_species_names")
                    .originalTableName("pokemon_species")
                    .originalTableKey("pokemon_species_id")
                    .textColumn("name")
                    .suffix("name")
                    .secondTextColumn("genus")
                    .secondSuffix("genus").build(),

            new Table.Builder()
                    .xmlName("pokemon_species")
                    .tableName("pokemon_species_prose")
                    .originalTableName("pokemon_species")
                    .originalTableKey("pokemon_species_id")
                    .textColumn("form_description")
                    .suffix("form_description").build(),

            new Table.Builder()
                    .xmlName("region")
                    .tableName("region_names")
                    .originalTableName("regions")
                    .originalTableKey("region_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("stat")
                    .tableName("stat_names")
                    .originalTableName("stats")
                    .originalTableKey("stat_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("super_contest_effect")
                    .tableName("super_contest_effect_prose")
                    .originalTableName("super_contest_effects")
                    .originalTableKey("super_contest_effect_id")
                    .originalTableIdentifier("id")
                    .textColumn("flavor_text")
                    .suffix("flavor_text").build(),

            new Table.Builder()
                    .xmlName("type")
                    .tableName("type_names")
                    .originalTableName("types")
                    .originalTableKey("type_id")
                    .textColumn("name")
                    .suffix("name").build(),

            new Table.Builder()
                    .xmlName("version")
                    .tableName("version_names")
                    .originalTableName("versions")
                    .originalTableKey("version_id")
                    .textColumn("name")
                    .suffix("name").build()

    };

    public String xmlName;
    public String tableName;
    public String originalTableName;
    public String originalTableKey;
    public String originalTableIdentifier;
    public String textColumn;
    public String secondTextColumn;
    public String thirdTextColumn;
    public String suffix;
    public String secondSuffix;
    public String thirdSuffix;
    public String languageId;

    private Table() {

    }

    public static class Builder {

        private Table table;

        public Builder() {
            table = new Table();
        }

        public Builder xmlName(String xmlName) {
            table.xmlName = xmlName;
            return this;
        }

        public Builder tableName(String tableName) {
            table.tableName = tableName;
            return this;
        }

        public Builder originalTableName(String originalTableName) {
            table.originalTableName = originalTableName;
            return this;
        }

        public Builder originalTableKey(String originalTableKey) {
            table.originalTableKey = originalTableKey;
            return this;
        }

        public Builder originalTableIdentifier(String originalTableIdentifier) {
            table.originalTableIdentifier = originalTableIdentifier;
            return this;
        }

        public Builder textColumn(String textColumn) {
            table.textColumn = textColumn;
            return this;
        }

        public Builder secondTextColumn(String secondTextColumn) {
            table.secondTextColumn = secondTextColumn;
            return this;
        }

        public Builder thirdTextColumn(String thirdTextColumn) {
            table.thirdTextColumn = thirdTextColumn;
            return this;
        }

        public Builder suffix(String suffix) {
            table.suffix = suffix;
            return this;
        }

        public Builder secondSuffix(String secondSuffix) {
            table.secondSuffix = secondSuffix;
            return this;
        }

        public Builder thirdSuffix(String thirdSuffix) {
            table.thirdSuffix = thirdSuffix;
            return this;
        }

        public Builder languageId(String languageId) {
            table.languageId = languageId;
            return this;
        }

        public Table build() {
            return table;
        }

    }
}
