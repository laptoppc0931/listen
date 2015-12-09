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
public class LinkedList {

    ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int value) {
        ListNode newNode = new ListNode(value, this.head);
        this.head = newNode;
    }

    public int size() {
        return size(this.head);
//        ListNode current = this.head;
//        int count = 0;
//        while (current != null) {
//            count++;
//            current = current.getNext();
//        }
//        return count;
    }

    public int sizefor() {
        int count = 0;
        for (ListNode current = this.head; current != null; current = current.getNext()) {
            count++;

        }
        return count;
    }

    public boolean containsiterativ(int value) {
        ListNode current = this.head;
        while (current != null) {
            if (current.getEntry() == value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int sum() {
        return sum(this.head);
//        ListNode current = this.head;
//        int sum = 0;
//        while (current != null) {
//            sum += current.getEntry();
//            current = current.getNext();
//        }
//        return sum;
    }

    private int size(ListNode node) {       // 1
        if (node == null) {                 // 2
            return 0;                       // 3
        }                                   // 4
        return size(node.getNext()) + 1;    // 5
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

    public void remove(int value) {
        this.head = remove(this.head, value);
    }

    private ListNode remove(ListNode node, int value) {     // 1
        if (node == null) {                                 // 2
            return null;                                    // 3
        }                                                   // 4
        if (node.getEntry() == value) {                     // 5
            return node.getNext();                          // 6
        }                                                   // 7
        node.setNext(remove(node.getNext(), value));        // 8
        //remove(node.getNext(), value);
        return node;                                        // 9
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
        return contains(node.getNext(), value);
    }

    public void add(int index, int value) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("index muss im "
                    + "Bereich von 0 bis " + size() + " liegen.");
        }
        this.head = add(this.head, index, value);
    }

    private ListNode add(ListNode node,
            int steps, int value) { // 1
        if (steps == 0) { // 2
            return new ListNode(value, node); // 3
        } // 4
        node.setNext(add(node.getNext(), steps - 1, value)); // 5
        return node; // 6
    }

    public int getrekursiv(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index muss im "
                    + "Bereich von 0 bis " + size() + " liegen.");

        }
        return getrekursiv(this.head, index).getEntry();

    }

    private ListNode getrekursiv(ListNode node, int steps) {
        if (steps == 0) {
            return node;
        }
        return getrekursiv(node.getNext(), steps - 1);
    }

    public int getiterativ(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index muss im "
                    + "Bereich von 0 bis " + size() + " liegen.");
        }
        ListNode current = this.head;
        for (int i = 1; i <= index; i++) {
            current = current.getNext();
        }
        return current.getEntry();
    }

    public void clear() {
        this.head = null;
    }

    public boolean isEmpty() {
        return (size() == 0);
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

    public LinkedList mergeSort() {
        int length = this.size();
        if (length <= 1) {
            return this;
        }
        LinkedList leftSorted
                = this.subList(0, length / 2).mergeSort();
        LinkedList rightSorted
                = this.subList(length / 2, length).mergeSort();
        leftSorted.mergeWith(rightSorted);
        return leftSorted;
    }

    private void mergeWith(LinkedList otherList) {
        if (otherList.isEmpty()) {
            return;
        }
        if (this.isEmpty()) {
            this.head = otherList.head;
            return;
        }
        if (otherList.head.getEntry() <= this.head.getEntry()) {
            int first = otherList.removeFirst();
            this.mergeWith(otherList);
            this.add(first);
            return;
        }
        int first = this.removeFirst();
        otherList.mergeWith(this);
        otherList.add(first);
        this.head = otherList.head;
    }

    private int removeFirst() {
        if (this.head == null) {
            throw new IndexOutOfBoundsException("leere Liste");
        }
        int first = this.head.getEntry();
        this.head = this.head.getNext();
        return first;
    }

} //EOF
