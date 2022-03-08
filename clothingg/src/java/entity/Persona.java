/*
    Autor: Mario Hecxai Valencia Reyes
    Fecha de creación: 07 de marzo del 2022
    Fecha de actualización: 08 de marzo del 2022
    Descripción: clase Persona
*/
package entity;

public abstract class Persona {
    private String nombre;
    private String sexo;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
