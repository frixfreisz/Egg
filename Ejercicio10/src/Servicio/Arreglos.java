
package Servicio;
import java.util.Arrays;
public class Arreglos {

    public double[] A = new double[50];
    public double[] B = new double[20];

    public Arreglos() {
    }
    /**
     * Lleno aleatoriamente el arreglo A
     */
    public void llenarArregloA(){
        for (int i = 0; i < 50; i++) {
            this.A[i] = Math.random()*(90);
            System.out.print(this.A[i] + " | "); 
        }
        System.out.println("");
    }
    /**
     * Ordeno de mayor a menor A
     * 
     */
    public void arregloA(){
        Arrays.sort(A);
    }
    /**
     * Se copian los primeros 10 numeros en el arreglo B
     * Se llenan los espacios restantes con 0.5
     */
    public void arregloB(){
        for (int i = 0; i < 50; i++) {
            System.out.print(A[i] +" | ");
            this.B = Arrays.copyOfRange(A,0, 20);
                
        }
//        System.out.println("");
//        System.out.print("Arreglo B");
//        System.out.println("");
//        for (int j = 0; j < 20; j++) {
//            System.out.print(B[j] + " | ");
//        }
        System.out.println("");
        System.out.print("Arreglo B completo");
        System.out.println("");
        for (int i = 10; i < 20; i++) {
            this.B[i] = 0.5;
        }
            
        for (int i = 0; i < 20; i++) {
                System.out.print(B[i] + " | ");
        }
        System.out.println("");
    }
}
