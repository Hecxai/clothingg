/*
    Autor: Mario Hecxai Valencia Reyes
    Fecha de creación: 07 de marzo del 2022
    Fecha de actualización: 08 de marzo del 2022
    Descripción: 
*/

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
