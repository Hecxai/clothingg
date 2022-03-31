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
import java.io.PrintWriter;
import service.IUsuarioService;
import service.UsuarioServiceImpl;




public class EditarUsuarioServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        IUsuarioService service = new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        usuario = service.obtenerRegistro(codigo);
        out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/resources/css/estiloscrearregistro.css'>");
        out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/resources/css/estilosindex.css'>");
        
        out.println("<body>");
        
        
        out.println("<header class='menu'>");
        out.println("<input type='checkbox' id='btn-menu'>");
        out.println("<label for='btn-menu'><i class='fa fa-bars'></i></label>");
        out.println("<nav class='navbar'>");
        out.println("<ul>");
        out.println("<li><a href='"+request.getContextPath()+"/pages/index.html'>Home</a></li> ");
        out.println("<li><a href='"+request.getContextPath()+"/pages/crearRegistro.html'>Crear</a></li> ");
        out.println("<li><a href='ListarUsuarioServlet'>Editar</a></li>");
        out.println("<li><a href='ListarUsuarioServlet'>Eliminar</a></li>");
        out.println("<li><a href='"+request.getContextPath()+"/pages/acercade.html'>Acerca de..</a></li> ");
        out.println("</ul>");
        out.println("</nav>");
        out.println("</header>");
        
        out.println("<h1 class='titulo'>");
            out.println("<span>Modificación de usuario</span>");
        out.println("</h1>");
        
        
        out.println("<div class='container'>");
        

                out.println("<form id='survey-form' action='GuardarEditarUsuarioServlet' method='get'>");


                    out.println("<input type='hidden' name='codigo' value='"+usuario.getCodigo()+"'>");

                    out.println("<div class='form-group'>");
                    out.println("<label id='name-label' for='name'>Nombre:</label>");
                    out.println("<input type='text' name='name' value='"+usuario.getNombre()+"' id='name' class='form-control'>");
                    out.println("</div>");

                    out.println("<div class='form-group'>");
                    out.println("<label for='sexo' id='sexo-label'>Sexo:</label>");
                    out.println("<input type='text' name='sexo' value='"+usuario.getSexo()+"' id='sexo' class='form-control'>");
                    out.println("</div>");

                    out.println("<div class='form-group'>");
                    out.println("<label id='number-label' for='number'>Edad:</label>");
                    out.println("<input type='text' name='number' value='"+usuario.getEdad()+"' id='number' class='form-control'>");
                    out.println("</div>");

                    out.println("<div class='form-group'>");
                    out.println("<label id='user-label' for='user'>Nombre usuario:</label>");
                    out.println("<input type='text' name='user' value='"+usuario.getNombreUsuario()+"' id='user' class='form-control'>");
                    out.println("</div>");

                    out.println("<div class='form-group'>");
                    out.println("<label id='password-label' for='password'>Contraseña:</label>");
                    out.println("<input type='text' name='contraseña' value='"+usuario.getContraseña()+"' id='password' class='form-control'>");
                    out.println("</div>");

                    out.println("<div class='form-group'>");
                    out.println("<button type='submit' id='submit' class='submit-button'>Enviar</button>");
                    out.println("</div>");

                out.println("</form>");

        
        out.println("</div>");
        
        out.println("</body>");
        
        
    }





}
