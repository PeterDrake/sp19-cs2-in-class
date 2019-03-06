import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {
    @Test
    void remembersName(){
        Weapon w = new Weapon("sword", "iron, embedded with jewels", 5);
        assertEquals("sword", w.name);
    }

    @Test
    void remembersDescription(){
        Weapon w = new Weapon("sword", "iron, embedded with jewels", 5);
        assertEquals("iron, embedded with jewels", w.description);
    }
    @Test
    void remembersPower(){
        Weapon w = new Weapon("sword", "iron, embedded with jewels", 5);
        assertEquals(5, w.power);
    }

    @Test
    void swingProducesReasonableValue(){
        Weapon w = new Weapon("sword", "iron, embedded with jewels", 5);
        int value = w.swing();
        assertTrue(value >= 4);
        assertTrue(value <= 6);
    }

    @Test
    void differentWeaponsCanHaveDifferentNames(){
        Weapon w = new Weapon("sword", "iron, embedded with jewels", 5);
        Weapon a = new Weapon("axe", "steel", 1);
        int value = w.swing();
        assertTrue(value >= 4);
    }

}