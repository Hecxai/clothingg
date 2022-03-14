
package model;
import db.Conexion;
import entity.Usuario;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class IUsuarioModelImpl implements IUsuarioModel{

    
    private Conexion conexion;
    private Connection connection;
    


    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "INSERT INTO usuario(nombreusuario, contrasenia) VALUES(?, ?);";
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, usuario.getNombreUsuario());
                ps.setString(2, usuario.getContraseña());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Se han insertado correctamente los datos a la tabla ");
            } catch (Exception e) {
            }
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    @Override
    public void actulizarRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "UPDATE usuario SET nombreusuario=?, contrasenia=? WHERE id=?;";
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, usuario.getNombreUsuario());
                ps.setString(2, usuario.getContraseña());
                ps.execute();
            } catch (Exception e) {
            }
            conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(IUsuarioModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        return null;
 
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        return null;

    }

    @Override
    public void eliminarRegistro(int idUsuario) {
        
    }

    public static void main(String[] args) {
        IUsuarioModelImpl iumi = new IUsuarioModelImpl();
        Usuario usu= new Usuario();
        usu.setNombreUsuario("Juan");
        usu.setContraseña("Juan123");
        iumi.crearRegistro(usu);
        
    }


    
}
