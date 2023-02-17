
package ahoracado;

import java.util.Scanner;
import entidades.Juego;




public class Ahoracado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Juego juego = new Juego(new String[]{"h","o","l","a"});
        boolean continuar = true;
        do{
        System.out.println("Ingrese una letra: ");
        String letra = leer.nextLine();
        juego.contieneLetra(letra);
        if(juego.esGanador()){
            continuar = false;
        }else if(juego.intentosRestantes() == 0){
            continuar = false;
        }
        
        }while(continuar);
        
    }
    
}
