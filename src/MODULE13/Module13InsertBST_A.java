package MODULE13;

class NodeA {
    int data;
    NodeA left, right;

    NodeA(int value) {
        data = value;
        left = right = null;
    }
}

public class Module13InsertBST_A {
    NodeA root;

    NodeA insert(NodeA node, int value) {
        if (node == null)
            return new NodeA(value);

        if (value < node.data)
            node.left = insert(node.left, value);
        else
            node.right = insert(node.right, value);

        return node;
    }

    public static void main(String[] args) {
        Module13InsertBST_A tree = new Module13InsertBST_A();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);
    }
}
