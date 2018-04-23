/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author 5835512090
 */
public class JavaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Create object instance of a class that is subclass of Thread class
        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread pnt1 = new PrintNameThread("A");
          // Start the thread by invoking start() method
        System.out.println("Calling start() method of " + pnt1.getName() + " thread");
        pnt1.start();
        //pnt2
        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread pnt2 =
                new PrintNameThread("B");
        System.out.println("Calling start() method of " + pnt2.getName() + " thread");
        pnt2.start(); 
        //pnt3
        System.out.println("Creating PrintNameThread object instance..");
        PrintNameThread pnt3 =
                new PrintNameThread("C");
        System.out.println("Calling start() method of " + pnt3.getName() + " thread");
        pnt3.start(); 
    }
    
}
