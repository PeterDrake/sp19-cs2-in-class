public class Adventure {
    private Room currentRoom;

    public static void main(String[] args) {
        new Adventure().run();
    }

    public void run(){
        while (true) {
            StdOut.println(currentRoom);
            String command = StdIn.readLine().toLowerCase();
            if(command.equals("look")){
                StdOut.println(currentRoom.getDescription());
            }
            else {
                currentRoom = currentRoom.getExit(command);
            }
        }
    }

    public Adventure(){
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
        lair.addExit("west",hall);
    }
}
