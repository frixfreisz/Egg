
package Servicio;

import Entidad.Mascota;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {
    
    private Scanner leer;
    private ArrayList<String>Mascota;
    private Mascota m;

    public Servicio() {
        this.leer = new Scanner(System.in);
        this.Mascota = new ArrayList();
        this.m = new Mascota();
    }
    
    public void crearRaza(){
        do{
            System.out.println("Ingrese la raza de la mascota");
            m.setRaza(leer.next());
            Mascota.add(m.getRaza());
            System.out.println("Desea agregar otra mascota?");
            String resp = leer.next().toLowerCase();
            if(resp.equals("no")){
                
                this.mostrarRaza();
                
                break;
            }
        }while(true);
    }
    
    public void mostrarRaza(){
        System.out.println("----------Lista Actual--------");
        for (String raza : Mascota) {
            System.out.println(raza);
        }
        System.out.println("------------------------------");
    }
    public void eliminarRaza() {
        Iterator it = Mascota.iterator();
        System.out.println("Ingrese la mascota que desea eliminar");
        String borrar = leer.next();
        if(Mascota.contains(borrar)){
            System.out.println("La mascota ha sido eliminada con exito");
        }else{
            System.out.println("La mascota no se encuentra en la lista");
        }
        while(it.hasNext()){
            if(it.next().equals(borrar)){
                it.remove();
            }
        }
    }
    
    public void eliminarPorRazaConFor(){
        System.out.println("Que raza desea eliminar con metodo for");
        String remover = leer.next();
        for (int i = 0; i < Mascota.size(); i++) {
            String eliminar = Mascota.get(i);
            if(eliminar.equals(remover)){
                System.out.println("La mascota ha sido eliminada");
                System.out.println("");
                Mascota.remove(eliminar);
                this.mostrarRaza();
                 break;
            }else{
                System.out.println("La mascota no se encuentra en la Lista");
                break;
            }
            
        }
    }
    
  public void ordenarRaza(){
    
    Collections.sort(Mascota);
    }
}
