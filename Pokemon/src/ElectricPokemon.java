public class ElectricPokemon implements Pokemon {
    private String name;
    private int level;

    public ElectricPokemon(String name, int level) {
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
            case 1 -> System.out.println(name + " has used Thunder Shock");
            case 2 -> System.out.println(name + " has used Shock Wave");
            case 3 -> System.out.println(name + " has used Volt Tackle");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: Electric");
        System.out.println("Level: " + level);
    }
}
