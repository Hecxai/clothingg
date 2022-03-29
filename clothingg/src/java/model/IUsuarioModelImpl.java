
package model;
import db.Conexion;
import entity.Usuario;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            String sql = "INSERT INTO usuario(nombre, sexo, edad, nombreusuario, contraseña) VALUES(?, ?, ?, ?, ?);";
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, usuario.getNombre());
                ps.setString(2, usuario.getSexo());
                ps.setInt(3, usuario.getEdad());
                ps.setString(4, usuario.getNombreUsuario());
                ps.setString(5, usuario.getContraseña());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se han insertado correctamente los datos a la tabla ");
            } catch (Exception e) {
            }
            conexion.desconectar();
        } catch (SQLException e) {
            
        }
    }

    @Override
    public void actulizarRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "UPDATE usuario SET nombre=?, sexo=?, edad=?, nombreusuario=?, contraseña=? WHERE codigo="+usuario.getCodigo()+";";
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, usuario.getNombre());
                ps.setString(2, usuario.getSexo());
                ps.setInt(3, usuario.getEdad());
                ps.setString(4, usuario.getNombreUsuario());
                ps.setString(5, usuario.getContraseña());
                ps.executeUpdate();
            } 
            conexion.desconectar();
        } catch (SQLException ex) {
            
        }
        
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> listaUsuario = null;
        try {
            ResultSet rs;
            listaUsuario = new ArrayList<>();
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "SELECT * FROM usuario;";
            try (PreparedStatement ps = connection.prepareStatement(sql)){
                rs = ps.executeQuery();
                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setCodigo(rs.getString(1));
                    usuario.setNombre(rs.getString(2));
                    usuario.setSexo(rs.getString(3));
                    usuario.setEdad(rs.getInt(4));
                    usuario.setNombreUsuario(rs.getString(5));
                    usuario.setContraseña(rs.getString(6));
                    listaUsuario.add(usuario);
                    
                }
            }
            conexion.desconectar();
        } catch (SQLException e) {
            
        }
        return (listaUsuario);
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        Usuario usuario =  null;
        try {
            ResultSet rs;
            usuario = new Usuario();
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "SELECT * FROM usuario WHERE codigo=?;";
            try (PreparedStatement ps = connection.prepareStatement(sql)){
                ps.setInt(1, idUsuario);
                rs = ps.executeQuery();
                while (rs.next()) {                    
                    usuario.setCodigo(rs.getString(1));
                    usuario.setNombre(rs.getString(2));
                    usuario.setSexo(rs.getString(3));
                    usuario.setEdad(rs.getInt(4));
                    usuario.setNombreUsuario(rs.getString(5));
                    usuario.setContraseña(rs.getString(6));
                }
            }
            conexion.desconectar();
        } catch (SQLException e) {
            
        }
        return usuario;
    }
    
    

    @Override
    public void eliminarRegistro(int idUsuario) {
        try {
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "DELETE FROM usuario WHERE codigo=?;";
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, idUsuario);
                ps.executeUpdate();
            }
            conexion.desconectar();
        } catch (SQLException ex) {
            
        }
    }

    public static void main(String[] args) {
        IUsuarioModelImpl iumi = new IUsuarioModelImpl();
        Usuario usu= new Usuario();
        //Insertar registro
        usu.setNombreUsuario("Oscar");
        usu.setContraseña("Melecio");
        iumi.crearRegistro(usu);
        
        //Actualiar registro
//        Usuario usu2 = new Usuario();
//        usu2.getNombreUsuario();
//        usu2.getContraseña();
//        usu2.getCodigo();
//        iumi.actulizarRegistro(usu2);
        
//        Eliminar un registro
//        iumi.eliminarRegistro(5);
//        
//
//        Obtener registro
//        Usuario usu1 = iumi.obtenerRegistro(1);
//        System.out.println("" +usu1.getCodigo()+ "\n"+ usu1.getNombreUsuario()+"\n"+usu1.getContraseña());
//        System.out.println("\n");
//        
//        Obtener registros
//        for (int i = 0; i < iumi.obtenerRegistros().size(); i++) {
//            System.out.println(iumi.obtenerRegistros().get(i).getCodigo());
//            System.out.println(iumi.obtenerRegistros().get(i).getNombreUsuario());
//            System.out.println(iumi.obtenerRegistros().get(i).getContraseña());  
//        }
        
        
        
        
      

    }


    
}
