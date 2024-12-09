public class FirePokemon extends Pokemon{
    private int temperature;
    private int fuel;

    public FirePokemon(String name, int hp, int attack, String sound, int temperature, int fuel) {
        super(name, hp, attack, sound);
        this.temperature = temperature;
        this.fuel = fuel;
    }

    @Override
    public void eats(String food) {
        fuel += 4;
        setAttack(getAttack() + 1);
        System.out.println(getName() + " is eating: " + food + " and gets more fuel: " + fuel);
    }

    @Override
    public void attack() {
        if (temperature > 100) {
            fuel -= 30;
            System.out.println("Fire!");
        } else {
            System.out.println(getName() + " is not ready for a fire attack");
        }
    }

    public void inferno() {
        int infernoHeaviness = temperature * fuel / 2000;
        int totalAttack = getAttack() * infernoHeaviness;
        System.out.println(getName() + " uses inferno with a total damage of: " + totalAttack);
        setHp(getHp() - 5);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
