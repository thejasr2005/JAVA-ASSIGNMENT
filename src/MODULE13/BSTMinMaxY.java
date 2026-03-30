package MODULE13;

class TreeNodeY {
    int value;
    TreeNodeY leftChild, rightChild;

    TreeNodeY(int val) {
        value = val;
        leftChild = rightChild = null;
    }
}

public class BSTMinMaxY {
    TreeNodeY rootNode;

    TreeNodeY insert(TreeNodeY node, int val) {
        if (node == null)
            return new TreeNodeY(val);

        if (val < node.value)
            node.leftChild = insert(node.leftChild, val);
        else
            node.rightChild = insert(node.rightChild, val);

        return node;
    }

    int getMin(TreeNodeY node) {
        while (node.leftChild != null)
            node = node.leftChild;
        return node.value;
    }

    int getMax(TreeNodeY node) {
        while (node.rightChild != null)
            node = node.rightChild;
        return node.value;
    }

    public static void main(String[] args) {
        BSTMinMaxY tree = new BSTMinMaxY();

        tree.rootNode = tree.insert(tree.rootNode, 50);
        tree.insert(tree.rootNode, 30);
        tree.insert(tree.rootNode, 70);
        tree.insert(tree.rootNode, 20);
        tree.insert(tree.rootNode, 40);
        tree.insert(tree.rootNode, 60);
        tree.insert(tree.rootNode, 80);

        System.out.println(tree.getMin(tree.rootNode));
        System.out.println(tree.getMax(tree.rootNode));
    }
}


