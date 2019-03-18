import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void remembersName(){
        Room r = new Room("Hall", "It's a hall...");
        assertEquals("Hall", r.getName());
    }

    @Test
    void remembersExit(){
        Room r = new Room("Hall", "It's a hall...");
        Room e = new Room("Entrance", "The entrance?");
        r.addExit("south", e);
        assertEquals(e, r.getExit("south"));
    }

    @Test
    void remembersTreasure() {
        Room r = new Room("Hall", "It's a hall...");
        r.addTreasure(new Treasure("diamond"));
        String correct = "It's a hall...\nThere's a diamond here\n";
        assertEquals(correct, r.getDescription());
    }

    @Test
    void remembersMonster(){
        Room r = new Room("Hall", "It's a hall...");
        r.addTreasure(new Treasure("diamond"));
        r.addMonster(new Monster("dragon", 3));
        String correct = "It's a hall...\nThere's a diamond here\nThere's a dragon here\n";
        assertEquals(correct, r.getDescription());
    }
}