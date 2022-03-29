/*
    Autor: Mario Hecxai Valencia Reyes
    Fecha de creación: 16 de marzo del 2022
    Fecha de actualización: 
    Descripción: clase IUsuarioService
 */
package service;

import entity.Usuario;
import java.util.List;

public interface IUsuarioService {

    public void crearRegistro(Usuario usuario);

    public void actulizarRegistro(Usuario usuario);

    public List<Usuario> obtenerRegistros();

    public Usuario obtenerRegistro(int idUsuario);

    public void eliminarRegistro(int idUsuario);

}
