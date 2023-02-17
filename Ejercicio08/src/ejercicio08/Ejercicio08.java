
package ejercicio08;

import Cadena.Cadena;
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena cadena = new Cadena();
        System.out.println("Ingrese la frase:");
String frase = leer.nextLine();
cadena.setFrase(frase);
int[] vocales = cadena.mostrarVocales();
int cantVocales = 0;
        for (int i = 0; i < vocales.length; i++) {
            cantVocales += vocales[i];
            
        }
        System.out.println("La frase contiene " + cantVocales + " vocales");
        System.out.println(" a: " + vocales[0]);
        System.out.println(" e: " + vocales[1]);
        System.out.println(" i: " + vocales[2]);
        System.out.println(" o: " + vocales[3]);
        System.out.println(" u: " + vocales[4]);
        
        System.out.println("La frase invertida es: " + cadena.invertirFrase());
        System.out.println("Elija un caracter a  buscar: ");
        String caracter = leer.nextLine();
        System.out.println("El caracter se repite: " + cadena.vesesRepetido(caracter.charAt(0)));
        System.out.println("Ingrese una nueva frase para comparar su longitud");
        String newFrase = leer.nextLine();
        int resultado = cadena.compararLongitud(newFrase.length());
        if(resultado < 0){
            System.out.println("La nueva frase es mas larga");
            
        }else if(resultado == 0){
            System.out.println("Las frases son iguales de largas");
        }else{
            System.out.println("La frase original es mas larga");
        }
        
        System.out.println("La nueva frase es: " + cadena.unirFrase(newFrase));
        System.out.println("Ingrese la letra a reemplazara la letra a : ");
        String newLetra = leer.nextLine();
        System.out.println("La frase quedo de la siguiente manera:" + cadena.reemplazarFrase(newLetra.charAt(0)));
        boolean contiene = cadena.contieneLetra(newLetra.charAt(0));
        if(contiene == true){
            System.out.println("La frase contiene la letra " + newLetra);
        }else{
            System.out.println("La frase no contiene la letra " + newLetra);
        }
                
        System.out.println("");
        
        
   }

}