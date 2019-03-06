public class Weapon {
    String name;
    String description;
    int power;


    Weapon(String n, String d, int p){
        this.name = n;
        this.description = d;
        this.power = p;
    }

    int swing() {
        int roll = StdRandom.uniform(-1, 2);
        return this.power + roll;
    }
}
