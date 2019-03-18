import java.util.ArrayList;

public class Adventure {
    private Room currentRoom;
    private ArrayList<Object> inventory;

    public static void main(String[] args) {
        new Adventure().run();
    }

    public void run() {
        while (true) {
            StdOut.println(currentRoom);
            String command = StdIn.readLine().toLowerCase();
            if (command.equals("look")) {
                StdOut.println(currentRoom.getDescription());
            } else if (command.equals("inventory")) {
                StdOut.println(inventoryToString());
            } else if (currentRoom.getTreasure() != null && command.equals(currentRoom.getTreasure().getName())) {
                if (currentRoom.getMonster() == null) {
                    pickUp(currentRoom.getTreasure());
                    if (command.equals("ruby")) {
                        StdOut.println("You win!");
                        return;
                    }
                } else {
                    StdOut.println("You can't do that with unfriendlies about.");
                }
            }
            else if (currentRoom.getWeapon() != null && command.equals(currentRoom.getWeapon().getName())) {
                if (currentRoom.getMonster() == null) {
                    pickUp(currentRoom.getWeapon());
                } else {
                    StdOut.println("You can't do that with unfriendlies about.");
                }
            }
            else if(currentRoom.getMonster() != null && command.equals(currentRoom.getMonster().getName())) {
                for (Object item : inventory) {
                    if (item.toString().equals("sword")){
                        StdOut.println("You have slain the dragon!");
                        currentRoom.setMonster(null);
                    }
                }
                if(currentRoom.getMonster() != null) {
                    StdOut.println("You ineffectively pummel the monster with your fists.");
                }
            }
            else {
                currentRoom = currentRoom.getExit(command);
            }
        }
    }

    public Adventure() {
        Room entry = new Room("Entry", "You are at the cave entrance");
        Room hall = new Room("Hall", "You are in the hall");
        Room armory = new Room("Armory", "You are in the armory");
        Room lair = new Room("Lair", "You are in the lair");
        currentRoom = entry;
        entry.addExit("north", hall);
        hall.addExit("south", entry);
        hall.addExit("west", armory);
        hall.addExit("east", lair);
        armory.addExit("east", hall);
        lair.addExit("west", hall);
        hall.addTreasure(new Treasure("coin"));
        inventory = new ArrayList<Object>();
        lair.addTreasure(new Treasure("ruby"));
        lair.addMonster(new Monster("dragon", 3));
        armory.addWeapon(new Weapon("sword", "this is a sword", 10));
    }

    public void pickUp(Treasure t) {
        inventory.add(t);
        currentRoom.setTreasure(null);
    }

    public void pickUp(Weapon w){
        inventory.add(w);
        currentRoom.setWeapon(null);
    }

    public String inventoryToString() {
        return inventory.toString();
    }
}
