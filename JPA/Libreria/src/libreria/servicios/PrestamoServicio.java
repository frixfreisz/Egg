/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.DAO;
import libreria.persistencia.LibroDAO;
import libreria.persistencia.PrestamoDAO;

/**
 *
 * @author Carlitox
 */
public class PrestamoServicio {
Scanner leer = new Scanner(System.in);

PrestamoDAO pdao = new PrestamoDAO();
LibroDAO ldao = new LibroDAO();
LibroServicio ls = new LibroServicio();
ClienteServicio cs = new ClienteServicio();
   
public void prestamo() {
        Libro libro = ls.buscarLibroPorTitulo();
        if(libro == null){
            System.out.println("No exite el libro en la base de datos");
            return;
        }
        if(!ls.hayStock(libro)){
            System.out.println("En este momento no disponemos de stock para este libro");
            return;
        }
        System.out.println("Quiere realizar un prestamo del libro " + libro.getTitulo() + "? - S/N");
        String resp = leer.next();
        if(resp.equalsIgnoreCase("n")){
            return;
        }
        Cliente c = cs.buscarOCrearCliente();
        if(c == null){
            System.out.println("Error, no pudo relizarse la operacion. Intente nuevamente mas tarde");
            return;
        }
        LocalDate hoy = LocalDate.now();
        LocalDate fin = hoy.plusDays(7);
        
        System.out.println("El prestamo del libro " + libro.getTitulo() + " al cliente " + c.getNombre() + " " + c.getApellido() + " es hasta el dia " + fin);
        System.out.println("Desea continuar: S/N");
        String resp3 = leer.next();
        if(resp3.equalsIgnoreCase("N")){
            System.out.println("El prestamo ha sido cancelado");
            return;
        }
        Prestamo prestamo = new Prestamo();
        prestamo.setLibro(libro);
        prestamo.setCliente(c);
        prestamo.setFechaPrestamo(hoy);
        prestamo.setFechaDevolucion(fin);
        
        pdao.insertarPrestamo(prestamo);
        ls.confirmarPrestamo(libro);

    }

    public void devolucion() {
        
        System.out.println("Ingrese el dni del cliente");
        long dni = leer.nextLong();
        Cliente c = cs.buscarClientePorDNI(dni);
        if(c == null){
            System.out.println("El cliente no existe");
            return;
        }
        List<Prestamo> prestamos = pdao.buscarPrestamoPorCliente(c);
        System.out.println("Estos son todos los prestamos actuales del cliente "+ c.getNombre() + " " + c.getApellido());
        for (Prestamo prestamo : prestamos) {
            System.out.println("Id:" + prestamo.getId() + "-" + prestamo.getLibro().getTitulo());
            
        }
        System.out.println("Ingrese el id");
        int id = leer.nextInt();
        Prestamo pseleccionado = null;
        for (Prestamo prestamo : prestamos) {
            if(prestamo.getId() == id){
                pseleccionado = prestamo;
                break;
            }
            
        }
        if(pseleccionado == null){
            System.out.println("El id no existe");
            return;
        }
        pseleccionado.setFechaDevolucion(LocalDate.now());
        
        pdao.actualizarPrestamo(pseleccionado);
        ls.confirmarDevolucion(pseleccionado.getLibro());
        System.out.println("La devolucion se realizo con exito");
        
    }

    
}
