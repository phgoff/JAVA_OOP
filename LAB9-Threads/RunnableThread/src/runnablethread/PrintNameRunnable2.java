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
class PrintNameRunnable2 implements Runnable {
           Thread thread;
    
    PrintNameRunnable2(String name) {
        thread = new Thread(this, name);
        thread.start();
    }
    
    // Implementation of the run() defined in the
    // Runnable interface.
    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
        }
    }

}