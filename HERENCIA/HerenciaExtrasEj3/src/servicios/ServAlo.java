/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Utilidades.Comparadores;
import entidades.Alojamiento;
import entidades.ExtraHoteleros;
import entidades.Hotel;
import entidades.hijos.Camping;
import entidades.hijos.Hotel4;
import entidades.hijos.Hotel5;
import entidades.hijos.Residencia;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;



/**
 *
 * @author Carlitos
 */
public class ServAlo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alojamiento>lista = new ArrayList();
    Hotel4 h4;
    Hotel5 h5;

    public ServAlo() {
    Hotel4 h4 = new Hotel4("A", "Comadreja", 30, 60, 80, 4, "Sierras", "Hormaeche 255", "Villa Dolores", "Rodrigo Panta");
    h4.precioFinal();
    lista.add(h4);
    Hotel4 h41 = new Hotel4("B", "La Mama", 20, 50, 70, 5, "Lobo", "San Luis 285", "Villa Dolores", "Cristian Panta");
    h41.precioFinal();
    lista.add(h41);
    Hotel4 h42 = new Hotel4("A", "Otto", 70, 90, 100, 8, "Sierras Blancas", "Hormaeche 500", "Villa Dolores", "Ezequile Pantaleo");
    h42.precioFinal();
    lista.add(h42);
    Hotel5 h5 = new Hotel5(8, 5, 7, "A", "Vaca Loca", 90, 140, 380, 5, "La Tela", "Ramon Nueva 86", "Villa Dolores", "Lorenzo Omirez");
    h5.precioFinal();
    lista.add(h5);
    Hotel5 h51 = new Hotel5(3, 5, 5, "B", "Mana", 60, 120, 360, 6, "La Isla", "RamonJ Carcano 256", "Villa Dolores", "Atilio Ramirez");
    h51.precioFinal();
    lista.add(h51);
    Camping c = new Camping(50, 5, true, "no", 2000, "La aguadita", "Calle s/n","Salsipuedes", "Carlos Bringas");
    c.precioFinal();
    lista.add(c);
    Residencia r = new Residencia(30, true, true, "si", 800, "Mis Sierras", "Patagones 258", "Villa Nono", "Ignacio Copani");
    r.precioFinal();
    lista.add(r);
    }
    
    public void mostrarTodos(){
        for (Alojamiento all : lista) {
            System.out.println(all);
            
        }
    }
    
    public void ordenarHoteles(){
        ArrayList<Hotel>hoteles = new ArrayList();
        for (Alojamiento alojamiento : lista) {
            if(alojamiento instanceof Hotel)
                hoteles.add((Hotel)alojamiento);
            
        }
               
        Collections.sort(hoteles);
        for (Hotel h : hoteles) {
            System.out.println(h);
            
        }
    }
    //sin implement en hotel
//    public void pruebaorden(){
//        ArrayList<Hotel>hoteles = new ArrayList();
//        for (Alojamiento alojamiento : lista) {
//            if(alojamiento instanceof Hotel)
//                hoteles.add((Hotel)alojamiento);
//            
//        }
//        Collections.sort(hoteles, Comparadores.compararPreciosHoteles);
//        for (Hotel hh : hoteles) {
//            System.out.println(hh);
//            
//        }
//    }
    
public void ordenarExtraHoteleros(){
    ArrayList<ExtraHoteleros>extHot = new ArrayList();
    for (Alojamiento alojamiento1 : lista) {
        if(alojamiento1 instanceof ExtraHoteleros)
            extHot.add((ExtraHoteleros)alojamiento1);
            
        
    }
    Collections.sort(extHot);
    for (ExtraHoteleros extra : extHot) {
        System.out.println(extra);
        
    }
}
public void campigConRest(){
    for (Alojamiento alojamiento : lista) {
        if (alojamiento instanceof Camping){
            Camping camping = (Camping) alojamiento;
            if(camping.getRestaurante()){
                System.out.println(camping);
                
            }
        }
        
    }
}
public void ResidenciasConDescuento(){
    for (Alojamiento alojamiento : lista) {
        if(alojamiento instanceof Residencia){
            Residencia res = (Residencia) alojamiento;
            if(res.getDescuentoGremio()){
                System.out.println(res);
            }
        }
        
    }
    
}

public void menu(){
    System.out.println("------------Elija un opcion----------");
    System.out.println("");
    System.out.println("1 - Mostrar todos los alojamientos");
    System.out.println("2 - Mostrar los Hoteles del mas barato al mas caro ");
    System.out.println("3 - Mostrar los ExtraHoteleros del mas barato al mas caro ");
    System.out.println("4 - Mostrar los camping con restaurante ");
    System.out.println("5 - Mostrar las residencias con descuento por gremio ");
    System.out.println("6 - salir");
    
    int op = leer.nextInt();
    
    switch(op){
        case 1:
            this.mostrarTodos();
            this.menu();
            break;
        case 2: 
            this.ordenarHoteles();
            this.menu();
            break;
        case 3:
            this.ordenarExtraHoteleros();
            this.menu();
            break;
        case 4:
            this.campigConRest();
            this.menu();
            break;
        case 5:
            this.ResidenciasConDescuento();
            this.menu();
            break;
        case 6:
            System.out.println("Hasta luego...");
            break;
        default:
            System.out.println("Ingrese una opcion valida");
            this.menu();
            break;
    }
}
     //MOSTRAR CAMPING CON RESTAURANT
    public void mostrarRestaurant() {
        System.out.println("\nLos campings con restaurant son:");
        for (Alojamiento aux : lista) {
            if (aux instanceof Camping) {
                if (((Camping) aux).getRestaurante()) {
                    System.out.println(((Camping) aux).getNombre());
                }
            }
        }
    }

    //MOSTRAR RESIDENCIAS CON DESCUENTO
    public void mostrarDescuento() {
        System.out.println("\nLas Residencias con descuento son:");
        for (Alojamiento aux : lista) {
            if (aux instanceof Residencia) {
                if (((Residencia) aux).getDescuentoGremio()) {
                    System.out.println(((Residencia) aux).getNombre());
                }
            }
        }
    }
}
