
package ejercicio09;

import ejercicio09.Matematica.Matematica;
import ejercicio09.Matematica.ServicioMatematica;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioMatematica serv = new ServicioMatematica();
        Matematica mat = new Matematica();

        mat.setNum1(Math.random()*(10));
        mat.setNum2(Math.random()*(10));
        //System.out.println("num1 " + mat.getNum1() + " num2 " + mat.getNum2());
        serv.mayor(mat);
        System.out.println("La potencia del numero mayor elevado al numero menor es: " + (int)serv.calcularPotencia(mat));
        serv.calcularRaiz(mat);
      
    }

}
