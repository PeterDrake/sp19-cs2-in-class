import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {
    @Test
    void remembersName(){
        Weapon w = new Weapon("sword", "iron, embedded with jewels", 5);
        assertEquals("sword", w.getName());
    }

    @Test
    void remembersDescription(){
        Weapon w = new Weapon("sword", "iron, embedded with jewels", 5);
        assertEquals("iron, embedded with jewels", w.getDescription());
    }
    @Test
    void remembersPower(){
        Weapon w = new Weapon("sword", "iron, embedded with jewels", 5);
        assertEquals(5, w.getPower());
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

    @Test
    void equalsWorks(){
        Weapon a = new Weapon("axe", "steel", 1);
        Weapon b = new Weapon("axe", "steel", 1);
        Weapon c = b;
        assertEquals(a,b);
        assertEquals(b,c);
    }

    @Test
    void getterWorks(){
        Weapon w = new Weapon("sword", "iron, embedded with jewels", 5);
        assertEquals("sword", w.getName());
    }

    @Test
    void setterWorks(){
        Weapon w = new Weapon("sword", "iron, embedded with jewels", 5);
        w.setName("excaliber");
        assertEquals("excaliber",w.getName());
    }

}