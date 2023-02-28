/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Empleados;
import entidades.Estudiante;
import entidades.Persona;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class ServFacu {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Persona>lista;
    
    
    public ServFacu(){
        this.lista = new ArrayList();
        
     }
    
    public void datosPersona(){
        
        Empleados e1 = new Empleados(2003, "Portero", 00, "Rolando", "Rivas", 12556522, "Casado");
        Empleados e2 = new Empleados(2010, "Limpieza", 01, "Juan", "Diaz", 8545215, "Casado");
        Empleados e3 = new Empleados(2005, "Bibliotecario", 02, "Susana", "Horia", 29865541, "Soltera");
        Empleados e4 = new Empleados(2002, "Bibliotecario", 03, "Esteban", "Quito", 29861252, "Soltero");
        
        Profesor p1 = new Profesor("Arte", "Juan", "Baglietto", 15285456, "Casado");
        Profesor p2 = new Profesor("Arquitectura", "Carlos", "Bolonqui", 25854585, "Casado");
        Profesor p3 = new Profesor("Sicologia", "Luciano", "Estocolmo", 25625478, "Soltero");
        Profesor p4 = new Profesor("Lengua", "Ruperta", "Coniglio", 45214785, "Casado");
        
        Estudiante es1 = new Estudiante("4B", "Victoria", "Bartolomei", 46854512, "Soltera");
        Estudiante es2 = new Estudiante("2B", "Rene", "Custarov", 58547452, "Soltera");
        Estudiante es3 = new Estudiante("1a", "Sara", "Oconor", 548454842, "Soltera");
        Estudiante es4 = new Estudiante("5B", "Luis", "Cito", 45474552, "Casado");
        lista.add(e1); lista.add(e2); lista.add(e3); lista.add(e4);
        lista.add(p1); lista.add(p2); lista.add(p3); lista.add(p4);
        lista.add(es1); lista.add(es2); lista.add(es3); lista.add(es4);
    }
    
    public void mostrarLista(){
        for (Persona persona : lista) {
            System.out.println(persona);
            
        }
    }
    
}
