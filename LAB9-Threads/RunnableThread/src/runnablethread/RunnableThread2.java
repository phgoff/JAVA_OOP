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
public class RunnableThread2 {
    public static void main(String[] arg){
         new PrintNameRunnable2("A");
         new PrintNameRunnable2("B");
         new PrintNameRunnable2("C");
    }
}
