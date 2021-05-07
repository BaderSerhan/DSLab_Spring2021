/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list;

/**
 *
 * @author Bader
 */
public interface ArrayListInterface {

    //returns the actual size of the array
    public int getSize();

    //returns if the arraylist is empty or not
    public boolean isEmpty();

    //gets the element at the given index
    public int getElement(int index);

    //sets the given element at the given index
    public void setElement(int element, int index);

    //returns if an element is found in the array or not
    public boolean contains(int element);

    //get the index of the given element, and -1 if not found
    public int indexOf(int element);

    //adds new element to the end of the arraylist
    public void add(int newElement);

    //removes last element of the arraylist
    public int remove();

    //merges another arraylist to the original
    public void concat(ArrayList l2);
}
