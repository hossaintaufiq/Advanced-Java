public class FightingPokemon implements Pokemon {
    private String name;
    private int level;

    public FightingPokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public int getLevel() { return level; }

    public void levelUp() { level++; }

    public void attack() {
        int choice = (int) Math.ceil(Math.random() * 3);
        switch (choice) {
            case 1 -> System.out.println(name + " has used Low Sweep");
            case 2 -> System.out.println(name + " has used Mach Punch");
            case 3 -> System.out.println(name + " has used Double Kick");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: Fighting");
        System.out.println("Level: " + level);
    }
}
