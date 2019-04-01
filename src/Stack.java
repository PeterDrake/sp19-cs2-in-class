public interface Stack<T> {

    /** Add item to the top of this stack. */
    public void push(T item);

    /** Remove and return the top item on this stack. */
    public T pop();

    /** Return true if this stack is empty. */
    public boolean isEmpty();

}
