/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

/**
 *
 * @author bader
 */
public class DLL implements ListInterface {

    private DLLNode head;
    private DLLNode tail;
    private int size;

    public DLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
        //or return size == 0;
    }

    @Override
    public void makeEmpty() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int length() {
        return this.size;
    }

    public DLLNode getHead() {
        return this.head;
    }

    public DLLNode getTail() {
        return this.tail;
    }

    @Override
    public int indexOf(int element) {
        //TODO: ASSIGNMENT #2
    }

    @Override
    public int getElement(int index) {
        //TODO: ASSIGNMENT #2
    }

    @Override
    public void insertAtFront(int e) {
        //TODO: ASSIGNMENT #2
    }

    @Override
    public void insertAtBack(int e) {
        //TODO: ASSIGNMENT #2
    }

    @Override
    public int removeFromFront() {
        //TODO: ASSIGNMENT #2
    }

    @Override
    public int removeFromBack() {
        //TODO: ASSIGNMENT #2
    }

    @Override
    public void print() {
        DLLNode current = head;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void printReverse() {
        //TODO: ASSIGNMENT #2
    }

    public static void main(String args[]) {
        //TODO: ASSIGNMENT #2
        //TEST CODE HERE

    }

}
