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
public class SimpleThread extends Thread {
    
    public SimpleThread(String str) {
        super(str);
    }
    
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName() 
                                 + " Priority = " + getPriority());
        }
        System.out.println("Done! " + getName());
    }
}
