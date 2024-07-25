public class treeUser {

    public static void main(String[] args) {
        BinaryTree firstTree = new BinaryTree();
        firstTree.insertNode(8);
        firstTree.insertNode(4);
        firstTree.insertNode(12);
        firstTree.insertNode(15);
        firstTree.insertNode(2);
        firstTree.insertNode(30);
        firstTree.insertNode(10);
        firstTree.insertNode(18);
        firstTree.insertNode(6);

        firstTree.preOrdertraversal();
        System.out.println();
        firstTree.inOrdertraversal();
        System.out.println();
        firstTree.postOrdertraversal();
        System.out.println();
    }
}
