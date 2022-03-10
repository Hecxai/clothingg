/*
    Autor: Mario Hecxai Valencia Reyes
    Fecha de creación: 08 de marzo del 2022
    Fecha de actualización: 09 de marzo del 2022
    Descripción: Clase Conexión de la base de datos clothingg
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    private Connection connection;
    private String url = "jdbc:postgresql://localhost/";
    private String user = "postgres";
    private String pwd = "Hecxai";
    public Statement st;

    public Conexion() {
    }

    public void conectar(String nombreBD) {
        try {
            Class.forName("org.postgresql.Driver");
            final String url2 = "jdbc:postgresql://localhost/" + nombreBD;
            if (nombreBD.equals("")) {
                connection = DriverManager.getConnection(url, user, pwd);
            } else {
                connection = DriverManager.getConnection(url2, user, pwd);
            }
            st = connection.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());

        } finally {

        }
    }

    public void desconectar() {
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
//        try {
//            con.conectar("clothing");
//            con.st.execute("insert into "+tabla+"(codigo, nombre, descripcion, precio, fechacreacion, fechaactualizacion, fechaeliminacion) values('1234567891', 'Refresco', 'Bebida de soda', 15.5, '2022/03/08', '2022/03/08', '2022/03/08');");
//            JOptionPane.showMessageDialog(null, "Se han insertado correctamente los datos a la tabla "+tabla);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.toString());
//        }

//        int resp = JOptionPane.showConfirmDialog(null, "¿Desea consultar los datos?", "Mensaje", JOptionPane.YES_NO_OPTION);
//        if (resp==0) {
//            try {
//            con.conectar("clothing");
//            String sql = "Select * from "+tabla+";";
//            ResultSet rs = con.st.executeQuery(sql);
//            while(rs.next()){
//                String codigo = rs.getString("codigo");
//                String nombre = rs.getString("nombre");
//                String descripcion = rs.getString("descripcion");
//                Double precio = rs.getDouble("precio");
//                String fechaCreacion = rs.getString("fechacreacion");
//                String fechaActualizacion = rs.getString("fechaactualizacion");
//                String fechaEliminacion = rs.getString("fechaeliminacion");
//                System.out.println("Datos de la tabla "+tabla+"\n");
//                System.out.println("Codigo: " +codigo+" \nNombre: "+nombre+" \nDescripción: "+descripcion+" \nPrecio: "+precio+" \nFecha de creación: "+fechaCreacion+" \nFecha de actualización: "+fechaActualizacion+" \nFecha de eliminación: "+fechaEliminacion );
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.toString());
//        }
//            
//        }else{
//            JOptionPane.showMessageDialog(null, "Adiós");
//        }
    }
}
