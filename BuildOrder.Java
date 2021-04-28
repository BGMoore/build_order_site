public class BuildOrder {

    //class variables
    private char race;
    private Entity[] build_list;
    private String build_name;
    private char enemy_race;
    private String description;

    //constructors
    public BuildOrder () {
        this.race = 'X';
        this.build_list = new Entity[1];
        this.build_name = "Untitled";
        this.enemy_race = 'X';
        this.description = "add a description.";
    }

    public BuildOrder (char r, Entity[] itemlist, String name, char matchup, String des) {
        this.race = r;
        this.build_list = itemlist;
        this.build_name = name;
        this.enemy_race = matchup;
        this.description = des;
    }

    //public facing getters for all class variables
    public char getRace() { return race; }

    public Entity[] getBuild_list() { return build_list; }

    public String getBuild_name() { return build_name; }

    public char getEnemy_race() { return enemy_race; }

    public String getDescription() { return description; }

}