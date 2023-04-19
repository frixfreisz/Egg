package actividades.Ejercicios;

public class Ej18 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                matriz[f][c] = (int) (Math.random() * 10);

            }

        }
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(matriz[f][c] + " | ");

            }
            System.out.println("");
            
        }
        System.out.println("");
      
        
        for (int c = 0; c < matriz.length; c++) {
            for (int f = 0; f < matriz.length; f++) {
                System.out.print(matriz[f][c] + " | ");

            }
            System.out.println("");
        }

    }
}
