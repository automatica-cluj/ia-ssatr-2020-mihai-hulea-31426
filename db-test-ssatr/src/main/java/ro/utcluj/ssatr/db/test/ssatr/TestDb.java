package ro.utcluj.ssatr.db.test.ssatr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {
    public static void main(String[] args) throws Exception{
            
            // 1. incaracre driver de conectare la baza de date
            System.out.println("Incarcare driver DB.");
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            // 2. conecater la baza de date
            System.out.println("Conectare la baza de date.");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost/test_db4;create=true;user=APP;pass=APP");
                        
            Statement s = conn.createStatement();
            
            //creare tabel
            //s.execute("CREATE TABLE demo (id integer primary key not null, text varchar(32))");            
            
            //inserare inregistrari
            s.execute("INSERT INTO demo VALUES (3, 'hello world!')");
            s.execute("INSERT INTO demo VALUES (4, 'hello !')");
            
            //interogare tabel
            s.execute("SELECT * FROM demo");

            //parcurgere inregistrari
            ResultSet rs = s.getResultSet();
            while (rs.next()) {
                System.out.println("Derby says: "+rs.getString("text"));
            }
           
    }
}
