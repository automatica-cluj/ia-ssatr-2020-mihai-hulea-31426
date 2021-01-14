/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.demo.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import org.apache.derby.client.jd
/**
 *
 * @author mihai.hulea
 */
public class TestConnect {
    public static void main(String[] args) {
          try {
              
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Derby driver not found.");
            return;
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost/test_db4;create=true;user=APP;pass=APP");
            Statement s = conn.createStatement();
//            s.execute("CREATE TABLE demo (id integer primary key not null, text varchar(32))");            
//            s.execute("INSERT INTO demo VALUES (1, 'hello world!')");
//            s.execute("INSERT INTO demo VALUES (2, 'hello !')");
//            s.execute("SELECT * FROM demo");
//            ResultSet rs = s.getResultSet();
//            while (rs.next()) {
//                System.out.println("Derby says: "+rs.getString("text"));
//            }
            
            s.execute("CREATE TABLE platenumber (id integer primary key not null, plate varchar(32), entrytime long)");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }

