
import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String cadena = leer.nextLine().toLowerCase();

        String retorno = codificado(cadena);
        System.out.println("La frase codificada es: " + retorno);

    }

    public static String codificado(String cadena) {
        String codigo = "";
        int longitud = cadena.length();
        char letra;

        for (int i = 0; i < longitud; i++) {
            letra = cadena.charAt(i);
            switch (letra) {
                case 'a':
                    letra = '@';
                    break;
              case 'e':
                    letra = '#';
                    break;
                
                case 'i':
                    letra = '$';
                    break;
                
                case 'o':
                    letra = '%';
                    break;
                
                case 'u':
                    letra = '*';
                    break;
                
                default:

            }
            codigo = (codigo + letra);
        }

        return codigo;

    }

}  
          
      