/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Dni;
import Entidad.ManosPersona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class ServPersona {
     private Scanner leer;
    private ArrayList<ManosPersona> Lista;
    private Dni dni = new Dni();

    public ServPersona() {
        this.leer = new Scanner(System.in);
        this.Lista = new ArrayList();
        
    }
    
    public void crearPersona(){
        do{
            ManosPersona pers = new ManosPersona();
            System.out.println("Ingrese el nombre de la persona");
            pers.setNombre(leer.next());
            System.out.println("Ingrese el apellido");
            pers.setApellido(leer.next());
            Dni d = new Dni(); 
            System.out.println("Ingrese la serie del documento");
            this.dni.setSerie(leer.next());
            System.out.println("Ingrese el numero de dni");
            this.dni.setNumero(leer.nextInt());
            Lista.add(pers);
            
            System.out.println("Desea cargar otra persona?");
            String resp = leer.next();
            if(resp.equalsIgnoreCase("no")){
                break;
            }
            
           
        }while(true);
    }
    
    public void mostrarPersona(){
        for (ManosPersona m : Lista) {
            System.out.println(m);
            
        }
    }
    
    
}
