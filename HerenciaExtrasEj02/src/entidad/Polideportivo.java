/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Carlitos
 */
public class Polideportivo extends Edificio{
    private String nombrePoli;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombrePoli, boolean techado, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.nombrePoli = nombrePoli;
        this.techado = techado;
    }

    public String getNombrePoli() {
        return nombrePoli;
    }

    public void setNombrePoli(String nombrePoli) {
        this.nombrePoli = nombrePoli;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    

    @Override
    public float calcularSuperficie() {
        return  2 * (this.alto * this.ancho + this.alto * this.largo + this.ancho * this.largo);
        
    }

    @Override
    public float calcularVolumen() {
        return this.alto * this.ancho * this.largo;
    }

    @Override
    public String toString() {
        return "-----------------Polideportivo--------------"+"\nPolideportivo " +  nombrePoli + "\nTechado: " + (techado ? "Si":"No") + "\nSuperficie: " + this.calcularSuperficie() + " mts2" + "\nVolumen: " + this.calcularVolumen() + " mts3"  + "\n--------------------------------------------";
    }
    
}
