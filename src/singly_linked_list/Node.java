/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singly_linked_list;

/**
 *
 * @author ahmadkassem
 */
public class Node {

    private int e;
    private Node next;

    public Node(int e) {
        this.e = e;
        this.next = null;
    }

    public int getE() {
        return this.e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
