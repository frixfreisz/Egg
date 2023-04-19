/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Carlitos
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private long dni;
    private String email;
    private String domicilio;
    private long telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, long dni, String email, String domicilio, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "---------------------------------------" + "\n| Nombre: " + nombre + " | Apellido: " + apellido + " | DNI: " + dni + "\n| Email: " + email + " | Domicilio: " + domicilio + " | Telefono: " + telefono + "\n---------------------------------------" + "\n";
    }
    
    
}
