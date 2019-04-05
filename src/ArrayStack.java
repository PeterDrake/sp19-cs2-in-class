import java.util.Iterator;

public class ArrayStack<T> implements Stack<T>, Iterable<T> {

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
        ArrayStack<Integer> s = new ArrayStack<Integer>();
        s.push(4);
        s.push(3);
        s.push(9);
        Iterator<Integer> iter = s.iterator();
        while (iter.hasNext()) {
            Integer i = iter.next();
            StdOut.println(i);
        }
//        for (Integer i : s) {
//            StdOut.println(i);
//        }
    }

    private class ArrayStackIterator implements Iterator<T> {

        private int index;

        public ArrayStackIterator() {
            index = size - 1;
        }

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public T next() {
            T result = data[index];
            index--;
            return result;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayStackIterator();
    }
}
