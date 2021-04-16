/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list;

/**
 *
 * @author bader-aul
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        l1.getSize();
        l1.add(10); //index 0
        l1.add(20); //index 1
        l1.add(15); //index 2
        l1.add(13); //index 3
        l1.getSize();
        l1.print();
        l1.remove(2);
        l1.getSize();
        l1.print();

    }
}
