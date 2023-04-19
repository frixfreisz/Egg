
package javapooextra6.Servicios;


import java.util.Scanner;
import javapooextra6.Entidades.Ahorcado;

public class AhorcadoService {
    
    static Scanner leer = new Scanner(System.in);
    public void CrearJuego(Ahorcado i){
        System.out.println("Ingrese la palabra");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de jugadas maximas");
        i.setJugadasMaximas(leer.nextInt());
        char[] aux = new char[palabra.length()];
        for (int j = 0; j < palabra.length(); j++) {
            aux[j] = palabra.charAt(j);
        }
        i.setPalabraABuscar(aux);
        i.setLetrasEncontradas(0);
    }
    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.
    */
    public void longitud(Ahorcado i){
        int length = i.getPalabraABuscar().length;
        System.out.println("la longitud es de "+length);
    }
    
    /*
    Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    */
    public char buscar(Ahorcado i) {

        int cont = 0;
        char[] a = i.getPalabraABuscar();
        System.out.println("Ingrese una letra");
        char letra = leer.next().charAt(0);
 
        for (int j = 0; j < i.getPalabraABuscar().length; j++) {
            if (a[j] == letra) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("La letra esta");
        }else{
            System.out.println("La letra no esta");
        }
        return letra;
    }
    /*
    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
    */
    public boolean encontradas(AhorcadoService a, Ahorcado i) {
        boolean esta = false;
        char letra;
        int contCorrectas = 0;
        char[] b = i.getPalabraABuscar();
        do {
            letra = a.buscar(i);
            for (int j = 0; j < i.getPalabraABuscar().length; j++) {
                if (b[j] == letra) {
                    contCorrectas++;
                }
                
            }
            if (contCorrectas > 0) {
                System.out.println("La Letra se encontro " + contCorrectas + " veces");
                esta = true;
                System.out.println("Faltan " + (i.getPalabraABuscar().length - contCorrectas));
                i.setJugadasMaximas(i.getPalabraABuscar().length - contCorrectas);
            } else {
                System.out.println("La Letra no se encontro");
                i.setJugadasMaximas(i.getJugadasMaximas() - 1);
                System.out.println("Te quedan " + i.getJugadasMaximas() + " jugadas");
            }
        } while (i.getJugadasMaximas() != 0);
        if (contCorrectas == (i.getPalabraABuscar().length)) {
            System.out.println("Encontraste la palabra!!");
        }else{
            System.out.println("Perdiste!!");
        }

        return esta;

    }
    /*
    Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    */
    public void  intentos(Ahorcado i){
        i.getJugadasMaximas();
    }
    /*
    Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
    */
    
    public void juego(AhorcadoService a, Ahorcado i){
        a.CrearJuego(i);
        a.longitud(i);
        a.buscar(i);
        a.encontradas(a, i);
        a.intentos(i);
    }
}
