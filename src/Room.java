import java.util.HashMap;

public class Room {
    private String name;
    private String description;
    private HashMap<String,Room> exits;

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
        return description;
    }

    @Override
    public String toString(){
        return name;
    }
}
