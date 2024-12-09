public class FirePokemon extends Pokemon{
    private int temperature;
    private int fuel;

    public FirePokemon(int hp, int attack, String sound, int temperature, int fuel) {
        super(hp, attack, sound);
        this.temperature = temperature;
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void eats(String food) {
        fuel += 4;
        System.out.println("This Pokemon is eating: " + food + " and gets more fuel: " + getFuel());
    }

    @Override
    public void attack() {
        if (temperature > 100) {
            fuel -= 30;
            System.out.println("Fire!");
        } else {
            System.out.println("Pokemon is not ready for a fire attack");
        }
    }


}
