/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Abdallah
 */
public class ArrayQueue implements QueueInterface {

    private int arr[];
    private int front;
    private int back;
    private int size;

    public ArrayQueue() {
        this.arr = new int[10];
        this.front = 0;
        this.back = -1;
        this.size = 0;
    }

    public ArrayQueue(int s) {
        this.arr = new int[s];
        this.front = 0;
        this.back = -1;
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
        this.front = 0;
        this.back = -1;
        this.size = 0;
    }

    @Override
    public boolean isFull() {
        return size == arr.length;
    }

    @Override
    public int getFront() {
        return this.arr[this.front];
    }

    @Override
    public void enqueue(int e) {
        if (isFull()) {
            System.out.println("Queue is Full!!");
        } else {
            if (back + 1 == arr.length) {
                this.back = 0;
            } else {
                this.back++;
            }
            this.arr[back] = e;
            this.size++;
        }
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return -1;
        } else {
            int v = this.arr[this.front];
            if (front + 1 == arr.length) {
                front = 0;
            } else {
                front++;
            }
            this.size--;
            return v;
        }
    }

    @Override
    public void print() {

        if (front <= back) {
            for (int i = front; i <= back; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = front; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= back; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /*
     * Write a RECURSIVE function called:
     * -------------	public void MultiplesOfFive (Arrayqueue list) -------------
     * which prints on screen all values that can be divided by 5
     */
    public static void MultiplesOfFive(ArrayQueue list) {
        if (!list.isEmpty()) {
            if (list.getFront() % 5 == 0) {
                System.out.println(list.getFront() + " is a multiple of 5.");
            }
            list.dequeue();
            MultiplesOfFive(list);
        }
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.enqueue(1);
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(2);
        q.enqueue(15);
        System.out.println();
        MultiplesOfFive(q);

    }
}
