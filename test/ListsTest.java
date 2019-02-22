import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListsTest {

    @Test
    void findsLengthOfEmptyList() {
        assertEquals(0, Lists.length(null));
    }

    @Test
    void findsLengthOfNonEmptyList(){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        n1.next = n2;
        n2.next = n3;
        assertEquals(3 , Lists.length(n1));
    }
}