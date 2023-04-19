
import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese tipo de bomba");
        System.out.println("---------------------------");
        System.out.println("1-Bomba de agua");
        System.out.println("2-Bomba de gasolina");
        System.out.println("3-Bomba de hormigon");
        System.out.println("4-Bomba de pasta alimenticia");
        System.out.println("---------------------------");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe ningun valor valido para ese tipo de bomba");

    }
    }
    
}
