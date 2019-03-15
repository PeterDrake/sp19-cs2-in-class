import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdventureTest {
private Adventure a;

    @BeforeEach
    void setUp() {
        a = new Adventure();
    }

    @Test
    void remembersInventory() {
        a.pickUp(new Treasure("pearl"));
        a.pickUp(new Treasure("collectible plate"));
        assertEquals("[pearl, collectible plate]", a.inventoryToString());
    }
}