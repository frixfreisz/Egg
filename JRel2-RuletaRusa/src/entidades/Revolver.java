
package entidades;

/**
 *
 */

public class Revolver {

    private Integer posActual;
    private Integer posBala;

    public Revolver() {
    }

    public Revolver(Integer posActual, Integer posBala) {
        this.posActual = posActual;
        this.posBala = posBala;
    }

    public Integer getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public Integer getPosBala() {
        return posBala;
    }

    public void setPosBala(Integer posBala) {
        this.posBala = posBala;
    }

    @Override
    public String toString() {
        return "Revolver: " + "Posicion Actual= " + posActual + ", Posicion Agua= " + posBala + '.';
    }
    
    
} //end Revolver
