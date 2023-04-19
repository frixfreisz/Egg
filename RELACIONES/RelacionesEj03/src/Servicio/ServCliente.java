/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class ServCliente {
    private Scanner leer;
    
    private ArrayList<Cliente>lista;

    public ServCliente() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        
        this.lista = new ArrayList();
    }
    
    public Cliente crearCliente(){
        System.out.println("----------CARGA DE CLIENTES----------");
        System.out.println("");
        
            Cliente clientes = new Cliente();
            System.out.print("Nombre del cliente: ");
            clientes.setNombre(leer.next());
            System.out.print("Apellido: ");
            clientes.setApellido(leer.next());
            System.out.print("DNI: ");
            clientes.setDni(leer.nextLong());
            System.out.print("Correo Electronico: ");
            clientes.setEmail(leer.next());
            System.out.print("Domicilio: ");
            clientes.setDomicilio(leer.next());
            System.out.print("Telefono: ");
            clientes.setTelefono(leer.nextLong());
            
            lista.add(clientes);
            System.out.println("Cliente cargado con exito!");
           
     return clientes;           
    }
    
    public void modificarCliente(){
        Cliente cliente = buscarCliente();
        if(cliente == null){
            System.out.println("El cliente no se encuentra en la lista");
            return;
            
        }
        int op = 0;
        
            System.out.println("Que dato desea modificar");
            System.out.println("");
            System.out.println("1 - NOMBRE");
            System.out.println("2 - APELLIDO");
            System.out.println("3 - DNI");
            System.out.println("4 - EMAIL");
            System.out.println("5 - DOMICILIO");
            System.out.println("6 - TELEFONO");
            System.out.println("7 - SALIR");
            
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Ingrese nuevamente el nombre: ");
                   cliente.setNombre(leer.next());
                   break;
                case 2:
                    System.out.println("Ingrese nuevamente el apellido: ");
                    cliente.setApellido(leer.next());
                   break;
                case 3:
                    System.out.println("Ingrese nuevamente el DNI: ");
                    cliente.setDni(leer.nextLong());
                   break;
                case 4:
                    System.out.println("Ingrese nuevamente el Email: ");
                    cliente.setEmail(leer.next());
                   break;
                case 5:
                    System.out.println("Ingrese nuevamente el domicilio: ");
                    cliente.setDomicilio(leer.next());
                   break;
                case 6:
                    System.out.println("Ingrese nuevamente el numero de telefono: ");
                    cliente.setTelefono(leer.nextInt());
                   break;
                case 7:
                    
                    break;
                    
                   
            }
                    
        System.out.println(cliente.toString());
        
        
            
    }
    
    public void eliminarCliente(){
      Cliente cliente = buscarCliente();
      if(cliente!=null){
          lista.remove(cliente);
          System.out.println("El cliete ha sido borrado de la lista con exito!");
      }else{
          System.out.println("El cliente no se encuentra en la lista");
      }
      
      mostrarClientes();
    }
    
    public Cliente buscarCliente(){
        System.out.print("Ingrese el DNI del cliente que quiere buscar: ");
        Long resp = leer.nextLong();
        for (Cliente buscar : lista) {
            if(resp.equals(buscar.getDni()));
                return buscar;
        }
        return null;
    }
    
    public void menuCliente(){
        System.out.println("----------GESTION INTEGRAL DE CLIENTES-----------");
    int op = 0;
        do{
            System.out.println("Que desea hacer?");
            System.out.println("");
            System.out.println("1 - CREAR CLIENTE");
            System.out.println("2 - MODIFICAR DATOS");
            System.out.println("3 - ELIMINAR CLIENTE");
            System.out.println("4 - MOSTRAR LISTA");
            System.out.println("5 - BUSCAR CLIENTE");
            System.out.println("6 - SALIR");
            
            
            op = leer.nextInt();
            
            switch(op){
                case 1:
                   crearCliente();
                   break;
                case 2:
                    modificarCliente();
                   break;
                case 3:
                    eliminarCliente();
                   break;
                case 4:
                    mostrarClientes();
                   break;
                case 5:
                    buscarCliente();
                    break;
                case 6:
                   break;
                    
                   
            }
                    
        }while(op != 6);
    
        
        
    }
    
    public void mostrarClientes(){
        System.out.println("----------Listado de Clientes----------");
        for (Cliente cliente1 : lista) {
            System.out.println(cliente1);
            
        }
    }
    
  
    
}
