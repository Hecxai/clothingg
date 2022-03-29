package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import service.IUsuarioService;
import service.UsuarioServiceImpl;



public class EliminarUsuarioServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int codigo= Integer.parseInt(request.getParameter("codigo"));
        IUsuarioService service = new UsuarioServiceImpl();
        service.eliminarRegistro(codigo);
        response.sendRedirect("ListarUsuarioServlet");
    }



}
