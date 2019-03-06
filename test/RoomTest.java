import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void remembersName(){
        Room r = new Room("Hall", "It's a hall...", 3);
        assertEquals("Hall", r.name);
    }

    @Test
    void remembersExit(){
        Room r = new Room("Hall", "It's a hall...", 3);
        Room e = new Room("Entrance", "The entrance?", 1);
        r.addExit("south", e);
        assertEquals(e, r.getExit("south"));
    }

}