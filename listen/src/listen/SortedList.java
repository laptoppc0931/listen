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
public class SortedList {

    private ListNode head;

    public SortedList() {
        this.head = null;
    }

    public void add(int value) {
        this.head = add(this.head, value);
    }

    private ListNode add(ListNode node, int value) {
        if (node == null) {
            return new ListNode(value, node);
        }
        if (node.getEntry() > value) {
            return new ListNode(value, node);
        }
        node.setNext(add(node.getNext(), value));
        return node;
    }

//    public void remove(int value) {
//        this.head = remove(this.head, value);
//    }
//
//    private ListNode remove(ListNode node, int value) { // 1
//        if (node == null) { // 2
//            return null; // 3
//        } // 4
//        if (node.getEntry() > value) { // 5
//            return node; // 6
//        } // 7
//        if (node.getEntry() == value) { // 8
//            return node.getNext(); // 9
//        } // 10
//        node.setNext(remove(node.getNext(), value)); // 11
//        return node; // 12
//    }
    public int size() {
        return size(this.head);
    }

    private int size(ListNode node) {       // 1
        if (node == null) {                 // 2
            return 0;                       // 3
        }                                   // 4
        return size(node.getNext()) + 1;    // 5
    }

    public int sum() {
        return sum(this.head);
    }

    private int sum(ListNode node) {
        if (node == null) { //Basisfall
            return 0;
        }
        return node.getEntry() + sum(node.getNext());
    }

    public void printList() {
        printList(this.head);
    }

    private void printList(ListNode node) {
        if (node == null) {
            return;
        }
        node.print();
        //System.out.print(" ");
        printList(node.getNext());
    }

    public void printReverseList() {
        printReverseList(this.head);
    }

    private void printReverseList(ListNode node) {
        if (node == null) {
            return;
        }
        printReverseList(node.getNext());
        node.print();
        //System.out.println("");

    }

    public int get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index muss im "
                    + "Bereich von 0 bis " + size() + " liegen.");

        }
        return get(this.head, index).getEntry();

    }

    private ListNode get(ListNode node, int steps) {
        if (steps == 0) {
            return node;
        }
        return get(node.getNext(), steps - 1);
    }

    public void clear() {
        this.head = null;
    }

    public LinkedList subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= size() || toIndex < 0 || toIndex >= size()) {
            throw new IndexOutOfBoundsException("index muss im "
                    + "Bereich von 0 bis " + size() + " liegen.");
        }
        if (fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Index fehlerhaft!");
        }
        if (fromIndex > toIndex) {
            return null;
        }
        LinkedList list = new LinkedList();
        list.head = subList(this.head, fromIndex, toIndex - fromIndex);
        return list;
    }

    private ListNode subList(ListNode node, int steps, int size) {
        if (size == 0) {
            return null;
        }
        if (steps == 0) {
            ListNode subListNode = new ListNode(node.getEntry());
            subListNode.setNext(subList(node.getNext(), 0, size - 1));
            return subListNode;
        }
        return subList(node.getNext(), steps - 1, size);
    }

    public void remove(int value) {
        this.head = remove(this.head, value);
    }

    private ListNode remove(ListNode node, int value) { // 1
        if (node == null) { // 2
            return null; // 3
        } // 4
        if (node.getEntry() > value) { // 5
            return node; // 6
        } // 7
        if (node.getEntry() == value) { // 8
            return node.getNext(); // 9
        } // 10
        node.setNext(remove(node.getNext(), value)); // 11
        return node; // 12
    }

    public boolean contains(int value) {
        return contains(this.head, value);
    }

    private boolean contains(ListNode node, int value) {   
        if (node == null) {                                
            return false;                                  
        }                                                
        if (node.getEntry() == value) {                     
            return true;                                    
        }      
        if (node.getEntry() > value) {                      
            return false;                                   
        }  
        return contains(node.getNext(), value);             
    }

} // EOF
