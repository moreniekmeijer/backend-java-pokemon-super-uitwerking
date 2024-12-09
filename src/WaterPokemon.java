public class WaterPokemon extends Pokemon{
    private int waterAmount;
    private int hydropower;

    public WaterPokemon(int hp, int attack, String sound, int waterAmount, int hydropower) {
        super(hp, attack, sound);
        this.waterAmount = waterAmount;
        this.hydropower = hydropower;
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

    @Override
    public void eats(String food) {
        System.out.println("This Pokemon is eating: " + food + "and likes it");
    }

    @Override
    public void attack() {

    }

    public void hydroPump() {
        int combinedAttack = getHydropower() + getAttack();
        waterAmount -= 3;
        System.out.println("This pokemon attacks with: " + combinedAttack + " and loses " + getWaterAmount());
    }

}
