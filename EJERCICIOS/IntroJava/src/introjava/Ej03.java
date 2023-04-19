
import java.util.Scanner;

public class Ej03 {

    private Scanner leer;

    public Ej03(Scanner leer){
        this.leer = leer;
    }

    public void ejecutar3() {
        
        int num1 = 5; 
        int num2 = 8;
        
        int suma = num1 + num2;
        int multiplicacion = num1 * num2;        
        double division = num2 / num1;
        boolean bandera = num1 > num2;
        
        System.out.println("suma = " + suma);
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("division = " + division);
        System.out.println("bandera = " + bandera);
    }
    
}
