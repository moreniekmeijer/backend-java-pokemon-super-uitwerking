public abstract class Pokemon {
    private int hp;
    private int attack;
    private String sound;

    public Pokemon(int hp, int attack, String sound) {
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

    public void setSound(String sound) {
        this.sound = sound;
    }

    public abstract void eats(String food);

    public abstract void attack();

}


