import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    void pushWorksWhenThereIsCapacity() {
        Stack s = new ArrayStack();
        s.push(5);
        s.push(8);
        assertEquals("5 8 ", s.toString()); // Top at right
    }

    @Test
    void popWorksWhenThereIsCapacity() {
        Stack s = new ArrayStack();
        s.push(5);
        s.push(8);
        assertEquals(8, s.pop());
    }

}
