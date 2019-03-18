public class Monster {
    private String name;
    private int strength;

    public Monster(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString(){
        return name;
    }
}
