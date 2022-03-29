package controller;

import entity.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import service.IUsuarioService;
import service.UsuarioServiceImpl;


public class GuardarEditarUsuarioServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html");
        IUsuarioService service = new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        usuario.setCodigo(request.getParameter("codigo"));
        usuario.setNombre(request.getParameter("nombre"));
        usuario.setSexo(request.getParameter("sexo"));
        usuario.setEdad(Integer.parseInt(request.getParameter("edad")));
        usuario.setNombreUsuario(request.getParameter("nombreusuario"));
        usuario.setContraseña(request.getParameter("contraseña"));
        service.actulizarRegistro(usuario);
        response.sendRedirect("ListarUsuarioServlet");
        
        
   
        
        
        
        
        
    }


}