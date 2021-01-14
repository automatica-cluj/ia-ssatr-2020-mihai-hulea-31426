/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs4.ssatr.ia.simplu;

import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mihai.hulea
 */
public class FirstActivity implements Runnable{

    public FirstActivity() {
       // Thread.currentThread().setDaemon(true);
    }
    
    
    
    public void run(){
      
        
        int k = 0;
        while(true){
            k++;
            System.out.println("First activity "+k);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FirstActivity.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
