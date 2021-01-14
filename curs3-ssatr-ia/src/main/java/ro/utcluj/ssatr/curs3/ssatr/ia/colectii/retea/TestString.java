/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs3.ssatr.ia.colectii.retea;

import java.util.StringTokenizer;

public class TestString {
    public static void main(String[] args) {
        String str = "17 + 66";
        String token = "";
        if(str.indexOf("+")!=-1)
            token = "+";
        //.....            
        StringTokenizer st = new StringTokenizer(str,token);
        
        int op1 = Integer.parseInt(st.nextToken().trim());
        int op2 = Integer.parseInt(st.nextToken().trim());
        
        int rez = op1 + op2;
        
        String r = "Rezulta = "+rez;

        System.out.println(r);        
        
        //String r = 
    }
}
