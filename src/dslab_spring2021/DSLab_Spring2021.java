/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab_spring2021;

/**
 *
 * @author bader-aul
 */
public class DSLab_Spring2021 implements MyInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee bader = new Employee();
        bader.setName("Bader");
        System.out.println(bader.getName());
        System.out.println(bader.getAge());
    }

    @Override
    public void method1() {
        //TODO: write our own implementation here
    }

    @Override
    public int method2() {
        return 0;
    }
}
