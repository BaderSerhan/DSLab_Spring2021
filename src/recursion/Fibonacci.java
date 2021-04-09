/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author bader-aul
 */
public class Fibonacci {

    //E.g.
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
    //Print Out Fibonacci Sequence & Calculate Sum
    public static int recursiveFibonacci(int n) {
        //Define Error Handling Case
        if (n < 0) {
            return -1;
        }

        //Define Base Case
        // 1st way
        if (n == 0 || n == 1) {
            return n;
        } //2nd way
        //        if (n < 2) {
        //            return n;
        //         }
        //3rd way
        //        if (n == 0) {
        //            return 0;
        //        }
        //        if (n == 1) {
        //            return 1;
        //        }
        //Define General Case
        else {
            //sum of fibonacci
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }

    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
    //F(5) = F(4) + F(3)
    public static int iterativeFibonacci(int n) {
        //Define Error Handling Case
        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return n;
        }

        //wrong way
//        int sum = 0;
//        for (int i = 2; i <= n; i++) {
//            sum += i;
//        }
//        return sum;
        //correct way
        if (n == 0 || n == 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c = 0;

        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
        //F(5) = F(4) + F(3)
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Recursive Fibonacci: " + recursiveFibonacci(8));

        System.out.println("Iterative Fibonacci: " + iterativeFibonacci(0));

    }

}
