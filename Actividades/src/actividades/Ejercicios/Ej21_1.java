package actividades.Ejercicios;

import java.util.Scanner;

public class Ej21_1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrizP = new int[10][10];
        int[][] matriz = new int[3][3];
        System.out.println("Ingrese matriz Principal de 10 x 10");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizP[i][j] = (int) (Math.random() * 10);

            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizP[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Ingrese la matriz a buscar de 3 x 3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("FILA " + i + "COLUMNA " + j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        busqueda(matrizP, matriz);
    }

    public static void busqueda(int[][] matrizP, int[][] matriz) {
        int fila = 0;
        int columna = 0;
        int coincidencia = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizP[i][j] == matriz[0][0]) {
                    for (int k = i; k < (i + 3); k++) {
                        for (int l = j; l < (j + 3); l++) {
                            if (matrizP[k][l] == matriz[k - i][l - j]) {
                                fila = i;
                                columna = j;
                                coincidencia += 1;
                            } else {
                                coincidencia = 0;
                                k = i + 3;
                                l = j + 3;
                                fila = 0;
                                columna = 0;

                            }
                        }
                    }
                }
                if (coincidencia > 0) {
                    System.out.println("La matriz principal contiene a la matriz secundaria");
                    System.out.println("Se encuentra ubicada en: ");
                    for (int m = fila; m < fila + 3; m++) {
                        for (int n = columna; n < columna + 3; n++) {
                            System.out.print("[" + m + "," + n + "]");
                        }
                        System.out.println("");
                    }
                }

            }
        }
    }
}
