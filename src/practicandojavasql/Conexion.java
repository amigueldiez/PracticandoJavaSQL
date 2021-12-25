
package practicandojavasql;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Conexión con la base de datos
 * 
 * @author alber
 */
public class Conexion {
    
    Connection con;
    
    public void openConnection() throws Exception {
       // try {
            String userName = "testjavasql"; //Change if you used a different one
            String password = "testjavasqlpass"; //Change if you used a different one
            String dbname = "testjavasqldb";
            String hostname = "localhost";
            String port = "3306";
            String url = "jdbc:mysql://" + hostname + ":" + port + "/" + dbname + "?serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection to the database done: " + con.getClass().getName());
            
 
       /* } catch (Exception e) {
            System.out.println("Error in the connection. Detailed message:\n");
            System.out.println(e.getMessage());
        }*/
    }
    
    public void closeConnection() {
        try {
            con.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            System.out.println("Error when closing connection");
        }
    }
    
    public Statement createStatement(){
        try {
            return con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
