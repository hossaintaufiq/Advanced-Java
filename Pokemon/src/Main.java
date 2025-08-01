public class Main {
    public static void main(String[] args) {
        Pokemon fire = new FirePokemon("Charmander", 5);
        Pokemon water = new WaterPokemon("Squirtle", 6);
        Pokemon grass = new GrassPokemon("Bulbasaur", 4);
        Pokemon electric = new ElectricPokemon("Pikachu", 7);
        Pokemon flying = new FlyingPokemon("Pidgey", 3);
        Pokemon fighting = new FightingPokemon("Machop", 5);

        Pokemon[] pokemons = {fire, water, grass, electric, flying, fighting};

        for (Pokemon p : pokemons) {
            p.attack();
            p.displayInfo();
            System.out.println("-----------------------");
        }
    }
}