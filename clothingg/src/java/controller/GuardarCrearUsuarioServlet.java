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
        usuario.setEdad(Integer.parseInt(request.getParameter("number")));
        usuario.setNombreUsuario(request.getParameter("user"));
        usuario.setContraseña(request.getParameter("contraseña"));
        service.crearRegistro(usuario);
        response.sendRedirect("ListarUsuarioServlet");
    }

    

}
