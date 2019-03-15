import java.util.HashMap;

public class Room {
    private String name;
    private String description;
    private HashMap<String,Room> exits;
    private Treasure treasure;

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
}
