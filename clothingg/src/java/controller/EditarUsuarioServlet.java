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
        
        
        out.println("<header>");
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
        
        
        out.println("<div>");
        
            out.println("<div>");

                out.println("<form action='GuardarEditarUsuarioServlet' method='get'>");
                  

                    



                    out.println("<input type='hidden' name='codigo' value='"+usuario.getCodigo()+"'>");

                    out.println("<p>");
                    out.println("<label>Nombre:</label>");
                    out.println("<input type='text' name='nombre' value='"+usuario.getNombre()+"'>");
                    out.println("</p>");

                    out.println("<p>");
                    out.println("<label>Sexo:</label>");
                    out.println("<input type='text' name='sexo' value='"+usuario.getSexo()+"'>");
                    out.println("</p>");

                    out.println("<p>");
                    out.println("<label>Edad:</label>");
                    out.println("<input type='text' name='edad' value='"+usuario.getEdad()+"'>");
                    out.println("</p>");

                    out.println("<p>");
                    out.println("<label>Nombre usuario:</label>");
                    out.println("<input type='text' name='nombreusuario' value='"+usuario.getNombreUsuario()+"'>");
                    out.println("</p>");

                    out.println("<p>");
                    out.println("<label>Contraseña:</label>");
                    out.println("<input type='text' name='contraseña' value='"+usuario.getContraseña()+"'>");
                    out.println("</p>");

                    out.println("<p>");
                    out.println("<input type='submit' value='Guardar'>");
                    out.println("</p>");

                out.println("</form>");
            out.print("</div>");
        
        out.println("</div>");
        
        out.println("</body>");
        
        
    }





}
