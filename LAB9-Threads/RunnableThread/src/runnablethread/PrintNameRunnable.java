/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnablethread;

/**
 *
 * @author 5835512090
 */
class PrintNameRunnable implements Runnable{
     String name;
    
    public PrintNameRunnable(String name) {
        this.name = name;
    }
    
    // Implementation of the run() defined in the
    // Runnable interface.
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.print(name);
        }
    }
}
