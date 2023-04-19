package actividades.Ejercicios;

public class cuadrado {

    public static void main(String[] args) {

        int n = 7;
        String[][] cuadrado = new String[n][n];

        for (int fila = 0; fila < cuadrado.length; fila++) {
            for (int columna = 0; columna < cuadrado.length; columna++) {
                if (fila == 0 || fila == cuadrado.length - 1 || columna == 0 || columna == cuadrado.length - 1) {
                    cuadrado[fila][columna] = " *";
                }else{
                    cuadrado[fila][columna] = "  ";
                }

            }

        }
        for (int fila = 0; fila < cuadrado.length; fila++) {
            for (int columna = 0; columna < cuadrado.length; columna++) {
                System.out.print(cuadrado[fila][columna]);

            }
            System.out.println("");
        }

    }
}    

