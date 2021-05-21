/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Abdallah
 */
public class LinkedStack implements StackInterface {

    private Node top;
    private int size;

    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public int length() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void makeEmpty() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public void push(int e) {
        Node n = new Node(e);

        if (isEmpty()) {
            top = n;
        } else {
            n.setNext(top);
            top = n;
        }
        this.size++;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty !!!");
            return -1;
        } else {
            int value = top.getElement();
            top = top.getNext();
            this.size--;
            return value;
        }
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty !!!");
            return -1;
        } else {
            return top.getElement();
        }
    }

    @Override
    public void print() {
        Node current = top;

        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    /*
     * Write a RECURSIVE function called:
     * -------------	public void MultiplesOf10 (LinkedStack list) -------------
     * which prints on screen all values that can be divided by 10
     */
    public static void MultiplesOf10(LinkedStack list) {
        if (!list.isEmpty()) {
            if (list.peek() % 10 == 0) {
                System.out.println(list.peek() + " is a multiple of 10.");
            }
            list.pop();
            MultiplesOf10(list);
        }
    }

    public static void main(String args[]) {

        LinkedStack s = new LinkedStack();
        s.push(1);
        s.push(2);
        s.push(10);
        s.push(3);
        s.push(20);
        s.print();
        System.out.println();

        s.pop();
        s.print();
        System.out.println();
        System.out.println(s.peek());
        System.out.println();
        s.print();
        MultiplesOf10(s);
    }
}
