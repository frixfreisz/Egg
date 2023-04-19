/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesej2;

import entidad.Arreglo;

/**
 *
 * @author Carlitos
 */
public class ExcepcionesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Arreglo a = new Arreglo();
        int n = a.getArreglo()[6];
            System.out.println(a.toString());

        
      }
      catch(Exception e){
          System.out.println(e);
      }

    }
    
}
