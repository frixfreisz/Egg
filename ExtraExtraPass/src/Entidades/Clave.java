
package Entidades;

public class Clave {
    
    private String nombre;
    private int dni;
    private String contrasenia;

    public Clave() {
    }

    public Clave(String nombre, int dni, String contrasenia) {
        this.nombre = nombre;
        this.dni = dni;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
