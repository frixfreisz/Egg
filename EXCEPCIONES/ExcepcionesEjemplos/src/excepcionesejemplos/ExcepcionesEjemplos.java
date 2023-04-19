/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesejemplos;

import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class ExcepcionesEjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero:");
        try{
        int num = leer.nextInt();
        
        System.out.println(num);
    }catch(Exception e){
            System.out.println("Error " + e);    
           
    }catch(ExceptionInInitializerError e1){
        int num = leer.nextInt();
    }
    }
    
}
