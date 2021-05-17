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
public class SLLNode {

    private int element;
    private SLLNode next;

    public SLLNode(int e) {
        this.element = e;
        this.next = null;
    }

    public int getElement() {
        return this.element;
    }

    public void setElement(int e) {
        this.element = e;
    }

    public SLLNode getNext() {
        return this.next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

}
