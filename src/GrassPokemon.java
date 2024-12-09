public class GrassPokemon extends Pokemon{
    private int leaveAmount;
    private String favoritePlant;

    public GrassPokemon(int hp, int attack, String sound, int leaveAmount, String favoritePlant) {
        super(hp, attack, sound);
        this.leaveAmount = leaveAmount;
        this.favoritePlant = favoritePlant;
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

    @Override
    public void eats(String food) {
        leaveAmount += 3;
        System.out.println("This Pokemon is eating " + food + " and gets 3 more leaves: " + getLeaveAmount());
    }

    @Override
    public void attack() {
        if (leaveAmount > 10) {
            System.out.println("Attack!");
        }

    }

    public void poop() {
        leaveAmount -= 2;
        System.out.println("This pokemon ate a delicious meal of " + favoritePlant + " and needed to poop... He is now some leaves lighter");
    }

}
