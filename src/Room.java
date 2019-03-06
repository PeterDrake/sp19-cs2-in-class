public class Room {
    String name;
    String description;
    String[] exits;
    Room[] neighbors;
    int exitCount;

    Room(String n, String d, int numberOfExits){
        this.name = n;
        this.description = d;
        this.exits = new String[numberOfExits];
        this.neighbors = new Room[numberOfExits];
    }

    void addExit(String direction, Room e) {
        exits[exitCount] = direction;
        neighbors[exitCount] = e;
        exitCount++;
    }

    Room getExit(String direction) {
        for (int i = 0; i < exits.length; i++) {
            if (exits[i].equals(direction)){
                return neighbors[i];
            }
        }
        return null;
    }
}
