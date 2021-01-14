/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs4.ssatr.ia.simplu;

public class Test {
    public static void main(String[] args) {
        FirstActivity f1 = new FirstActivity();
        Thread t = new Thread(f1);
        t.setDaemon(true);
        t.start();
        SecondActivity f2 = new SecondActivity();
        f2.start();   
        
        
        SecondActivity f3 = new SecondActivity();
        f3.start();   
        
        
        SecondActivity f4 = new SecondActivity();
        f4.start();   
        //sout
        System.out.println("AM TERMINAT MAIN");
    }
}
