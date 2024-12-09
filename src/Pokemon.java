public abstract class Pokemon {
    private String name;
    private int hp;
    private int attack;
    private String sound;

    public Pokemon(String name, int hp, int attack, String sound) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.sound = sound;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getSound() {
        return sound;
    }

    public String getName() {
        return name;
    }

    public abstract void eats(String food);

    public abstract void attack();

    public void makeNoise() {
        System.out.println(getSound());
    }

    public void printHP() {
        System.out.println(name + " has " + hp + " health points.");
    }

    public void printAttack() {
        System.out.println(name + " has an attack of " + attack);
    }
}


