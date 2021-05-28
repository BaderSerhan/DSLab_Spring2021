/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import stack.*;

/**
 *
 * @author ahmadkassem
 */
public class Node {

    private int element;
    private Node next;

    public Node(int e) {
        this.element = e;
        this.next = null;
    }

    public int getElement() {
        return this.element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
