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
public class ListNode {

    private int entry;
    private ListNode next;

    public ListNode(int value) {
        this(value, null);
    }

    public ListNode(int value, ListNode nextNode) {
        this.entry = value;
        this.next = nextNode;
    }

    public void setEntry(int value) {
        this.entry = value;
    }

    public void setNext(ListNode nextNode) {
        this.next = nextNode;
    }

    public int getEntry() {
        return this.entry;
    }

    public ListNode getNext() {
        return this.next;
    }
    
    public void print() {
        System.out.println(this.entry);
    }
}
