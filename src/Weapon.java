import java.util.Objects;

public class Weapon {
    private String name;
    private String description;
    private int power;


    Weapon(String n, String d, int p){
        this.name = n;
        this.description = d;
        this.power = p;
    }

    int swing() {
        int roll = StdRandom.uniform(-1, 2);
        return this.power + roll;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public String getDescription(){
        return this.description;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon = (Weapon) o;
        return power == weapon.power &&
                Objects.equals(name, weapon.name) &&
                Objects.equals(description, weapon.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, power);
    }
}
