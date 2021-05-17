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
public class SLL implements ListInterface {

    private SLLNode head;
    private SLLNode tail;
    private int size;

    public SLL() {
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

    public SLLNode getHead() {
        return this.head;
    }

    public SLLNode getTail() {
        return this.tail;
    }

    @Override
    public int indexOf(int element) {
        SLLNode virtualNode = this.head;
        int index = 0;
        while (virtualNode != null) {
            if (virtualNode.getElement() == element) {
                return index;
            } else {
                virtualNode = virtualNode.getNext(); //traversing the linked list
                index++;
            }
        }
        return -1;
    }

    @Override
    public int getElement(int index) {
        SLLNode virtualNode = this.head;
        int counter = 0;

        while (virtualNode != null) {
            if (counter == index) {
                return virtualNode.getElement();
            } else {
                virtualNode = virtualNode.getNext();
                counter++;
            }
        }
        return -1;
    }

    @Override
    public void insertAtFront(int e) {

        SLLNode n = new SLLNode(e);

        if (isEmpty()) {
            this.head = n;
            this.tail = n;
        } else {
            n.setNext(this.head);
            this.head = n;
        }
        this.size++;
    }

    @Override
    public void insertAtBack(int e) {

        SLLNode n = new SLLNode(e);

        if (isEmpty()) {
            this.head = n;
            this.tail = n;
        } else {
            this.tail.setNext(n);
            this.tail = n;
        }
        this.size++;
    }

    @Override
    public int removeFromFront() {

        if (isEmpty()) {
            System.out.println("Linked List is Empty!!!");
            return -1;
        } else {
            int v = this.head.getElement();
            this.head = this.head.getNext();
            this.size--;
            return v;
        }
    }

    @Override
    public int removeFromBack() {

        if (isEmpty()) {
            System.out.println("Linked List is Empty!!!");
            return -1;
        } else {
            int v = this.getTail().getElement();
            SLLNode current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            current.setNext(null);
            this.tail = current;
            this.size--;
            return v;
        }
    }

    @Override
    public void print() {
        SLLNode current = head;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static SLL merge(SLL list1, SLL list2) {
        //E.g.
        // list 1: 1 => 5 => 10 =>
        // list 2: 3 => 6 => 9
        // list 3 : 1 => 5 => 10 => 3 => 6 => 9

        //TODO: return merged list
        if (list1.isEmpty() && list2.isEmpty()) {
            System.err.println("Both lists are empty");
            return null;
        } else if (list1.isEmpty()) {
            return list2;
        } else if (list2.isEmpty()) {
            return list1;
        } else {
            SLL mergedList = list1;

            mergedList.getTail().setNext(list2.getHead());
            mergedList.size = list1.size + list2.size;
            return mergedList;
        }
    }

    public static void main(String args[]) {

        SLL l = new SLL();
        l.insertAtFront(1);
        l.insertAtBack(2);
        l.insertAtBack(3);
        l.insertAtBack(4);
        l.print();
        l.removeFromFront();
        l.print();
        l.removeFromBack();
        l.print();

        SLL l2 = new SLL();
        l2.insertAtBack(10);
        l2.insertAtBack(20);
        l2.insertAtBack(30);
        l2.print();

        System.out.println("index of  20: " + l2.indexOf(20)); //returns 1
        System.out.println("element at 0: " + l2.getElement(0)); //returns 10

        SLL l3 = merge(l, l2);
        l3.print();

    }

}
