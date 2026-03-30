package MODULE13;

class ElementNode {
    int dataValue;
    ElementNode leftLink, rightLink;

    ElementNode(int val) {
        dataValue = val;
        leftLink = rightLink = null;
    }
}

public class BinarySearchTreeDeletion {
    ElementNode start;

    ElementNode addElement(ElementNode node, int val) {
        if (node == null)
            return new ElementNode(val);

        if (val < node.dataValue)
            node.leftLink = addElement(node.leftLink, val);
        else
            node.rightLink = addElement(node.rightLink, val);

        return node;
    }

    ElementNode removeElement(ElementNode node, int key) {
        if (node == null)
            return null;

        if (key < node.dataValue)
            node.leftLink = removeElement(node.leftLink, key);
        else if (key > node.dataValue)
            node.rightLink = removeElement(node.rightLink, key);
        else {
            if (node.leftLink == null)
                return node.rightLink;
            else if (node.rightLink == null)
                return node.leftLink;

            ElementNode temp = getMinimum(node.rightLink);
            node.dataValue = temp.dataValue;
            node.rightLink = removeElement(node.rightLink, temp.dataValue);
        }
        return node;
    }

    ElementNode getMinimum(ElementNode node) {
        while (node.leftLink != null)
            node = node.leftLink;
        return node;
    }

    void displayInorder(ElementNode node) {
        if (node != null) {
            displayInorder(node.leftLink);
            System.out.print(node.dataValue + " ");
            displayInorder(node.rightLink);
        }
    }

    public static void main(String[] args) {
        BinarySearchTreeDeletion tree = new BinarySearchTreeDeletion();

        tree.start = tree.addElement(tree.start, 50);
        tree.addElement(tree.start, 30);
        tree.addElement(tree.start, 70);
        tree.addElement(tree.start, 20);
        tree.addElement(tree.start, 40);
        tree.addElement(tree.start, 60);
        tree.addElement(tree.start, 80);

        tree.start = tree.removeElement(tree.start, 30);

        tree.displayInorder(tree.start);
    }
}

