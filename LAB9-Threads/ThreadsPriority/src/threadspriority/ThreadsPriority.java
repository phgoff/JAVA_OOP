/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadspriority;

/**
 *
 * @author 5835512090
 */
public class ThreadsPriority {
    
    public static void main(String[] args) {
        
        Thread t1 = new SimpleThread("Boston");
        t1.start();
        // Set the thread priority to 10(highest)
        t1.setPriority(10);
        
        Thread t2 = new SimpleThread("New York");
        t2.start();
        // Set the thread priority to 5
        t2.setPriority(5);
        
        Thread t3 = new SimpleThread("Seoul");
        t3.start();
        // Set the thread priority to 1
        t3.setPriority(1);
        
    }
}
