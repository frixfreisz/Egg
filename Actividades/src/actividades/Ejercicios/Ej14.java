package actividades.Ejercicios;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String salir = "n";

        do {
            System.out.println("Ingrese el valor que desea consultar:");
            double valor = leer.nextDouble();

            System.out.println("Usted ingreso = " + valor + " Euros");

            System.out.println("A que moneda desea convertir?");
            System.out.println("1 - Libras esterlinas");
            System.out.println("2 - Dolares");
            System.out.println("3 - Yenes");
            System.out.println("4 - salir");

            int op = leer.nextInt();
            System.out.println();

            switch (op) {
                case 1:
                    le(valor);
                    break;
                case 2:
                    usd(valor);
                    break;
                case 3:
                    yen(valor);
                    break;
                case 4:
                    System.out.println("Seguro que desea salir? S/N.");
                    salir = leer.next();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (! salir.equalsIgnoreCase("s"));
        System.out.println("Fin del programa.");

    }

    public static void le(double valor) {
        double libEst = valor * 0.86;
        System.out.println(valor + " € equivalen a " + libEst + " £");

    }

    public static void usd(double valor) {
        double dolar = valor * 1.28611;
        System.out.println(valor + " € equivalen a " + dolar + " $");
    }

    public static void yen(double valor) {
        double yenes = valor * 129.852;
        System.out.println(valor + " € equivalen a " + yenes + "  ¥");
    }
}
