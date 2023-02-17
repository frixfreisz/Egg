package Servicios;

import Fraccion.Fraccion;
import java.util.Scanner;

public class Servicios {

    public Fraccion fraccion;

    public Servicios() {
        this.fraccion = new Fraccion();
    }

    public void numeros(Scanner leer) {
        System.out.println("Ingrese numerador de la primer fraccion");
        this.fraccion.setNum1(leer.nextInt());
        System.out.println("Ingrese denominador de la primer fraccion");
        this.fraccion.setDen1(leer.nextInt());
        System.out.println("Ingrese numerador de la segunda fraccion");
        this.fraccion.setNum2(leer.nextInt());
        System.out.println("Ingrese denominador de la segunda fraccion");
        this.fraccion.setDen2(leer.nextInt());
    }

    public void suma() {
        int res1 = 0, res2 = 0, resNum = 0, resDen = 0;
        if (this.fraccion.getDen1() == this.fraccion.getDen2()) {
            resNum = this.fraccion.getNum1() + this.fraccion.getNum2();

            resDen = this.fraccion.getDen1();
            System.out.println("La suma de la fraccion es: " + resNum + " / " + resDen);
        } else if (this.fraccion.getDen1() != this.fraccion.getDen2()) {
            res1 = this.fraccion.getNum1() * this.fraccion.getDen2();
            res2 = this.fraccion.getNum2() * this.fraccion.getDen1();
            
            resNum = res1 + res2;
            
            resDen = this.fraccion.getDen1() * this.fraccion.getDen2();
            System.out.println("La suma de la fraccion es: " + resNum + " / " + resDen);
        }
    }

    public void resta() {
        int res1 = 0, res2 = 0, resNum = 0, resDen = 0;
        if (this.fraccion.getDen1() == this.fraccion.getDen2()) {
            resNum = this.fraccion.getNum1() - this.fraccion.getNum2();
            
            resDen = this.fraccion.getDen1();
            System.out.println("La resta de la fraccion es: " + resNum + " / " + resDen);
         } else if (this.fraccion.getDen1() != this.fraccion.getDen2()) {
            resNum = this.fraccion.getNum1() - this.fraccion.getNum2();
        }
        int aux = this.fraccion.getNum2() - (this.fraccion.getNum2() * 2);
        int resNun = aux;
        resDen = this.fraccion.getDen1() * this.fraccion.getDen2();
        System.out.println("La resta de la fraccion es: " + resNum + " / " + resDen);
    }

    public void division() {
        int resNum = this.fraccion.getNum1() * this.fraccion.getDen2();
        int resDen = this.fraccion.getNum2() * this.fraccion.getNum1();
        System.out.println("El resultado de la division es: " + resNum + "/" + resDen);
    }
    
    public void multiplicacion() {
        int resNum = this.fraccion.getNum1() * this.fraccion.getNum2();
        int resDen = this.fraccion.getDen1() * this.fraccion.getDen2();
        System.out.println("El resultado de la multiplicacion es: " + resNum + "/" + resDen);
    }

}
