
import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numero");
        int num1, num2;
        System.out.println("Numero 1: ");
        num1 = leer.nextInt();
        System.out.println("NUmero 2: ");
        num2 = leer.nextInt();
        
        if(num1 >= 25 && num2 >= 25){
            System.out.println("Uno de los numero o ambos numeros ingresados es mayor a 25");
                   
        }else {
            System.out.println("Ningun numero ingresado es mayor a 25");
        }
    }
    
}
