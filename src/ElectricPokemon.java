public class ElectricPokemon extends Pokemon{
    private boolean charged;
    private int electricPower;

    public ElectricPokemon(String name, int hp, int attack, String sound, boolean charged, int electricPower) {
        super(name, hp, attack, sound);
        this.charged = charged;
        this.electricPower = electricPower;
    }

    @Override
    public void eats(String food) {
        setAttack(getAttack() + 1);
        System.out.println(getName() + " is eating: " + food);
        charged = true;
    }

    @Override
    public void attack() {
        if (charged) {
            System.out.println("Charge!");
        } else {
            System.out.println(getName() + " is not charged for an attack...");
        }
        charged = false;
    }

    public void thunder() {
        if (charged) {
            int totalAttack = getAttack() + electricPower;
            System.out.println(getName() + " attacks with " + totalAttack + " attack points.");
        } else {
            System.out.println(getName() + " is not charged for an attack...");
        }
        charged = false;
    }

    public boolean isCharged() {
        return charged;
    }

    public void setCharged(boolean charged) {
        this.charged = charged;
    }

    public int getElectricPower() {
        return electricPower;
    }

    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }
}
