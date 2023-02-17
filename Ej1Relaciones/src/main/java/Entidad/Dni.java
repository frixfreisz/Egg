
package Entidad;

public class Dni {
    private int numero;

    public Dni() {
    }

    public Dni(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" + "numero=" + numero + '}';
    }
    
}
