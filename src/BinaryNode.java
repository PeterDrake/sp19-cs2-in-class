public class BinaryNode<T> {

    private T item;

    private BinaryNode<T> left;

    private BinaryNode<T> right;

    public BinaryNode(T item, BinaryNode<T> left, BinaryNode<T> right) {
        this.item = item;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }

}
