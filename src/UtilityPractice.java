import java.util.*;

public class UtilityPractice {

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<Integer>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(15);
        numbers.add(16);
        numbers.add(23);
        numbers.add(42);
        numbers.remove(new Integer(16));
        StdOut.println(numbers);
    }

}
