public class TreeExample {

    public static void main(String[] args) {
        BinaryNode<Character> g = new BinaryNode<>('g');
        BinaryNode<Character> f = new BinaryNode<>('f');
        BinaryNode<Character> a = new BinaryNode<>('a');
        BinaryNode<Character> c = new BinaryNode<>('c', null, g);
        BinaryNode<Character> e = new BinaryNode<>('e');
        BinaryNode<Character> h = new BinaryNode<>('h', f, a);
        BinaryNode<Character> b = new BinaryNode<>('b', c, e);
        BinaryNode<Character> d = new BinaryNode<>('d', h, b);
        BinaryTree<Character> tree = new BinaryTree<>(d);
//        tree.traverseBreadthFirst();
//        tree.traverseDepthFirst();
//        tree.traversePreorder();
        tree.traverseInorder();
//        tree.traversePostorder();
    }

}
