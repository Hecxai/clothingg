/*
    Autor: Mario Hecxai Valencia Reyes
    Fecha de creación: 07 de marzo del 2022
    Fecha de actualización: 08 de marzo del 2022
    Descripción: clase Usuario
*/
package entity;

import java.util.List;


public class Usuario extends Persona{
    private String codigo;
    private String nombreUsuario;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(String codigo, String nombreUsuario, String contraseña) {
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();
        Usuario u3 = new Usuario();
        
        u1.setNombreUsuario("Carlos");
        u1.setContraseña("carlos123");
        u1.setCodigo("001");
        
        u2.setNombreUsuario("Juan");
        u2.setContraseña("juan123");
        u2.setCodigo("002");
        
        u3.setNombreUsuario("Marcelo");
        u3.setContraseña("juan123");
        u3.setCodigo("003");
        
        List lista=null;
        
        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        
        
        for(Object usu:lista){
            System.out.println(usu);
        }
    }
    
    
}
