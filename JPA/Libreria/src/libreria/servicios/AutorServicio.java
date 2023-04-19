/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.DAO;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author Carlitox
 */
public class AutorServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DAO dao = new DAO();
    AutorDAO adao = new AutorDAO();
    LibroDAO ldao = new LibroDAO();
    

    public Autor buscarAutorNombre(String nombre) {
        List<Autor> autores = adao.buscarAutorNombre(nombre);

        return autores.size() == 0 ? null : autores.get(0);
        
    }
    public Autor buscarAutorPorID(Integer id) {
        Autor autores = adao.buscarAutorId(id);

        return autores;

    }

    public Autor crearAutor() {
        System.out.println("Ingrese el nombre del Autor");
        String nombre = leer.next();

        Autor a = this.buscarAutorNombre(nombre);
        if (a == null) {
            a = new Autor();
            a.setNombre(nombre);

            dao.insertarAutor(a);
            
        } else {
            System.out.println("El autor ya existe en la base de datos");
        }
        return a;
    }
    
    public void editarAutor() {
        System.out.println("Ingrese el nombre del Autor");
        String nombre = leer.next();
                
        Autor a = this.buscarAutorNombre(nombre);
        if(a == null){
            System.out.println("El autor no existe en la base de datos");
            return;
        
        }
        System.out.println("Desea modificar el Autor: " + a.getNombre() + "? S/N:" );
            String respAutor = leer.next();
            if(respAutor.equalsIgnoreCase("s")){
                System.out.println("Ingrese el Nombre");
                String newAutor = leer.next();
                a.setNombre(newAutor);
                dao.actualizarAutor(a);
            }
    }
    public void eliminarAutor() {
        System.out.println("Ingrese el Id del autor a eliminar");
        int id = leer.nextInt();
        
        Autor a = this.buscarAutorPorID(id);
        if(a==null){
            System.out.println("El autor no existe en la base de datos");
            return;
        }
        dao.eliminarAutor(a);

       
    }
    
        public void DarDeBajaAutor() {
        System.out.println("Ingrese el nombre del Autor");
        String nombre = leer.next();
                
        Autor a = this.buscarAutorNombre(nombre);
        if(a == null){
            System.out.println("El autor no existe en la base de datos");
            return;
        
        }
        System.out.println("Ingrese la palabra 'false' para dar de baja");
        Boolean baja = leer.nextBoolean();

            a.setAlta(baja);
            dao.actualizarAutor(a);

    }
        public void buscarAutorNombre() {
            System.out.println("Ingrese el nombre del autor");
            String nombre = leer.next();
        List<Autor> autores = adao.buscarAutorNombre(nombre);
        if(autores.size()==0){
            System.out.println("El autor no existe en la base de datos");
            return;
        }else{
        
            for (Autor autore : autores) {
                System.out.println("ID - " + autore.getId() + "\tAutor: " + autore.getNombre());
                
            }  
        }
    }


}






