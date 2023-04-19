/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesej3;

import entidad.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class ExcepcionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try{
            String n1 = "90";
            String n2 = "5";
            DivisionNumero div = new DivisionNumero();
            div.setNum1(Integer.parseInt(n1));
            div.setNum2(Integer.parseInt(n2));
            System.out.println("Division: " +(div.getNum1()/div.getNum2()));
            
        }catch(Exception e){
            System.out.println(e);}
        
    }
    
}
