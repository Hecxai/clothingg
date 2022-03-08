/*
    Autor: Mario Hecxai Valencia Reyes
    Fecha de creación: 07 de marzo del 2022
    Fecha de actualización: 08 de marzo del 2022
    Descripción: clase Producto
*/
package entity;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String codigo, nombre;
    private double precio;
    private String descripcion;
    

    public Producto() {
    }
    
    public Producto(String codigo, String nombre, double precio, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public static void main(String[] args) {
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();
        
        p1.setCodigo("00001");
        p1.setDescripcion("Bebida de soda");
        p1.setNombre("Coca cola");
        p1.setPrecio(17.6);
        
        p2.setCodigo("00002");
        p2.setDescripcion("Frituras de papa frita");
        p2.setNombre("Sabritas");
        p2.setPrecio(17.6);
        
        p3.setCodigo("00003");
        p3.setDescripcion("Pasta compuesta de harina");
        p3.setNombre("Galletas");
        p3.setPrecio(17.6);
        
        List lista = null;
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        
        //(List<String> nombreProductos = new ArrayList<String>();
        for (Object produc:lista){
            System.out.println(produc);
        }
        
    }
    
    
    
}
