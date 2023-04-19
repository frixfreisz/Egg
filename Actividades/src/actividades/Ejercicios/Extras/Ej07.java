package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
        int limite;
        int menor;
        int mayor;
        int num;
        int contador = 0;
        double suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos numero quiere ingresar");
        limite = leer.nextInt();
        System.out.println("Digite número: ");
        num = leer.nextInt();
        menor = num;
        mayor = num;

//        while (contador < limite - 1) {
//
//            System.out.println("Digite número: ");
//            num = leer.nextInt();
//            contador++;
//            suma = suma + num;
//            if (num > mayor) {
//                mayor = num;
//            }
//
//            if (num < menor) {
//                menor = num;
//            }
//        }
//
//        System.out.println("El mayor es: " + mayor + " y el menor es: " + menor);
//        System.out.println("El promedio de los numeros es: " + suma / contador);
//    }
//}
//CON DO WHILE
        do {

            System.out.println("Digite número: ");
            num = leer.nextInt();
            contador++;
            suma = suma + num;
            if (num > mayor) {
                mayor = num;
            }

            if (num < menor) {
                menor = num;
            }
        }while (contador < limite - 1);

        System.out.println("El mayor es: " + mayor + " y el menor es: " + menor);
        System.out.println("El promedio de los numeros es: " + suma / contador);
    }
}