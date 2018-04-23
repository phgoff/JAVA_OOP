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

public class SynchronizedExample1 {
    
    public static void main(String[] args) {
        new PrintStringsThreadSyn("Hello ", "there.");
        new PrintStringsThreadSyn("How are ", "you?");
        new PrintStringsThreadSyn("Thank you ", "very much!");
        
    }
    
}