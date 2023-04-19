/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;


import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonaServ;
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
      PersonaServ ps1 = new PersonaServ("Portero", 2004, 00, "Rolando", "Rivas", 10, "Soltero");  
      PersonaServ ps2 = new PersonaServ("Biblioteca", 2012, 10, "Soledad", "Rivarola", 20, "Casada");  
      PersonaServ ps3 = new PersonaServ("Portero", 2004, 00, "Luis", "Cito", 30, "Soltero");  
      lista.add(ps1);lista.add(ps2);lista.add(ps3);
      Profesor p1 = new Profesor("Biologia", 2001, 12, "Julio", "Coria", 100, "Casado");
      Profesor p2 = new Profesor("Matematicas", 2002, 13, "Carlos", "Silva", 200, "Soltero");
      Profesor p3 = new Profesor("Arte", 2001, 14, "Roverto", "Lujan", 300, "Casado");
      lista.add(p1);lista.add(p2);lista.add(p3);
      Estudiante e1 = new Estudiante("4b", "Romina", "Diaz", 1, "Soltera");
      Estudiante e2 = new Estudiante("5c", "Pedro", "Juarez", 2, "Soltero");
      Estudiante e3 = new Estudiante("6a", "Romina", "Ascurra", 3, "Soltera");
      lista.add(e1);lista.add(e2);lista.add(e3);
    }    
    public void matricularEstudiante(){
        Estudiante e = new Estudiante();
        System.out.print("Curso: ");
        e.setCurso(leer.next());
        System.out.print("Nombre: ");
        e.setNombrePersona(leer.next());
        System.out.print("Apellido: ");
        e.setApellidoPersona(leer.next());
        System.out.print("DNI: ");
        e.setDni(leer.nextLong());
        System.out.print("Estado civil: ");
        e.setEstadoCivil(leer.next());
        lista.add(e);
        
    }
    public void mostrarLista(){
        for (Persona persona : lista) {
            System.out.println(persona);
            
        }
    }
                              
    public void cambioEstadoCivil(){
        System.out.println("Ingrese el dni de la persona que quiera modificar el estado civil: ");
        long dni = leer.nextLong();
        Persona p = this.buscarPersona(dni);
        if(p==null){
            System.out.println("La persona no existe");
        return;
        }
        System.out.println("Ingrese el nuevo estado civil");
            p.setEstadoCivil(leer.next());
    }
    
    public void cambioDespacho(){
        
        System.out.println("Ingrese el dni del personal de servicio que quiera reasignar despacho: ");
        long resp = leer.nextLong();
        Persona p = this.buscarPersona(resp);
        if(p==null){
            System.out.println("La persona no existe");
            return;
        }
        if(p instanceof PersonaServ){
            System.out.println("Ingrese el nuevo despacho que quiera reasignarle: ");
            int despacho = leer.nextInt();
            //((PersonaServ)p).setNumeDespacho(despacho);
            PersonaServ ps = (PersonaServ) p;    //otra forma
            ps.setNumeDespacho(despacho);        //
        }else{
            System.out.println("La persona que usted a seleccionado no pertenece a personal de servicio...");
    }
            
        
    }
    
    private Persona buscarPersona(long dni){
        for (Persona buscar : lista) {
            if(buscar.getDni()==dni){
                return buscar;
            }
            
        }
        return null;
    }
    public void cambioDepartamentoProfesor(){
        
        System.out.println("Ingrese el dni del profesor que quiera reasignar departamento: ");
        long resp = leer.nextLong();
        Persona p = this.buscarPersona(resp);
        if(p==null){
            System.out.println("La persona no existe");
            return;
        }
        if(p instanceof Profesor){
            System.out.println("Ingrese el nuevo despacho que quiera reasignarle: ");
            String departamento = leer.next();
            Profesor pro = (Profesor) p;    
            pro.setDepartamento(departamento);        
        }else{
            System.out.println("La persona que usted a seleccionado no es profesor...");
    }
    
        
    }
    public void trasladoDeSeccion(){
        
        System.out.println("Ingrese el dni del empleADO que quiera cambiarde seccion: ");
        long resp = leer.nextLong();
        Persona p = this.buscarPersona(resp);
        if(p==null){
            System.out.println("La persona no existe");
            return;
        }
        if(p instanceof PersonaServ){
            System.out.println("Ingrese la nueva secion que quiera reasignarle: ");
            String seccion = leer.next();
            PersonaServ ps = (PersonaServ) p;
            ps.setSeccion(seccion);
        }else{
            System.out.println("La persona que usted a seleccionado no pertenece a personal de servicio...");
    }
        
        
    }

   public void menu(){
       System.out.println("--------------Elija una opcion--------------");
       System.out.println("1 - Mostrar lista de Personas de la Facultad");
       System.out.println("2 - Modificar estado civil");
       System.out.println("3 - Reasiganr despacho a empleado");
       System.out.println("4 - Matriculacion de nuevo estudiante");
       System.out.println("5 - Cambio de departamento de profesor");
       System.out.println("6 - Reasignacion de seccion de personal de servicio");
       System.out.println("7 - Salir");
       System.out.println("---------------------------------------------");
       int op = leer.nextInt();
       
       switch(op){
           case 1:
               this.mostrarLista();
               menu();
               break;
           case 2:
               this.cambioEstadoCivil();
               menu();
               break;
           case 3:
               this.cambioDespacho();
               menu();
               break;
           case 4:
               this.matricularEstudiante();
               menu();
               break;
           case 5:
               this.cambioDepartamentoProfesor();
               menu();
               break;
           case 6:
               this.trasladoDeSeccion();
               menu();
               break;
           case 7:
               System.out.println("Hasta la proxima");
               break;
           default:
               System.out.println("Ingrese una opcion valida");
               menu();
               break;
       }
   }
   
}
    
    
    

