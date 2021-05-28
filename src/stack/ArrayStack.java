package stack;

import java.util.Scanner;

/**
 *
 * @author Abdallah
 */
public class ArrayStack implements StackInterface {

    private int arr[];
    private int top;
    private int size;

    public ArrayStack(int size) {
        this.arr = new int[size];
        this.top = -1;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    @Override
    public void makeEmpty() {
        this.size = 0;
        this.top = -1;
    }

    @Override
    public int length() {
        return this.size;
    }

    @Override
    public void push(int e) {
        if (isFull()) {
            System.out.println("Stack is Full !!!");
        } else {
            top = top + 1;
            arr[top] = e;
            this.size++;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty !!!");
            return -1;
        } else {
            int value = arr[top];
            top -= 1;
            size--;
            return value;
        }
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty !!!");
            return -1;
        }
        return arr[top];
    }

    @Override
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a size");
        int size = scan.nextInt();

        ArrayStack s = new ArrayStack(size);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.print();
        System.out.println();
        s.pop();
        s.print();

        System.out.println();
        System.out.println(s.peek());
        System.out.println();
        s.print();
    }
}
