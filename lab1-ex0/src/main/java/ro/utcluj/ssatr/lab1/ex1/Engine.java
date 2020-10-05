/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.lab1.ex1;

/**
 *
 * @author mihai.hulea
 */
public class Engine {
    boolean started;
    
    void startEngine(){
        started = true;
        System.out.println("Start engine!");
    }
    
    void stopEngine(){
        started = false;
        System.out.println("Stop engine");
    }
    
    boolean isStarted(){
        return started;
    }
}
