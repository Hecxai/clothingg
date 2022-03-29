package controller;

import entity.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import service.IUsuarioService;
import service.UsuarioServiceImpl;

public class ListarUsuarioServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
            out.println("<head>");
                out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/resources/css/estiloslistarusuarioservlet.css'>");
                out.println("<script type='text/javascript' src='"+request.getContextPath()+"/resources/js/script.js'></script>");
                out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/resources/css/estilosindex.css'>");
                System.out.println(request.getContextPath());
            out.println("</head>");

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
                
                out.println("<table>");

                    out.println("<tr>");

                        out.println("<th id='population'>Código</th>");
                        
                        out.println("<th>Nombre</th>");
                        
                        out.println("<th>Sexo</th>");
                        
                        out.println("<th>Edad</th>");

                        out.println("<th>Nombre de usuario</th>");

                        out.println("<th>Contraseña</th>");
                        
                        out.println("<th>Editar</th>");
                        
                        out.println("<th>Eliminar</th>");

                    out.println("</tr>");

                    IUsuarioService service = new UsuarioServiceImpl();

                    List<Usuario> listaUsuario = service.obtenerRegistros();

                    out.println("<tbody>");
                    for (Usuario usuario : listaUsuario) {
                        out.println("<tr>");
                            out.println("<td>"+usuario.getCodigo()+"</td>");
                            out.println("<td>"+usuario.getNombre()+"</td>");
                            out.println("<td>"+usuario.getSexo()+"</td>");
                            out.println("<td>"+usuario.getEdad()+"</td>");
                            out.println("<td>"+usuario.getNombreUsuario()+"</td>");
                            out.println("<td>"+usuario.getContraseña()+"</td>");
                            out.println("<td><a href='EditarUsuarioServlet?codigo="+usuario.getCodigo()+"'>Editar</a></td>");
                            out.println("<td><a onClick='confirmar("+usuario.getCodigo()+")'>Eliminar</a></td>");
                        out.println("</tr>");
                    }
                    out.println("</tbody>");

                out.println("</table>");

            out.println("</body>");

        out.println("</html>");

    }

}
