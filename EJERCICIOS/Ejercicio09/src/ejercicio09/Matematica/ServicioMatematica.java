
package ejercicio09.Matematica;

import java.util.Scanner;

public class ServicioMatematica {
    private Matematica matematica;

    
    public void mayor(Matematica matematica){
        if(matematica.getNum1() > matematica.getNum2()){
            System.out.println("El numero: " + matematica.getNum1() + " es mayor que " + matematica.getNum2());
        }else if(matematica.getNum1() < matematica.getNum2()){
            System.out.println("El numero: " + matematica.getNum2() + " es mayor que " + matematica.getNum1());
        
        }
    }  
    
    public double calcularPotencia(Matematica matematica){
        double mayor = 0, menor = 0;
        if(matematica.getNum1() > matematica.getNum2()){
            mayor = matematica.getNum1();
            menor = matematica.getNum2();
        }else if(matematica.getNum1() < matematica.getNum2()){
            mayor = matematica.getNum2();
            menor = matematica.getNum1();
        }
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        double pot = Math.pow(mayor, menor);
        
        return pot;
    }  
    
    public void calcularRaiz(Matematica matematica){
        double  menor = 0;
        if(matematica.getNum1() > matematica.getNum2()){
            menor = matematica.getNum1();
        }else if(matematica.getNum1() < matematica.getNum2()){
            menor = matematica.getNum2();
        }
        int valAbs = Math.abs((int)menor);
        
        System.out.println("La raiz del numero absoluto menor " + Math.sqrt(menor));
    }
  
}
