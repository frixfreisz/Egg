
package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese clase de socio.");
        System.out.println("Socio tipo A");
        System.out.println("Socio tipo B");
        System.out.println("Socio tipo C");
        char socio = leer.next().charAt(0);
        double monto = 0;
       
        switch(socio){
            case 'a':
                System.out.println("Usted es socio tipo A - Tiene a favor un %50 de descuento");
                System.out.println("Ingrese el monto del tratamiento");
                monto = leer.nextDouble();
                double montoA = monto * 50 / 100;
                System.out.println("le corresponde abonar: $" + (monto * 50) / 100);
                break;
            case 'b':
                System.out.println("Usted es socio tipo B - Tiene a favor un %35 de descuento");
                System.out.println("Ingrese el monto del tratamiento");
                monto = leer.nextDouble();
                double montoB = monto * 35 / 100;
                System.out.println("le corresponde abonar: $" + (monto - montoB));
                break;
            case 'c':
                System.out.println("Usted es socio tipo C");
                System.out.println("Ingrese el monto del tratamiento");
                monto = leer.nextDouble();
                System.out.println("le corresponde abonar: $" + monto);
                break;
            default:
                System.out.println("Finalizar");
                
                
        }
        
        
    }
    
}
