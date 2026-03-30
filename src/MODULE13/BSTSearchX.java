package MODULE13;

class TreeNodeX {
    int value;
    TreeNodeX leftChild, rightChild;

    TreeNodeX(int val) {
        value = val;
        leftChild = rightChild = null;
    }
}

public class BSTSearchX {
    TreeNodeX rootNode;

    TreeNodeX add(TreeNodeX node, int val) {
        if (node == null)
            return new TreeNodeX(val);

        if (val < node.value)
            node.leftChild = add(node.leftChild, val);
        else
            node.rightChild = add(node.rightChild, val);

        return node;
    }

    boolean find(TreeNodeX node, int key) {
        if (node == null)
            return false;
        if (node.value == key)
            return true;
        if (key < node.value)
            return find(node.leftChild, key);
        return find(node.rightChild, key);
    }

    public static void main(String[] args) {
        BSTSearchX tree = new BSTSearchX();

        tree.rootNode = tree.add(tree.rootNode, 50);
        tree.add(tree.rootNode, 30);
        tree.add(tree.rootNode, 70);
        tree.add(tree.rootNode, 20);
        tree.add(tree.rootNode, 40);
        tree.add(tree.rootNode, 60);
        tree.add(tree.rootNode, 80);

        System.out.println(tree.find(tree.rootNode, 40));
    }
}

