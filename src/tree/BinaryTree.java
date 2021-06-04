/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Ibrahim
 */
public class BinaryTree {

    private BinaryNode root;

    public BinaryTree(BinaryNode root) {
        this.root = root;
    }

    public BinaryTree(int value) {
        this.root = new BinaryNode(value);
    }

    public void setRoot(BinaryNode root) {
        this.root = root;
    }

    public BinaryNode getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void makeEmpty() {
        root = null;
    }

    public void printPreOrder() {
        printPreOrder(root);
    }

    //Node => Left => Right
    private void printPreOrder(BinaryNode n) {
        System.out.print(n.getElement() + " ");

        if (n.getLeft() != null) {
            printPreOrder(n.getLeft());
        }

        if (n.getRight() != null) {
            printPreOrder(n.getRight());
        }

    }

    public void printInOrder() {
        printInOrder(root);
    }

    //Left => Node => Right
    private void printInOrder(BinaryNode n) {

        if (n.getLeft() != null) {
            printInOrder(n.getLeft());
        }

        System.out.print(n.getElement() + " ");

        if (n.getRight() != null) {
            printInOrder(n.getRight());
        }
    }

    public void printPostOrder() {
        printPostOrder(root);
    }

    //Left => Right => Node
    private void printPostOrder(BinaryNode n) {

        if (n.getLeft() != null) {
            printPostOrder(n.getLeft());
        }
        if (n.getRight() != null) {
            printPostOrder(n.getRight());
        }
        System.out.print(n.getElement() + " ");
    }

    private int size() {
        return size(root);
    }

    private int size(BinaryNode n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + size(n.getLeft()) + size(n.getRight());
        }
    }

    public int countOdds() {
        return countOdds(root);
    }

    private int countOdds(BinaryNode root) {
        if (root == null) {
            return 0;
        } else {
            int c = 0;
            if (root.getElement() % 2 != 0) {
                c++;
            }

            return c + countOdds(root.getLeft()) + countOdds(root.getRight());

            /**
             * OR
             * if (root.getElement() % 2 != 0) {
             * return 1 + countOdds(root.getLeft()) +
             * countOdds(root.getRight());
             * } else {
             * return countOdds(root.getLeft()) + countOdds(root.getRight());
             * }
             */
        }
    }

    public static void main(String[] args) {
        BinaryNode b12 = new BinaryNode(12);
        BinaryNode b13 = new BinaryNode(18);
        BinaryNode b14 = new BinaryNode(14);
        BinaryNode b15 = new BinaryNode(15);
        BinaryNode b16 = new BinaryNode(16);
        BinaryNode b17 = new BinaryNode(17);

        BinaryTree bt = new BinaryTree(b12);

        b12.setLeft(b13);
        b12.setRight(b14);
        b13.setLeft(b15);
        b13.setRight(b16);
        b14.setRight(b17);
        bt.printPreOrder();
        System.out.println();
        bt.printInOrder();
        System.out.println();
        bt.printPostOrder();
        System.out.println();
        System.out.println(bt.size());

        System.out.println(bt.countOdds());
    }
}
