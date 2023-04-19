/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Carlitos
 */

public class Alquiler {
    private String nombre;
    private String dni;
    private LocalDate fechaAlquila;
    private LocalDate fechaDevuelve;
    private Integer posAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, String dni, LocalDate fechaAlquila, LocalDate fechaDevuelve, Integer posAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquila = fechaAlquila;
        this.fechaDevuelve = fechaDevuelve;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquila() {
        return fechaAlquila;
    }

    public void setFechaAlquila(LocalDate fechaAlquila) {
        this.fechaAlquila = fechaAlquila;
    }

    public LocalDate getFechaDevuelve() {
        return fechaDevuelve;
    }

    public void setFechaDevuelve(LocalDate fechaDevuelve) {
        this.fechaDevuelve = fechaDevuelve;
    }

    public Integer getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(Integer posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler -->" + " Cliente " + nombre + ", dni: " + dni 
                + "\n, fecha de alquiler " + fechaAlquila.format(DateTimeFormatter.ofPattern(" dd MMM yyyy"))  
                + ", fecha de devolucion " + fechaDevuelve.format(DateTimeFormatter.ofPattern("dd MMM yyyy"))
                + "\n, Poste de amarre N° " + posAmarre + ", \nBarco:" + barco;
    }
    
    
    
    
}
