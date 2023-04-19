/* -----------> con if

*/
import java.util.Scanner;

public class otro11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        
        String retorno = Codificado(frase);
        System.out.println("La palabra codificada es " + retorno);
    }    
        public static String Codificado(String frase){
            char letra;
            String codigo = "";
            
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);

            if (letra == 'a' || letra == 'A') {
                letra = '@';
            }
            if (letra == 'e' || letra == 'E') {
                letra = '#';
            }
            if (letra == 'i' || letra == 'I') {
                letra = '$';
            }
            if (letra == 'o' || letra == 'O') {
                letra = '%';
            }
            if (letra == 'u' || letra == 'U') {
                letra = '*';
            } else {
                codigo = codigo + letra;
            }
        }
        return codigo;
        
        }        
    

}    