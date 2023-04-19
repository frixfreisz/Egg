
package actividades.Ejercicios.Extras;

public class Ej02 {

    public static void main(String[] args) {
       
       int a = 1;
       int b = 2;
       int c = 3;
       int d = 4;
       int aux = 0;
       
       aux = b;
       b = c;
       c = a;
       a = d;
       d = aux;
       
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("d = " + d);
    }
    
}
