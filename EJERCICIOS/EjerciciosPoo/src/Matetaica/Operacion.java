package Matetaica;

import java.util.Scanner;

public class Operacion {
    private int num1;
    private int num2;
    
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Operacion(){
                
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getNun1(){
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }
    public static Operacion crearOperacion(Scanner leer){
        System.out.println("Ingrese primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        
        Operacion operacion = new Operacion(num1, num2);
        return operacion;
    }
    public int Suma(){
        int resultado = this.num1 + this.num2;
        return resultado;
    }
    public int Resta(){
        int resultado = this.num1 - this.num2;
        return resultado;
    }
    public String Multiplicar(){
        String resultado = "";
        if (num1 == 0 || num2 == 0){
            resultado = "Uno de los numero es 0 por lo tanto el resultado es 0";
        }else{
            resultado = "La multiplicacion es igual a: " + this.num1 * this.num2;
        }
        return resultado;
    }
    public String Dividir(){
        String resultado = "";
        if (num1 == 0 || num2 == 0){
            resultado = "Uno de los numero es 0 por lo tanto el resultado es 0";
        }else{
            resultado = "La division es igual a: " + (double)this.num1 / (double)this.num2;
        }
        return resultado;
    }
    

}
