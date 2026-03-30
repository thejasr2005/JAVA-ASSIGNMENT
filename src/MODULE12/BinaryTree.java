package MODULE12;

class P1_Node {
    int data;
    P1_Node left, right;

    P1_Node(int value) {
        data = value;
        left = right = null;
    }
}
 public class BinaryTree {
    P1_Node root;

    void inorder(P1_Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new P1_Node(1);
        tree.root.left = new P1_Node(2);
        tree.root.right = new P1_Node(3);
        tree.root.left.left = new P1_Node(4);
        tree.root.left.right = new P1_Node(5);

        tree.inorder(tree.root);
    }
}


