package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej19 {

    public static void main(String[] args) {
       
        int[] vec1 = {1,2,3,4};
        int[] vec2 = {1,2,9,4};
        
        boolean iguales = true;
        
        for (int i = 0; i < vec1.length && iguales; i++) {
            if(vec1[i] != vec2[i]){

            iguales = false;
            }
        }

        if (iguales) {
            System.out.println("Los vectores iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }

    }

}
