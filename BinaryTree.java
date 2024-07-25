/**
 * Node
 */
class Node {
    int data;
    Node leftNode, rightNode;

    Node(int value) {
        this.data = value;
        // leftNode = rightNode = null;
    }
}

public class BinaryTree {
    Node root;

    // BinaryTree() {
    // root = null;
    // }

    // now here are two ways to implement this binary tree either we keep sending
    // the root node always in insert function. (gfg site answer)
    // Or we can create one method here which will do that for us ( telusko answer)
    // here we will follow telusko answer because it will make our code more
    // readable.
    public void insertNode(int value) {
        root = insertNodeRecursively(root, value);
    }

    public Node insertNodeRecursively(Node root, int value) {
        if (root == null) {
            root = new Node(value);
        } else if (root.data > value) {
            root.leftNode = insertNodeRecursively(root.leftNode, value);
        } else if (root.data <= value) {
            root.rightNode = insertNodeRecursively(root.rightNode, value);
        }

        return root;
    }

    public void preOrdertraversal() {
        preOrdertraversalRec(root);
    }

    public void preOrdertraversalRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inOrdertraversalRec(root.leftNode);
            inOrdertraversalRec(root.rightNode);
        }
    }

    public void inOrdertraversal() {
        inOrdertraversalRec(root);
    }

    public void inOrdertraversalRec(Node root) {
        if (root != null) {
            inOrdertraversalRec(root.leftNode);
            System.out.print(root.data + " ");
            inOrdertraversalRec(root.rightNode);
        }
    }

    public void postOrdertraversal() {
        postOrdertraversalRec(root);
    }

    public void postOrdertraversalRec(Node root) {
        if (root != null) {
            inOrdertraversalRec(root.leftNode);
            inOrdertraversalRec(root.rightNode);
            System.out.print(root.data + " ");
        }
    }
}
