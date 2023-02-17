package actividades.Ejercicios;

import java.util.Scanner;

public class Act11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int menu = 0;
        int num1 = 0;
        int num2 = 0;
        String salir ="";
        
        System.out.println("Ingresa el primer numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        num2 = leer.nextInt();
        String op = "";

        do {
            System.out.println("Que operacion desea hacer?");
            System.out.println("");
            System.out.println("*************************");
            System.out.println("           MENU          ");
            System.out.println("*************************");
            System.out.println("1 - SUMAR");
            System.out.println("2 - RESTAR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - SALIR");
            System.out.println("*************************");

            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    int retornoSuma = sumar(num1, num2);
                    System.out.println("El resultado de " + num1 + " + " + num2 + " es: " + retornoSuma);
                    System.out.println("");
                    break;
                case 2:
                    int retornoResta = restar(num1, num2);
                    System.out.println("El resultado de " + num1 + " - " + num2 + " es: " + retornoResta);
                    System.out.println("");
                    break;
                case 3:
                    int retornoMultiplicacion = multiplicar(num1, num2);
                    System.out.println("El resultado de " + num1 + " x " + num2 + " es: " + retornoMultiplicacion);
                    System.out.println("");
                    break;
                case 4:
                    double retornoDividir = sumar(num1, num2);
                    System.out.println("El resultado de " + num1 + " / " + num2 + " es: " + retornoDividir);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Seguro que desea salir? s/n.");
                    salir = leer.next().toLowerCase();
                    System.out.println("");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta.");

            }

        } while (! salir.equals("s"));
        
        System.out.println("Fin del programa");
    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }

    public static int multiplicar(int num1, int num2) {
        int multi;
        multi = num1 * num2;
        return multi;
    }

    public static double dividir(int num1, int num2) {
        double division;
        division = num1 / num2;
        return division;
    }
}
        
