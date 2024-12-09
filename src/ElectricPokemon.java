public class ElectricPokemon extends Pokemon{
    private int charge;
    private int electricLoad;

    public ElectricPokemon(int hp, int attack, String sound, int charge, int electricLoad) {
        super(hp, attack, sound);
        this.charge = charge;
        this.electricLoad = electricLoad;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getElectricLoad() {
        return electricLoad;
    }

    public void setElectricLoad(int electricLoad) {
        this.electricLoad = electricLoad;
    }

    @Override
    public void eats(String food) {
        System.out.println("This Pokemon is eating: " + food);
    }

    @Override
    public void attack() {
        System.out.println("Pokemon attacks with " + getAttack());
        int getHP = getHp() - 1;
    }

    public void makeNoise() {
        System.out.println(getSound());
    }
}
