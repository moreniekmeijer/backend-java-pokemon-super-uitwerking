public class Main {
    public static void main(String[] args) {

        // Welkom! Maak maar wat pokemon aan en kijk maar wat ze kunnen onderaan!
        ElectricPokemon pikachu = new ElectricPokemon(30,5, "pika pika", 4, 4);
        FirePokemon charizard = new FirePokemon(40, 6, "Wrauw", 120, 50);
        GrassPokemon bulbasaur = new GrassPokemon(20, 4, "blurb", 12, "nettle");
        WaterPokemon squirtle = new WaterPokemon(30, 3, "blub blub", 20, 8);

        pikachu.eats("popcorn");
        pikachu.makeNoise();

        charizard.attack();

        bulbasaur.eats("salad");
        bulbasaur.poop();

        squirtle.hydroPump();

    }
}