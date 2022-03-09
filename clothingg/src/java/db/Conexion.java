
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion {
    private Connection connection;
    private String url="jdbc:postgresql://localhost/";
    private String user="postgres";
    private String pwd="sainos";
    public Statement st;
    
    public Conexion() {    
    }
    
    public void conectar(String nombreBD){
        try {
            Class.forName("org.postgresql.Driver");
            final String url2="jdbc:postgresql://localhost/"+nombreBD;
            if(nombreBD.equals("")){
                connection = DriverManager.getConnection(url, "postgres", "Hecxai");
            }else{
                connection = DriverManager.getConnection(url2, "postgres", "Hecxai");
            }
            st=connection.createStatement();
            
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
        Conexion con = new Conexion();
        String tabla = "producto";
        try {
            con.conectar("clothing");
            con.st.execute("insert into "+tabla+"(codigo, nombre, descripcion, precio, fechacreacion, fechaactualizacion, fechaeliminacion) values('1234567890', 'Refresco', 'Bebida de soda', 15.5, '2022/03/08', '2022/03/08', '2022/03/08');");
            JOptionPane.showMessageDialog(null, "Se han insertado correctamente los datos a la tabla "+tabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
        try {
            con.conectar("clothing");
            String sql = "Select * from "+tabla+";";
            ResultSet rs = con.st.executeQuery("");
            while(rs.next()){
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                Double precio = rs.getDouble("precio");
                String fechaCreacion = rs.getString("fechacreacion");
                String fechaActualizacion = rs.getString("fechaactualizacion");
                String fechaEliminacion = rs.getString("fechaeliminacion");
                
                System.out.println("Codigo: " +codigo+" Nombre: "+nombre+" Descripción: "+descripcion+" Precio: " );
            }
        } catch (Exception e) {
        }
        
    }
}
