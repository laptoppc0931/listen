package listen;

/**
 *
 * @author v990461
 */
public class BinaryTreeNode {

    private int entry;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public BinaryTreeNode(int e) {
        this.entry = e;
    }

    public BinaryTreeNode(int e, BinaryTreeNode left,
            BinaryTreeNode right) {
        this(e);
        this.leftChild = left;
        this.rightChild = right;
    }

    public int getEntry() {
        return entry;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }
    
    
}
