/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextrasej02;

import entidad.EdOficinas;
import entidad.Edificio;
import entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Carlitos
 */
public class HerenciaExtrasEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio>listado = new ArrayList();
        Polideportivo p1 = new Polideportivo("La Liga", true, 50,15, 100);
        
        listado.add(p1);
        Polideportivo p2 = new Polideportivo("Municipal", false, 100, 15, 100);
        
        listado.add(p2);
        EdOficinas eo1 = new EdOficinas(15, 20, 15, 40, 60, 45);
        eo1.totalPersonasMaxima();
        
        listado.add(eo1);
        EdOficinas eo2 = new EdOficinas(20, 40, 50, 60, 80, 40);
        eo1.totalPersonasMaxima();
        
        listado.add(eo2);
        System.out.println("");
       
 {
     System.out.println("Listado de Edificios");
     for (Edificio edificio : listado) {
         System.out.println(edificio);
         
     }
     System.out.println("-------------------------------------------------");
            
        }
        System.out.println("");
        System.out.println("Polideportivos techados");
 int cont = 0;
        for (Edificio ed : listado) {
            if(ed instanceof Polideportivo){
                Polideportivo poli = (Polideportivo) ed;
                if(poli.isTechado()){
                    cont++;
                    System.out.println(poli); 
                }
            }
            
        }
        System.out.println("Cantidad: " + cont);
        System.out.println("--------------------------------------------");
System.out.println("");
        System.out.println("Polideportivos sin techo");
 int cont2 = 0;
        for (Edificio ed : listado) {
            if(ed instanceof Polideportivo){
                Polideportivo poli = (Polideportivo) ed;
                if(!poli.isTechado()){
                    cont2++;
                    System.out.println(poli); 
                }
            }
            
        }
        System.out.println("Cantidad: " + cont);
        System.out.println("--------------------------------------------");
    }

}
    
    
    

