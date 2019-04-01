public class ArrayStack<T> implements Stack<T> {

    private T[] data;

    private int size;

    public ArrayStack() {
        data = (T[])new Object[2];
    }

    @Override
    public void push(T item) {
        if (size == data.length) {
            T[] temp = (T[])new Object[data.length + 1];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[size] = item;
        size++;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += data[i] + " ";
        }
        return result;
    }

    @Override
    public T pop() {
        size--;
        return data[size];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new LinkedStack<Integer>();
        s.push(4);
        s.push(3);
        s.push(9);
        StdOut.println(s);
    }

}
