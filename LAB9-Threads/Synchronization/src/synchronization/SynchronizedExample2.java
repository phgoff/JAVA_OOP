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

public class SynchronizedExample2 {
    
    public static void main(String[] args) {
        
        TwoStringsSyn2 ts = new TwoStringsSyn2();
        
        new PrintStringsThreadSyn2("Hello ", "there.", ts);
        new PrintStringsThreadSyn2("How are ", "you?", ts);
        new PrintStringsThreadSyn2("Thank you ", "very much!", ts);
    }
    
}