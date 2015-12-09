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
public class DoublyLinkedListNode {

    private String entry;
    private DoublyLinkedListNode next;
    private DoublyLinkedListNode prev;

    public DoublyLinkedListNode(String value, DoublyLinkedListNode prevNode) {
        this.entry = value;
        this.next = null;
        this.prev = prevNode;
    }

    public DoublyLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode nextNode) {
        this.next = nextNode;
    }

    public String getEntry() {
        return entry;
    }
    
    
    
    
} // EOF

