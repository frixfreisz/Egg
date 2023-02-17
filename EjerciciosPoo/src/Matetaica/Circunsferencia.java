
package Matetaica;

import java.util.Scanner;

public class Circunsferencia {
    private double radio;
    
    public Circunsferencia(){
        
    }

    public Circunsferencia(double radio) {
        this.radio = radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double gerRadio(){
        return this.radio;
    }
    public static Circunsferencia crearCircunsferencia(Scanner leer){
        System.out.println("Escriba el radio: ");
        double radio = leer.nextDouble();
        
        Circunsferencia circ = new Circunsferencia(radio);
        return circ;
    }
    public double getArea(){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    public double getPerimetro(){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    public String toString(){
        return "El radio ingresado es de: " + radio + " con un area de " + getArea() + " con un perimetro de " + getPerimetro();
    }
}
