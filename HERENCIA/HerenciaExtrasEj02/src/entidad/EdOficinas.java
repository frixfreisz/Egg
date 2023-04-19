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
public class EdOficinas extends Edificio {
    private int numOficinas;
    private int numPersonasXOficina;
    private int cantPisos;

    public EdOficinas() {
    }

    public EdOficinas(int numOficinas, int numPersonasXOficina, int cantPisos, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.numPersonasXOficina = numPersonasXOficina;
        this.cantPisos = cantPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getNumPersonasXOficina() {
        return numPersonasXOficina;
    }

    public void setNumPersonasXOficina(int numPersonasXOficina) {
        this.numPersonasXOficina = numPersonasXOficina;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }
    
    
    

    @Override
    public float calcularSuperficie() {
        return  2 * (this.alto * this.ancho + this.alto * this.largo + this.ancho * this.largo)* this.cantPisos;
    }

    @Override
    public float calcularVolumen() {
        return this.alto * this.ancho * this.largo * this.cantPisos;
    }

    @Override
    public String toString() {
        return "-------------Edificio de Oficinas------------" + "\nNumero de oficinas: " + numOficinas + "\nCapacidad de personas por oficina: " + "\nCapacidad de personas en total: " + numPersonasXOficina + this.totalPersonasMaxima() + "\nCantidad de pisos: " + cantPisos + "\nSuperficie: " + this.calcularSuperficie() + " mts2" + "\nVolumen : " + this.calcularVolumen() + " mts3" +"\n-------------------------------------------";
    }
    
    public int totalPersonasMaxima(){
        int cantTotal = this.numPersonasXOficina * this.cantPisos;
        return cantTotal;
    }
}
