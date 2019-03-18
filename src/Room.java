import java.util.HashMap;

public class Room {
    private String name;
    private String description;
    private HashMap<String,Room> exits;
    private Treasure treasure;
    private Monster monster;
    private Weapon weapon;

    public Room(String n, String d){
        this.name = n;
        this.description = d;
        this.exits = new HashMap<String, Room>();

    }

    public void addExit(String direction, Room e) {
        exits.put(direction,e);
    }

    public String getName() {
        return name;
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public String getDescription() {
        String result = description + "\n";
        if (treasure != null) {
            result += "There's a " + treasure.getName() + " here\n";
        }
        if (monster != null) {
            result += "There's a " + monster.getName() + " here\n";
        }
        if(weapon != null){
            result += "There's a " + weapon.getName() + " here\n";
        }
        return result;
    }

    @Override
    public String toString(){
        return name;
    }

    public void addTreasure(Treasure t) {
        treasure = t;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public void addMonster(Monster m) {
        monster = m;
    }

    public Monster getMonster() {
        return monster;
    }

    public void addWeapon(Weapon w) {
        weapon = w;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon w) {
        this.weapon = w;
    }

    public void setMonster(Monster m) {
        this.monster = m;
    }
}
