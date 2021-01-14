package ro.utcluj.ssatr.ssatr.an1.tema1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class SimulatorEngine2 {
    private int t;
    private boolean active = true;
    
    void simulate(){
        while(active){
            t++;
            System.out.println("Current time is "+t);
            evaluate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SimulatorEngine2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    int k = 3;
    void evaluate(){
        System.out.println("Evaluate system advance at time "+t);
        if(t>=4&&k>0){
            System.out.println("Counter decrement. Value  ="+k);
            k--;            
        }else if(k==0){
            System.out.println("Counter expired!");
            k=-1;
        }

// GRESIT
//        if(t>=4){
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(SimulatorEngine2.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            System.out.println("Counter expired!");
//        }
        

    }
    
    public static void main(String[] args) {
        SimulatorEngine2 s = new SimulatorEngine2();
        s.simulate();
    }
    
}
