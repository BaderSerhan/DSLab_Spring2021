/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author bader-aul
 */
public interface QueueInterface {

    int length();

    boolean isEmpty();

    void makeEmpty();

    int getFront();

    void enqueue(int e);

    int dequeue();

    void print();

}
