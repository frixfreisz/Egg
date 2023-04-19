package actividades.Ejercicios;

import java.util.Scanner;

public class Act09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String palabra = leer.nextLine().substring(0,1);
        String letra = palabra;
        
        System.out.println("letra = " + letra);
        
        if(letra.equals("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
        
        
    }
    
}
