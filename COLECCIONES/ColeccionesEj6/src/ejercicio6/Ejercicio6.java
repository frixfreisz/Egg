/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import Servicios.ServicioTienda;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioTienda st = new ServicioTienda();
          String r;
          do {
            System.out.println("Menu");
              System.out.println("1.Agregar productos");
              System.out.println("2.Mostrar productos");
              System.out.println("3.Modificar precio");
              System.out.println("4.Eliminar producto");
              System.out.println("5.Salir");
              r=leer.next();
            switch(r){
                case "1":
                    st.crearProducto();
                break;
                case "2":
                    st.mostrar();
                break;
                case "3": 
                    st.reemplazo();
                break;
                case "4":
                    st.eliminar();
                break;
                case "5":
                    
                break;
            }
        } while (!"5".equals(r));
    }
    
}
