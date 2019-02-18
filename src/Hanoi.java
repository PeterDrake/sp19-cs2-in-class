public class Hanoi {
    public static void main(String[] args) {
        hanoi("a", "b", "c", 3);
    }

    private static void hanoi4(String start, String spare, String end) {
        hanoi3(start, end, spare);
        StdOut.println(start + "-->" + end);
        hanoi3(spare, start, end);

    }

    private static void hanoi3(String start, String spare, String end) {
        hanoi2(start, end, spare);
        StdOut.println(start + "-->" + end);
        hanoi2(spare, start, end);
    }

    private static void hanoi2(String start, String spare, String end) {
        hanoi1(start, end, spare);
        StdOut.println(start + "-->" + end);
        hanoi1(spare, start, end);
    }

    private static void hanoi1(String start, String spare, String end) {
        StdOut.println(start + "-->" + end);
    }
    private static void hanoi(String start, String spare, String end, int n){
        if(n==1){
            StdOut.println(start + "-->" + end);
        }
        else {
            hanoi(start, end, spare, n-1);
            StdOut.println(start + "-->" + end);
            hanoi(spare, start, end, n-1);
        }
    }
}
