/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs3.ssatr.ia.colectii.retea;


import java.net.*;
import java.io.*;
import java.time.Instant;

public class Server {
    
    
    //declarare si initializare interfata grafica
    //declar lista care stocheaza inregistrarile 
    
    String handlePlateNumberRequest(String plateNumber){
        // verificam daca nr exista deja
            // daca nu exista il adaug in lista
            //returnez un sir "numaru_inmatriculare inregistrat"
        //daca exista 
            //calculez timpul de stationare
            //ster numarul din lista 
            //returnez un sir "numar_inmatriculare pret XX RON"
        
        //acces la interfata grafica (pentru exercitiul 7)    
            
        return "";
    }
    
    
    
    void startServer() throws IOException{
        //....
        ServerSocket ss =new ServerSocket(4050);
        
        while(true){
            System.out.println("Astept conexiune de la client...");
            Socket s = ss.accept(); //metoda blocanta
            System.out.println("Clientul s-a conectat!");
            //...... 
            BufferedReader fluxIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter fluxOut = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
            //......
            String line = "";
            while(!line.equals("close connection")){
                //citesc nr inmatriculare
                //apelez metoda handle plate number
                //returnez catre client rezultatul 
            }

            s.close();
        }
    }
    
    public static void main(String[] args) throws IOException {
        Server s = new Server();
        //s.startServer();
        String x = s.handlePlateNumberRequest("AB-01-AAA");
        System.out.println("x");
    }
}
