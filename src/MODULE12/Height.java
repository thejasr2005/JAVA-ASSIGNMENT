package MODULE12;

class P3_Node {
    int data;
    P3_Node left, right;

    P3_Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Height {
    P3_Node root;

    int height(P3_Node node) {
        if (node == null)
            return -1;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Height tree = new Height();

        tree.root = new P3_Node(1);
        tree.root.left = new P3_Node(2);
        tree.root.right = new P3_Node(3);
        tree.root.left.left = new P3_Node(4);
        tree.root.left.right = new P3_Node(5);

        System.out.println(tree.height(tree.root));
    }
}

