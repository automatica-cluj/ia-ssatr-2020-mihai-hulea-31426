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
public class Robot {
    Engine xe = new Engine(); //null
    Engine ye = new Engine();
    int x;
    int y;
    String name;

    public Robot(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    
    void startRobot(){
        xe.startEngine();
        ye.startEngine();
    }
       
    void move(){
        if(xe.isStarted()&&ye.isStarted()){
            x+=1;
            y+=1;
        }else{
            System.out.println("Robot cannot move. Engines not started.");            
        }
    }
    
    void displayInfo(){
        System.out.println("Robot name="+name+" x="+x+" y="+y);
    }
    
}
