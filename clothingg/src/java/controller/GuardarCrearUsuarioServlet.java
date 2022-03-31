/*
    Autor: Mario Hecxai Valencia Reyes
    Fecha de creación: 08 de marzo del 2022
    Fecha de actualización: 09 de marzo del 2022
    Descripción: 
 */
package controller;

import entity.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import service.IUsuarioService;
import service.UsuarioServiceImpl;


public class GuardarCrearUsuarioServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IUsuarioService service = new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        usuario.setNombre(request.getParameter("name"));
        usuario.setSexo(request.getParameter("sexo"));
        usuario.setEdad(Integer.parseInt(request.getParameter("edad")));
        usuario.setNombreUsuario(request.getParameter("user"));
        usuario.setContraseña(request.getParameter("password"));
        service.crearRegistro(usuario);
        response.sendRedirect("ListarUsuarioServlet");
    }

    

}
