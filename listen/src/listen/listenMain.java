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
public class listenMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        LinkedList liste = new LinkedList();
//        liste.add(1);
//        liste.add(2);
//        liste.add(3);
//        
//        int size = liste.size();
//        //size = liste.sizefor();
//        System.out.println(size);
//        
//        int sum = liste.sum();
//        System.out.println(sum);
//        System.out.println(" ");
//        liste.printList();
//        System.out.println(" ");
//        liste.printReverseList();

//        LinkedList liste = new LinkedList();
//        for (int i = 1; i <= 8; i++) {
//            liste.add(i);
//        }
        //liste.remove(5);
        //liste.printList();
//        boolean contains = liste.contains(5);
//        System.out.println(contains);
        //int wert = liste.getiterativ(5);
        //System.out.println(wert);
//        LinkedList subList = liste.subList(3, 6);
//        subList.printList();
//        for (int i = 0; i < liste.size(); i++) {
//            System.out.println(liste.getiterativ(i));
//        }
//        int size = liste.size();
//        System.out.println(size);
//        SortedList sort = new SortedList();
//        sort.add(2);
//        sort.add(8);
//        sort.add(3);
//        
//        //sort.printList();
//        System.out.println(" ");
//        
//        sort.add(5);
//        //sort.printList();
//        
//        boolean enth = sort.contains(8);
//        System.out.println(enth);
//        BinaryTreeNode acht = new BinaryTreeNode(8);
//        BinaryTreeNode vier = new BinaryTreeNode(4);
//        BinaryTreeNode fuenf = new BinaryTreeNode(5);
//        BinaryTreeNode neun = new BinaryTreeNode(9);
//        BinaryTreeNode sechs = new BinaryTreeNode(6, null, fuenf);
//        BinaryTreeNode eins = new BinaryTreeNode(1, vier, acht);
//        BinaryTreeNode zwei = new BinaryTreeNode(2, neun, sechs);
//        BinaryTreeNode sieben = new BinaryTreeNode(7, zwei, eins);
//        BinaryTree t = new BinaryTree(sieben);
        
        
        
                
        //t.printPreorder();
        //System.out.println("");
        //System.out.println("das war preorder");
//        t.printInorder();
//        System.out.println("das war inorder");
//        t.printPostorder();
//        System.out.println("das war postorder");
        
        BinaryTreeNode root = new BinaryTreeNode();
        BinarySearchTree t = new BinarySearchTree(root);
        t.add(10);
        t.add(20);
        t.add(5);
        
        
        
        boolean contains = t.contains(10);
        System.out.println(contains);
        
        t.printInorder();
        
    }

}
