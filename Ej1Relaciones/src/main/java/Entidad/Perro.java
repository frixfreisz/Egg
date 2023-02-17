
package Entidad;

public class Perro {
    private String nombreP;
    private String raza;
    private int edad;
    private String tamano;

    public Perro() {
    }

    public Perro(String nombreP, String raza, int edad, String tamano) {
        this.nombreP = nombreP;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombreP=" + nombreP + ", raza=" + raza + ", edad=" + edad + ", tamano=" + tamano + '}';
    }
    
    
}
