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
public class PrintStringsThreadSyn2 implements Runnable {
    
    Thread thread;
    String str1, str2;
    TwoStringsSyn2 ts;
    
    PrintStringsThreadSyn2(String str1, String str2,
                       TwoStringsSyn2 ts) {
        this.str1 = str1;
        this.str2 = str2;
        this.ts = ts;
        thread = new Thread(this);
        thread.start();
    }
    
    public void run() {
        // Synchronize over TwoString object
        synchronized (ts) {
            ts.print(str1, str2);
        }
    }
}
