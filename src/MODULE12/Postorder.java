package MODULE12;
 class P4_Node {
    int data;
    P4_Node left, right;

    P4_Node(int value) {
        data = value;
        left = right = null;
    }
}
 public class Postorder {
    P4_Node root;

    void postorder(P4_Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        Postorder tree = new Postorder();

        tree.root = new P4_Node(1);
        tree.root.left = new P4_Node(2);
        tree.root.right = new P4_Node(3);
        tree.root.left.left = new P4_Node(4);
        tree.root.left.right = new P4_Node(5);

        tree.postorder(tree.root);
    }
}

