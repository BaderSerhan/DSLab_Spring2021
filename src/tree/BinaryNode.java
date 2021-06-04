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
public class BinaryNode {

    private int element;
    private BinaryNode left;
    private BinaryNode right;

    //default constructor
    public BinaryNode() {
        this.element = 0;
        left = null;
        right = null;
    }

    //we will use that constructor
    public BinaryNode(int element) {
        this.element = element;
        left = null;
        right = null;
    }

    public BinaryNode(int element, BinaryNode left, BinaryNode right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int e) {
        element = e;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public boolean isLeaf() {
        return getLeft() == null && getRight() == null;
    }
}
