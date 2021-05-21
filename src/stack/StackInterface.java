/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author bader-aul
 */
public interface StackInterface {

    int length();

    boolean isEmpty();

    void makeEmpty();

    void push(int element);

    int pop();

    int peek();

    void print();
}
