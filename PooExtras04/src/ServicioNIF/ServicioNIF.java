
package ServicioNIF;

import NIF.NIF;
import java.util.Scanner;

public class ServicioNIF {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public NIF crearNIF(){
        System.out.println("Ingrese su DNI:");
        int dni = leer.nextInt();
        int formula = dni % 23; 
        
        System.out.println("La letra de tu dni es: " + formula);
        String[] tabla = new String[23];
        String frase = "TRWAGMYFPDXBNJZSQVHLCKE";
        for (int i = 0; i < 23; i++) {
            tabla[i] = frase.substring(i, i+1);
            //System.out.print(tabla[i]);
        
        }
        String letra = tabla[formula];
        return new NIF(dni,letra);
    }
    
    public void mostrar(NIF nif){
        System.out.println(nif.getDni() + "-" + nif.getLetra().toUpperCase());
    }
}
