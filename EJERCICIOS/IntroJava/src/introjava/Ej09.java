
import java.util.Scanner;


public class Ej09 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
      */
      int num, contador, suma;
      contador = 0;
      suma = 0;
        do {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            contador++;
            
            if(num > 0){
                suma = suma + num;
            }else{
                suma = suma + 0;
            }
            if(num == 0) {
                System.out.println("Se detecto el numero 0");
                break;
                
            }
         
        
        }while( contador < 20);
        System.out.println("La suma total es de: " + suma);
      
    }
    
}
