/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs4.ssatr.ia.chat;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mihai.hulea
 */
public class ChatClient extends Thread{

    BufferedReader fluxIn;
    PrintWriter fluxOut;
    ChatClientGUI gui ;
    
    public ChatClient() throws IOException {
        Socket s = new Socket("127.0.0.1", 1988);
        fluxIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        fluxOut = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
    }
    
    void initGui(ChatClientGUI gui){
        this.gui = gui;
    }
    
    public void run(){
        while(true){
            String line;
            try {
                line = fluxIn.readLine();
                System.out.println("Mesaj: "+line);
                gui.addMessage(line);
            } catch (IOException ex) {
                Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
                break;
            }
            
        }
    }
    
    public void sendMessage(String msg){
        fluxOut.println(msg);
    }
    
    public static void main(String[] args) throws IOException {
        ChatClient c = new ChatClient();
        c.start();
        ChatClientGUI gui = new ChatClientGUI();
        gui.initClient(c);
        c.initGui(gui);
        gui.setVisible(true);
        
    }
    
}
