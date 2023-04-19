/*con---------> .replace(char, char)
*/
import java.util.Scanner;

public class Ejnuevo11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase:");
        String cadena = leer.nextLine();
        System.out.println("su palabra codificada es:");
           
                       
        String retorno = Codificado(cadena);
        System.out.println("La cadena codificada es: " + retorno);
                
        
    }
        
    
    public static String Codificado (String cadena){
        String cadenaCodificada;
        cadenaCodificada = cadena.replace("a","@").replace("A", "@").replace("e", "#").replace("E", "#").replace("i", "$").replace("I", "$").replace("o", "%").replace("O", "%").replace("u", "*").replace("U", "*");
        
        return cadenaCodificada;
        }
        
}
