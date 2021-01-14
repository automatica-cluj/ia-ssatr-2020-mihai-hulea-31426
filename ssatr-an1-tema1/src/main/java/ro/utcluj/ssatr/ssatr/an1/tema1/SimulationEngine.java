
package ro.utcluj.ssatr.ssatr.an1.tema1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimulationEngine {
    private int crtT;
    private boolean active = true;
    private Node model;
    
    void init(){
        // n1 -> n2 -> n3 
        // content moves from ni -> ni+1 
        Node n1 = new Node();
        Node n2 = new Node();        
        Node n3 = new Node();
        n1.next = n2;
        n2.next = n3;
        n1.content = "TOKEN";
        model = n1;
    }
    
    void simulate(){
        while(active){
            crtT++;
            evaluate();
            try {Thread.sleep(2000);} catch (InterruptedException ex) {Logger.getLogger(SimulationEngine.class.getName()).log(Level.SEVERE, null, ex);}
        }
    }
    
    
    void evaluate(){
        System.out.println("Execute all possible actions at time = "+crtT);
        if(model.content!=null){
            model.next.content = model.content;
            model.content = null;
            model = model.next;
            System.out.println("Content is located on node "+model);
        }
    }
    
    public static void main(String[] args) {
        SimulationEngine se = new SimulationEngine();
        se.init();
        se.simulate();
        
    }
}
