/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronization;

/**
 *
 * @author 5835512090
 */
public class PrintStringsThread implements Runnable {
    
    Thread thread;
    String str1, str2;
    
    PrintStringsThread(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        thread = new Thread(this);
        thread.start();
    }

        
    public void run() {
        TwoStrings.print(str1, str2);
    }
    
}