package actividades.Ejercicios.Extras;
import java.util.Scanner;
public class mayorYmenor {
public static void main(String[] args){        
    int menor;
    int mayor;
    int num;
    Scanner leer = new Scanner(System.in);
    System.out.println("Digite número: ");
    num = leer.nextInt();
    menor = num;
    mayor = num;
    

    for(int i=1; i<=5; i++){

        System.out.println("Digite número: ");
        num = leer.nextInt();
        
        if(num > mayor){
            mayor = num;
        }

        if(num < menor){
            menor = num;
        }            
    }
    

    System.out.println("El mayor es: " + mayor + " y el menor es: " + menor);
}    
}