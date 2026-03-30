package MODULE13;

class CheckNode {
    int value;
    CheckNode leftPtr, rightPtr;

    CheckNode(int val) {
        value = val;
        leftPtr = rightPtr = null;
    }
}

public class ValidateBST {
    CheckNode rootRef;

    CheckNode insertNode(CheckNode node, int val) {
        if (node == null)
            return new CheckNode(val);

        if (val < node.value)
            node.leftPtr = insertNode(node.leftPtr, val);
        else
            node.rightPtr = insertNode(node.rightPtr, val);

        return node;
    }

    boolean isValid(CheckNode node, int min, int max) {
        if (node == null)
            return true;

        if (node.value <= min || node.value >= max)
            return false;

        return isValid(node.leftPtr, min, node.value) &&
                isValid(node.rightPtr, node.value, max);
    }

    public static void main(String[] args) {
        ValidateBST tree = new ValidateBST();

        tree.rootRef = tree.insertNode(tree.rootRef, 50);
        tree.insertNode(tree.rootRef, 30);
        tree.insertNode(tree.rootRef, 70);
        tree.insertNode(tree.rootRef, 20);
        tree.insertNode(tree.rootRef, 40);
        tree.insertNode(tree.rootRef, 60);
        tree.insertNode(tree.rootRef, 80);

        System.out.println(tree.isValid(tree.rootRef, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
