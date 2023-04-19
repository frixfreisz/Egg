
package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej06 {
static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Cuantas personas quiere comparar?");
        int personas = leer.nextInt();
        double promedio1 = 0;
        double promedioTotal = 0;
        double sumaBaja = 0;
        double sumaTotal = 0;
        int total = 0;
        int bajas = 0;
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona " + i);
            double altura = leer.nextDouble();
            if(altura < 1.6){
                bajas++;
                sumaBaja = sumaBaja + altura;
            }
            sumaTotal = sumaTotal + altura;      
            
        }
        System.out.println("El promedio de estaturas bajas es: " + (sumaBaja / bajas));
        System.out.println("El promedio general de estaturas es de: " + (sumaTotal / personas));
    }
    
}
