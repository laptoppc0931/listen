/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listen;

/**
 *
 * @author v990461
 */
public class BinarySearchTree {

    private BinaryTreeNode root;

    public BinarySearchTree(BinaryTreeNode root) {
        this.root = root;
    }

    public void add(int x) {
        // Wenn der Baum leer ist, ist das Element die Wurzel
        if (root == null) {
            root = new BinaryTreeNode(x);
        } else {
            // insert rekursiv
            add(root, x);
        }
    }

    private void add(BinaryTreeNode tn, int x) {
        // vergleich mit aktuellem Eintrag
        if (x < tn.getEntry()) {
            // im linken Teilbaum
            if (tn.getLeftChild() == null) {
                // Basisfall 1: im linken Teilbaum einfügen
                tn.setLeftChild(new BinaryTreeNode(x));
            } else {
                // rekursives einfügen
                add(tn.getLeftChild(), x);
            }
        } else {
            // im rechten Teilbaum
            if (tn.getRightChild() == null) {
                // Basisfall 1: im rechten Teilbaum einfügen
                tn.setRightChild(new BinaryTreeNode(x));
            } else {
                // rekursives einfügen
                add(tn.getRightChild(), x);
            }
        }
    }

    public boolean contains(int x) {
        return contains(root, x);
    }

    private boolean contains(BinaryTreeNode tn, int x) {
        // Basisfall 1: keine weiteren Knoten
        if (tn == null) {
            return false;
        }
        // Basisfall 2: Wert gefunden
        if (tn.getEntry() == x) {
            return true;
        }

        if (x < tn.getEntry()) {
            return contains(tn.getLeftChild(), x);
        }
        
        if (x > tn.getEntry()) {
            return contains(tn.getRightChild(), x);
        }
        return false;
    }

    public void printInorder() {
        printInorder(root);
    }

    private void printInorder(BinaryTreeNode tn) {
        if (tn == null) {
            return;
        }
        // zuerst linker Nachfolger
        printInorder(tn.getLeftChild());
        // danach die Wurzel
        System.out.println(tn.getEntry() + " ");
        // zuletzt den rechten Nachfolger
        printInorder(tn.getRightChild());
    }

}
