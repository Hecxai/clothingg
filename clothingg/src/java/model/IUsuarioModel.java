
package model;
import entity.Usuario;
import java.util.List;
public interface IUsuarioModel {
    
    public void crearRegistro(Usuario usuario);
    
    public void actulizarRegistro(Usuario usuario);
    
    public List<Usuario> obtenerRegistros();
    
    public  Usuario obtenerRegistro(int idUsuario);
    
    public void eliminarRegistro(int idUsuario);
}
