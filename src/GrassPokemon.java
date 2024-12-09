public class GrassPokemon extends Pokemon{
    private int leaveAmount;
    private String favoritePlant;

    public GrassPokemon(String name, int hp, int attack, String sound, int leaveAmount, String favoritePlant) {
        super(name, hp, attack, sound);
        this.leaveAmount = leaveAmount;
        this.favoritePlant = favoritePlant;
    }

    @Override
    public void eats(String food) {
        leaveAmount += 3;
        setAttack(getAttack() + 2);
        System.out.println(getName() + " is eating " + food + " and gets 3 more leaves");
    }

    @Override
    public void attack() {
        if (leaveAmount > 10) {
            System.out.println("Attack!");
        } else {
            System.out.println("Not enough leaves...");
        }
    }

    public void poop() {
        leaveAmount -= 2;
        System.out.println(getName() + " ate a delicious meal of " + favoritePlant + " and needed to poop... He is now some leaves lighter");
    }

    public int getLeaveAmount() {
        return leaveAmount;
    }

    public void setLeaveAmount(int leaveAmount) {
        this.leaveAmount = leaveAmount;
    }

    public String getFavoritePlant() {
        return favoritePlant;
    }

    public void setFavoritePlant(String favoritePlant) {
        this.favoritePlant = favoritePlant;
    }
}
