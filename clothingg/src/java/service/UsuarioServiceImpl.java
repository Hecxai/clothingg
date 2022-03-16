/*
    Autor: Mario Hecxai Valencia Reyes
    Fecha de creación: 16 de marzo del 2022
    Fecha de actualización: 
    Descripción: clase UsuarioServiceImpl
 */
package service;

import entity.Usuario;
import java.util.List;
import model.IUsuarioModel;
import model.IUsuarioModelImpl;


public class UsuarioServiceImpl implements IUsuarioService{
    
    IUsuarioModel modelo = new IUsuarioModelImpl();
    
    @Override
    public void crearRegistro(Usuario usuario) {
        modelo.crearRegistro(usuario);
    }

    @Override
    public void actulizarRegistro(Usuario usuario) {
        modelo.actulizarRegistro(usuario);
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        return modelo.obtenerRegistros();
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        return modelo.obtenerRegistro(idUsuario);
    }

    @Override
    public void eliminarRegistro(int idUsuario) {
        modelo.eliminarRegistro(idUsuario);
    }
    
}
