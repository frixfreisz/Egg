/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Carlitos
 */
public class ServPais {
    private Scanner leer;
    private Set<Pais>Lista;

    public ServPais() {
        this.leer = new Scanner(System.in);
        this.Lista = new TreeSet();
    }
    
    public void cargarPaises(){
        do{
            Pais pais = new Pais();
            System.out.println("Ingrese el nombre del Pais");
            pais.setNombre(leer.next());
            Lista.add(pais);
            System.out.println("Desea cargar otro Pais?");
            String resp = leer.next().toLowerCase();
            if(resp.equals("no")){
                break;
            }
            
        }while(true);
    }
    
    public void mostrarPais(){
        for (Pais pais : Lista) {
            System.out.println(pais);
            
        }
            
        
    }
    
//    public void buscarPais(){
//        Iterator<Pais> it = Lista.iterator();
//        System.out.println("Que pais quieres encotrar en la Lista?");
//        String buscar = leer.next().toLowerCase();
//        if(Lista.contains(buscar)){
//            System.out.println("El pais " + buscar + " fue removido de la Lista");
//        }else{
//            System.out.println("El pais " +  buscar + " NO se encuentra en la Lista");
//        }
//        while(it.hasNext()){
//            if(it.next().equals(buscar)){
//                it.remove();
//            }
//        }
//        
//    }
    
     public void buscarPais() {
        System.out.println("Ingrese el nombre de un pais a buscar ");
        String pais = leer.next();
        Iterator<Pais> it = Lista.iterator();
        int cant = Lista.size();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(pais)) {
                it.remove();
            }
        }
        if (cant != Lista.size()) {
            mostrarPais();
        } else {
            System.out.println("El pais ingresado no está en el conjunto");
        }
    }
    
}
