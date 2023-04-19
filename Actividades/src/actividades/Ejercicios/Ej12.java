
package actividades.Ejercicios;
/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals()
*/
import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String cadena = "";
        do{
            System.out.println("Ingrese una frase de 5 caracteres.");
            cadena = leer.nextLine().toLowerCase();
            int longitud = cadena.length();
            if(cadena.substring(0,1).equals("x") && cadena.substring(longitud-1, longitud).equals("o")){
                System.out.println("cadena correcta");
                correctas++;
                
            }else if(("&&&&&".equals(cadena)))
{
                
                
            }else{
               System.out.println("cadena incorrecta");
                incorrectas++;
            }
         
        }while (! cadena.equals("&&&&&"));
        System.out.println("Se encontro una frase FDE");
        System.out.println("correctas = " + correctas);
        System.out.println("incorrectas = " + incorrectas);
        
            
        
    }
    
}
