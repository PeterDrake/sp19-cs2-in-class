public class LinkedStack<T> implements Stack<T> {

    private class Node {

        T item;

        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

    }

    private Node top;

    @Override
    public void push(T item) {
        top = new Node(item, top);
    }

    @Override
    public T pop() {
        T result = top.item;
        top = top.next;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        String result = "";
        for (Node n = top; n != null; n = n.next) {
            result = n.item + " " + result;
        }
        return result;
    }
}
