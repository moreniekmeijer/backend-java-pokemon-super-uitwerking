public class WaterPokemon extends Pokemon{
    private int waterAmount;
    private int hydropower;

    public WaterPokemon(String name, int hp, int attack, String sound, int waterAmount, int hydropower) {
        super(name, hp, attack, sound);
        this.waterAmount = waterAmount;
        this.hydropower = hydropower;
    }

    @Override
    public void eats(String food) {
        setAttack(getAttack() + 2);
        hydropower += 1;
        System.out.println(getName() + " is eating: " + food + "and likes it");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " refuses to attack...");
    }

    public void hydroPump() {
        int combinedAttack = hydropower + getAttack();
        if (waterAmount > 10) {
            System.out.println(getName() + " attacks with " + combinedAttack + " attack points and loses 3 liters of water.");
        } else {
            System.out.println("Not enough water...");
        }
        waterAmount -= 3;
        hydropower -= 1;
    }

    public void drinks() {
        waterAmount += 5;
        System.out.println(getName() + " got thirsty...");
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    public int getHydropower() {
        return hydropower;
    }

    public void setHydropower(int hydropower) {
        this.hydropower = hydropower;
    }
}
