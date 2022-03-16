/*
    Autor: Mario Hecxai Valencia Reyes
    Fecha de creación: 16 de marzo del 2022
    Fecha de actualización: 
    Descripción: clase ListarUsuarioServlet
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "ListarUsuarioServlet", urlPatterns = {"/ListarUsuarioServlet"})
public class ListarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Servlet</h1>");
    }



}
