package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Carlitos
 */
public class Sala {
    
    private Pelicula pelicula;
    private ArrayList<ArrayList<String>>asientos = new ArrayList<>();
    private Float precio;

    public Sala() {
    }

    public Sala(Pelicula pelicula, Float precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<ArrayList<String>> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<ArrayList<String>> asientos) {
        this.asientos = asientos;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Sala{" + "pelicula=" + pelicula + ", asientos=" + asientos + ", precio=" + precio + '}';
    }

}
    
    
    

