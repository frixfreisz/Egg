
package Cafetera;

public class Cafetera {
   private double capaMaxima;
   private double cantActual;
   private final double TAZA_PEQUEÑA = 0.150;
   private final double TAZA_MEDIANA = 0.240;
   private final double TAZA_GRANDE = 0.500;

    public Cafetera() {
        this.capaMaxima = 2.5;
        this.cantActual = 0;
    }

    public Cafetera(double capaMaxima, double cantActual) {
        this.capaMaxima = 2.5;
        this.cantActual = cantActual;
    }

    public double getCapaMaxima() {
        return capaMaxima;
    }

    public void setCapaMaxima(double capaMaxima) {
        this.capaMaxima = capaMaxima;
    }

    public double getCantActual() {
        return cantActual;
    }

    public void setCantActual(double cantActual) {
        this.cantActual = cantActual;
    }

    public double getTAZA_PEQUEÑA() {
        return TAZA_PEQUEÑA;
    }

    public double getTAZA_MEDIANA() {
        return TAZA_MEDIANA;
    }

    public double getTAZA_GRANDE() {
        return TAZA_GRANDE;
    }
}
