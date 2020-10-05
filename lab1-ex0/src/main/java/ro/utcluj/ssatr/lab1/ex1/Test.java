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
public class Test {
    public static void main(String[] args) {
        Robot r1 = new Robot("ab1",2,3);
        r1.startRobot();
        r1.move();
        r1.displayInfo();
        
        Robot[] list = new Robot[10];
        
        list[0] = new Robot("fg2",4,5);
        list[0].startRobot();
        list[1] = r1;
        
        for(int i=0;i<list.length;i++)
            if(list[i]!=null)
                    list[i].displayInfo();
        
    }
}
