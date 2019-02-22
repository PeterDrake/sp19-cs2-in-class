public class Lists {
    public static void main(String[] args) {
        Node list = new Node();
        list.item = 5;
        list.next = new Node();
        list.next.item = 8;
        Node n = new Node();
        n.item = 6;
        n.next = list;
        list = n;
        StdOut.println(toString(list));
    }
    static String toString(Node list){
        if(list == null){
            return "";
        }
        return list.item + "," + toString(list.next);
    }
    static int length(Node list){
        if(list == null){
            return 0;
        }
        return length(list.next) + 1;
    }
}
