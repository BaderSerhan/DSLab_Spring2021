/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list;

/**
 *
 * @author ahmadkassem
 */
public class ArrayList implements ArrayListInterface {

    private int arr[];
    private int size;

    public int getSize() {
        System.out.println(size);
        return size;
    }

    public ArrayList() {
        this.arr = new int[0];
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getElement(int index) {
        return arr[index];
    }

    @Override
    public void setElement(int element, int index) {
        arr[index] = element;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean contains(int element) {
        boolean found = false;
//        [1,2,3] //2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                found = true;
                break;
            }
        }
        return found;
    }

    @Override
    public int indexOf(int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(int element) {

        int arr2[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length - 1] = element;
        this.size++;
        this.arr = arr2;

    }

    @Override
    public int remove() {
        if (isEmpty()) {
            System.out.println("List is Empty!!");
            return -1;
        } else {
            int arr2[] = new int[arr.length - 1];

            for (int i = 0; i < arr.length - 1; i++) {
                arr2[i] = arr[i];
            }
            int value = arr[arr.length - 1];
            this.size--;
            this.arr = arr2;
            return value;
        }
    }

    public int remove(int index) {
        if (isEmpty()) {
            return -1;
        }
        if (index < 0 || index >= this.arr.length) {
            return -1;
        }

        /*
         * here we are replacing the element that we want to remove with the
         * last element of the array using a temp value
         * then we are calling the original remove() function to remove the last
         * element
         * even though this technically works, but it will mess the sorting of
         * the array, i.e. the last element will change its position
         *
         * => NOT RECOMMENDED
         *
         * int temp;
         * temp = arr[index];
         * arr[index] = arr[arr.length - 1];
         * arr[arr.length - 1] = temp;
         * return this.remove();
         *
         */
        //define new array with length + 1
        int[] arr2 = new int[arr.length - 1];

        //loop from 0 till element before the index
        for (int i = 0; i < index; i++) {
            //copy all elements before index to the new array
            arr2[i] = arr[i];
        }

        //loop from element after index to the end of the array
        for (int i = index + 1; i < arr.length; i++) {
            /*
             * copy all elements after the index
             * taking into consideration that the element after the index will
             * be placed at position i - 1, i.e. where the removed element
             * should have been
             */
            arr2[i - 1] = arr[i];
        }

        this.size--;
        this.arr = arr2;
        return arr[index];

        //Example
        //array values[1,2,3,4,5]
        //indexes:    [0,1,2,3,4]
        //remove element at index = 2 => remove element = 3
        //first for loop : 0 => 2
        //arr2 = [1,2, -, - ]
        //second for loop : 3 => 5
        //arr2 = [1,2, 4,5]
    }
}
