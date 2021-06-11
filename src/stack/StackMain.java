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
public class StackMain {

    public static LinkedStack merge(ArrayStack s1, ArrayStack s2) {
        //TODO: GRADED CLASSWORK
        LinkedStack newStack = new LinkedStack();
        LinkedStack tempStack = new LinkedStack();

        //Correct
        // 10 => 20 => 30 => 40 => 50
        // 50 => 40 => 30 => 20 => 10
        //Wrong
        //30 => 20 => 10 => 50 => 40
        // 40 => 50 => 10 => 20 => 30
        while (!s2.isEmpty()) {
            newStack.push(s2.pop());
        }
        //50 => 40

        while (!s1.isEmpty()) {
            newStack.push(s1.pop());
        }
        //50 => 40 => 30 => 20 => 10

        while (!newStack.isEmpty()) {
            tempStack.push(newStack.pop());
        }

        return tempStack;
    }

    /*
     * Implement the method public int getMin ( Stack s ) is used to return
     * the smallest value found in a Stack. Take into consideration the
     * following:
     * -	Values are of integer type.
     * -	The data must be kept in the stack after calling the method.
     * -	The above method does not exist in the Stack class
     * -	Example: A stack contains: 210 , 2 , 53 , 41 , 39 , 6 , 71; the
     * returned value is 2, and the values in stack will remain unchanged.
     * -	You can use all the basic (familiar) methods existing in Stack class.
     * Just call the methods without implementing them.
     *
     */
    public static int getMin(ArrayStack s) { //or LinkedStack doesn't matter
        if (s.isEmpty()) {
            return -1;
        } else {
            ArrayStack tempStack = new ArrayStack(s.length());
            int min = s.pop();
            tempStack.push(min);

            while (!s.isEmpty()) {
                if (s.peek() < min) {
                    min = s.peek();
                }
                tempStack.push(s.pop());
            }

            while (!tempStack.isEmpty()) {
                s.push(tempStack.pop());
            }

            return min;
        }
    }

    public static int countOdds(LinkedStack stack) {
        if (stack.isEmpty()) {
            return 0;
        }
        int c = 0;
        if (stack.peek() % 2 != 0) {
            c = 1;
        }
        stack.pop();
        return c + countOdds(stack);
    }

    public static void main(String[] args) {
        LinkedStack stack1 = new LinkedStack();
        ArrayStack stack2 = new ArrayStack(3);

        stack1.push(10);
        stack1.push(20);
        stack1.push(50);
        stack1.push(30);

//        stack2.push(40);
//        stack2.push(50);
        /**
         * Stack1
         * 30
         * 20
         * 10
         *
         * Stack2
         * 50
         * 40
         *
         * Merged Stack Output
         * 50
         * 40
         * 30
         * 20
         * 10
         *
         */
        //----------------------------------------
//        LinkedStack mergedStack = merge(stack1, stack2);
//        mergedStack.print();
        //---------------------------------------
//        System.out.println("Before getMin >>>>>");
//        stack1.print();
//        System.out.println("getMin >>>>>");
//        System.out.println(getMin(stack1));
//        System.out.println("After getMin >>>>>");
//        stack1.print();
        System.out.println(countOdds(stack1));
    }
}
