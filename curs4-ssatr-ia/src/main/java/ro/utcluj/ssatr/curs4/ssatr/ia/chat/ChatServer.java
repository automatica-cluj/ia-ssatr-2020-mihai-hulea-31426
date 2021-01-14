/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs4.ssatr.ia.chat;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatServer {
        
    ArrayList<ClientHandler> clients = new ArrayList<>();    
    
    public void startServer(){

        ServerSocket ss = null;
        try {
            ss = new ServerSocket(1988);
        } catch (IOException ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }

        while(true){
            try {
                System.out.println("Waiting for client...");
                Socket s = ss.accept();
                System.out.println("Client connected!");
                ClientHandler h = new ClientHandler(s, this);
                h.start();
                clients.add(h);
            } catch (IOException ex) {
                Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//.startServer


    void sendMessageToAll(String msg){
        for(ClientHandler c: clients){
            c.sendMessage(msg);
        }
    }
    
    public static void main(String[] args) {
        ChatServer srv = new ChatServer();
        srv.startServer();
    }
    
}//.class

//////////////////////////////////////////////////////////////////////////////////////////

class ClientHandler extends Thread{
    
    Socket s;
    BufferedReader fluxIn;
    PrintWriter fluxOut;
    ChatServer server;

    public ClientHandler(Socket s, ChatServer server) throws IOException {
        this.s = s;
        fluxIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        fluxOut = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
        this.server = server;
    }
    
    public void run(){
        try {
            while(true){

                    String msg = fluxIn.readLine();
                    System.out.println("Server receive message: "+msg);
                    server.sendMessageToAll(msg);
            }
        
        } catch (IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void sendMessage(String msg){
        fluxOut.println(msg);
    }
}
