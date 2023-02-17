package actividades.Ejercicios;

import java.util.Scanner;

public class Act10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor limite:");
        int limite = leer.nextInt();
        int suma = 0;
        int num = 0;

        do {
            System.out.println("ingrese un numero:");
            num = leer.nextInt();
            suma = suma + num;
        }  while (suma <= limite);
        System.out.println("Se ha superado el nivel inicial");
        System.out.println("suma = " + suma);
    }
}
    

