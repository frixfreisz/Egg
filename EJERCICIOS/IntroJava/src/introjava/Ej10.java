
import java.util.Scanner;


public class Ej10 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        System.out.println("Ingrese 4 numeros: ");
        for (int i = 0; i < 4; i++) {
            num = leer.nextInt();
            System.out.print(num);
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            
            }
            System.out.println("");
        }

    }
    
}
