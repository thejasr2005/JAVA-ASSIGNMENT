package MODULE12;

class Node1 {
    int data;
    Node1 left, right;

    Node1(int value) {
        data = value;
        left = right = null;
    }
}
public class Preorder {
    Node1 root;

    void preorder(Node1 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void main(String[] args) {
        Preorder tree = new Preorder();

        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);

        tree.preorder(tree.root);
    }
}

