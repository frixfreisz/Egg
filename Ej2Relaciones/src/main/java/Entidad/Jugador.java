
package Entidad;

/**
 *
 * @author Carlitos
 */
public class Jugador {
    private int id;
    private String nommbre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nommbre, boolean mojado) {
        this.id = id;
        this.nommbre = nommbre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nommbre=" + nommbre + ", mojado=" + mojado + '}';
    }
    
}
