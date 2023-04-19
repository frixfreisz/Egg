
import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese true o false");
        boolean bandera = leer.nextBoolean();
        System.out.println("Ingrese un numero decimal");
        double numero = leer.nextDouble();
        System.out.println("Ingrese una letra");
        char letra = leer.next().charAt(0);
        
        System.out.println("bandera = " + bandera);
        System.out.println("numero = " + numero);
        System.out.println("letra = " + letra);
                
    }
    
}
