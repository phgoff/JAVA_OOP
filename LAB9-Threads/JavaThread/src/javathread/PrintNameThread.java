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
class PrintNameThread extends Thread{

    public PrintNameThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println("run() method of the " + this.getName() + " thread is called" );
        
        for (int i = 0; i < 10; i++) {
            System.out.print(this.getName());
        }
    }
    
}
