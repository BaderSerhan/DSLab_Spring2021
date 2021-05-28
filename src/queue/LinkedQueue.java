/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Ibrahim
 */
public class LinkedQueue implements QueueInterface {

    private Node front;
    private Node Back;
    private int size;

    public LinkedQueue() {
        this.front = null;
        this.Back = null;
        this.size = 0;
    }

    @Override
    public int getFront() {
        return front.getElement();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void makeEmpty() {
        this.front = null;
        this.Back = null;
        this.size = 0;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public void enqueue(int e) {

        Node n = new Node(e);

        if (isEmpty()) {
            this.front = n;
            this.Back = n;
        } else {
            this.Back.setNext(n);
            this.Back = n;
        }
        this.size++;
    }

    @Override
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty!!!");
            return -1;
        } else {
            int v = this.front.getElement();
            this.front = this.front.getNext();
            this.size--;
            return v;
        }
    }

    @Override
    public void print() {
        Node current = front;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    public static void main(String args[]) {
        LinkedQueue l = new LinkedQueue();
        l.enqueue(1);
        l.enqueue(2);
        l.enqueue(3);

        l.print();
        System.out.println();
        l.dequeue();
        l.print();

    }
}
