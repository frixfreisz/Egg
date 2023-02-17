/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej2y3;


import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Servicio.ServElec;
import java.util.ArrayList;


/**
 *
 * @author Carlitos
 */
public class HerenciaEj2y3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServElec serv = new ServElec();
        Lavadora lav = serv.crearLavadora();
        Televisor tv = serv.crearTelevisor();
        ArrayList<Electrodomestico>listaElec = new ArrayList();
        listaElec.add(lav);
        listaElec.add(tv);
        System.out.println(lav);
        System.out.println(tv);
        float precioTotal = 0;
            System.out.println("-------------------------------------------------");
        for (Electrodomestico electro : listaElec) {
            System.out.println("");
           // System.out.println("El precio es: " + electro.getPrecio());
            precioTotal += electro.getPrecio();
        }
        System.out.println("El precio total de la compra es: " + precioTotal);
        
                
    }
    
}
