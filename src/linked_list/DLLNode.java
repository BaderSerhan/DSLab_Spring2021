/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

/**
 *
 * @author ahmadkassem
 */
public class DLLNode {

    private int element;
    private DLLNode next;
    private DLLNode previous;

    public DLLNode(int e) {
        this.element = e;
        this.next = null;
        this.previous = null;
    }

    public int getElement() {
        return this.element;
    }

    public void setElement(int e) {
        this.element = e;
    }

    public DLLNode getNext() {
        return this.next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public DLLNode getPrevious() {
        return previous;
    }

    public void setPrevious(DLLNode previous) {
        this.previous = previous;
    }
}
