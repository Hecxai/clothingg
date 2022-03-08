
package db;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private Connection connection;
    private String url="jdbc:postgresql://localhost/clothing";
    private String user="postgres";
    private String pwd="sainos";

    public Conexion() {    
    }
    
    public void conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url,user, pwd);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            
        }finally{
            
        }
    }
    
    public void desconectar(){
        try {
            connection.close();
            JOptionPane.showMessageDialog(null, "Cerrada la conexión de la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }

    public Connection getConnection() {
        return connection;
    }
    
    public static void main(String[] args) {

    }
    
            
}
