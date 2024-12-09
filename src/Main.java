public class Main {
    public static void main(String[] args) {

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 30,5, "pika pika", true, 4);
        FirePokemon charizard = new FirePokemon("Charizard", 40, 6, "Wrauw", 120, 50);
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 20, 4, "blurb", 12, "nettle");
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 30, 3, "blub blub", 15, 8);

        pikachu.makeNoise();
        pikachu.attack();
        pikachu.thunder();
        pikachu.eats("lemons");
        pikachu.thunder();
        System.out.println();

        charizard.printHP();
        charizard.inferno();
        charizard.attack();
        charizard.printHP();
        System.out.println();

        bulbasaur.printAttack();
        bulbasaur.poop();
        bulbasaur.poop();
        bulbasaur.attack();
        bulbasaur.eats("Nettle");
        bulbasaur.attack();
        bulbasaur.printAttack();
        System.out.println();

        squirtle.hydroPump();
        squirtle.hydroPump();
        squirtle.hydroPump();
        squirtle.drinks();
        squirtle.eats("watermelon");
        squirtle.hydroPump();

    }
}