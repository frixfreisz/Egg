
package entidades;

/**
 *
 */

public class Jugador {

    private Integer id;
    private String nombre;
    private Boolean muerto;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre + " " + id;
        this.muerto = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMuerto() {
        return muerto;
    }

    public void setMuerto(Boolean muerto) {
        this.muerto = muerto;
    }

    @Override
    public String toString() {
        return "Jugador: " + "Id= " + id + ", Nombre= " + nombre + ", Muerto= " + muerto + '.';
    }

    
    

} //end Jugador
