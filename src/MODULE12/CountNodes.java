package MODULE12;

class P2_Node {
    int data;
    P2_Node left, right;

    P2_Node(int value) {
        data = value;
        left = right = null;
    }
}
 public class CountNodes {
    P2_Node root;

    int countNodes(P2_Node node) {
        if (node == null)
            return 0;
        return countNodes(node.left) + countNodes(node.right) + 1;
    }

    public static void main(String[] args) {
        CountNodes tree = new CountNodes();

        tree.root = new P2_Node(1);
        tree.root.left = new P2_Node(2);
        tree.root.right = new P2_Node(3);
        tree.root.left.left = new P2_Node(4);
        tree.root.left.right = new P2_Node(5);

        System.out.println(tree.countNodes(tree.root));
    }
}

