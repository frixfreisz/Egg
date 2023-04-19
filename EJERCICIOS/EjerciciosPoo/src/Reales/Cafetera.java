package Reales;

import java.util.Scanner;

public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;
    private final double TAZA_PEQUEÑA = 0.150;
    private final double TAZA_MEDIANA = 0.240;
    private final double TAZA_GRANDE = 0.500;

    public Cafetera() {
        this.capacidadMaxima = 2.5;
        this.cantidadActual = 0;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void llenarCafetera(Scanner leer) {
        System.out.println("Quiere llenar la cafetera? s(Si) / n(No)");
        String llenar = leer.nextLine().toLowerCase();
        if (llenar.equals("s")) {
            this.cantidadActual = 2.5;
        }

    }

    public int servirTaza(Scanner leer) {
        int op;
        String salir = "";
        double resultado = 1;
        double resto = 0;
        do {
            System.out.println("Ingrese el tamño de la taza");
            System.out.println("1 - Taza chica  - 150 ml");
            System.out.println("2 - Taza mediana - 240 ml");
            System.out.println("3 - taza grande - 500 ml");
            System.out.println("4 - salir");
            op = leer.nextInt();
            leer.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Eligio una taza chica");
                    resultado = this.cantidadActual -= this.TAZA_PEQUEÑA;
                    if(resultado <= 0){
                        resto = this.TAZA_PEQUEÑA + resultado;
                        System.out.println("La Cafetera se ha vaseado. La taza logro llenarse con " + resto + " ml de cafe");
                        
                    } else {
                        System.out.println("En la Cafetera quedan " + resultado);
                    }
                    break;
                case 2:
                    System.out.println("Eligio una taza mediana");
                    resultado = this.cantidadActual -= this.TAZA_MEDIANA;
                    if(resultado <= 0){
                        resto = this.TAZA_MEDIANA + resultado;
                        System.out.println("La Cafetera se ha vaseado. La taza logro llenarse con " + resto + " ml de cafe");
                        
                    } else {
                        System.out.println("En la Cafetera quedan " + resultado);
                    }
                    break;
                case 3:
                    System.out.println("Eligio una taza grande");
                    resultado = this.cantidadActual -= this.TAZA_GRANDE;
                    if(resultado <= 0){
                        resto = this.TAZA_GRANDE + resultado;
                        System.out.println("La Cafetera se ha vaseado. La taza logro llenarse con " + resto + " ml de cafe");
                        
                    } else {
                        System.out.println("En la Cafetera quedan " + resultado);
                    }
                    break;
                case 4:
                        salir = "s";
                        break;
                    
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;

            }
        } while (!salir.equals("s"));
        return op;
    }
    
    public void vaciarCafetera(){
        this.cantidadActual = 0;
        System.out.println("La cafetera esta vacia");
        
    }
    public void agregarCafe(Scanner leer){
        
        System.out.println("Que cantidad de cafe desea agregar?");
        System.out.println("Cantidad Actual: " + this.cantidadActual);
        double agregar = leer.nextDouble();
        leer.nextLine();
        this.cantidadActual += agregar;
        if(this.cantidadActual > this.capacidadMaxima){
            this.cantidadActual = this.capacidadMaxima;
            System.out.println("La cafetera esta llena");
        }else{
            System.out.println("La cafetera quedo con " + this.cantidadActual + " ml");
        }
        
    }

}
    

