package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String letras = leer.nextLine().toLowerCase();
        if(letras.equals("a")){
            System.out.println("Es una vocal");
        }else if(letras.equals("e")){
            System.out.println("Es una vocal");
        }else if(letras.equals("i")){
            System.out.println("Es una voval");
        }else if(letras.equals("o")){
            System.out.println("Es una vocal");
        }else if(letras.equals("u")){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal");
        }
    }
    
}
