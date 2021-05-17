package singly_linked_list;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bader
 */
public interface ListInterface {

    //return size of list
    int length();

    //returns if list is empty or not
    boolean isEmpty();

    //empties the list
    void makeEmpty();

    //gets node's element at given index
    int getElement(int index);

    //gets index of given element's node
    int indexOf(int element);

    //adds new node with value newElement at the beginning of the list
    void insertAtFront(int newElement);

    //adds new node with value newElement at the end of the list
    void insertAtBack(int newElement);

    //removes last node in list
    int removeFromFront();

    //removes node at given index
    int removeFromBack();

    //prints the element of the array
    void print();
}
