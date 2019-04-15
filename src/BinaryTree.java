import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree<T> {

    private BinaryNode<T> root;

    public BinaryTree(BinaryNode<T> root) {
        this.root = root;
    }

    public void traverseBreadthFirst() {
        if (root != null) {
            Queue<BinaryNode<T>> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                BinaryNode<T> n = q.remove();
                StdOut.print(n.getItem());
                if (n.getLeft() != null) {
                    q.add(n.getLeft());
                }
                if (n.getRight() != null) {
                    q.add(n.getRight());
                }
            }
        }
    }

    public void traverseDepthFirst() {
        if (root != null) {
            Stack<BinaryNode<T>> s = new Stack<>();
            s.push(root);
            while (!s.isEmpty()) {
                BinaryNode<T> n = s.pop();
                StdOut.print(n.getItem());
                if (n.getRight() != null) {
                    s.push(n.getRight());
                }
                if (n.getLeft() != null) {
                    s.push(n.getLeft());
                }
            }
        }
    }

    public void traversePreorder() {
        traversePreorder(root);
    }

    public void traversePreorder(BinaryNode<T> node) {
        if (node != null) {
            StdOut.print(node.getItem());
            traversePreorder(node.getLeft());
            traversePreorder(node.getRight());
        }
    }

    public void traverseInorder() {
        traverseInorder(root);
    }

    public void traverseInorder(BinaryNode<T> node) {
        if (node != null) {
            traverseInorder(node.getLeft());
            StdOut.print(node.getItem());
            traverseInorder(node.getRight());
        }
    }

    public void traversePostorder() {
        traversePostorder(root);
    }

    public void traversePostorder(BinaryNode<T> node) {
        if (node != null) {
            traversePostorder(node.getLeft());
            traversePostorder(node.getRight());
            StdOut.print(node.getItem());
        }
    }

}
