/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.DAO;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author Carlitox
 */
public class LibroServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AutorServicio as = new AutorServicio();
    EditorialServicio es = new EditorialServicio();
    
    LibroDAO ldao = new LibroDAO();
    DAO dao = new DAO();
    
    public Libro buscarLibroNombre(String nombre) {
        List<Libro> libros = ldao.buscarLibroNombre(nombre);

        return libros.size() == 0 ? null : libros.get(0);

    }
    
    public Libro buscarLibroPorID(Integer id) {
        Libro libros = ldao.buscarLibroId(id);

        return libros;

    }

    public Libro crearLibro() {
        System.out.print("Titulo: ");
        String nombre = leer.next();

        Libro l = this.buscarLibroNombre(nombre);
        if (l == null) {
            l = new Libro();
            l.setTitulo(nombre);
            System.out.print("Año: ");
            l.setAnio(leer.nextInt());
            Autor a = as.crearAutor();
            l.setAutor(a);
            Editorial e = es.crearEditorial();
            l.setEditorial(e);

            dao.insertarLibro(l);
        } else {
            System.out.println("El libro ya existe en la base de datos");
        }
        return l;
    }
    
    public void editarLibro() {
        System.out.println("Ingrese el nombre del Libro que quiere editar");
        String nombre = leer.next();
                
        Libro l = this.buscarLibroNombre(nombre);
        if(l == null){
            System.out.println("El libro no existe en la base de datos");
            return;
        
        }
         System.out.println("Desea modificar el titulo: " + l.getTitulo() + "? S/N:" );
            String respTitulo = leer.next();
            if(respTitulo.equalsIgnoreCase("s")){
                System.out.println("Ingrese el Nombre");
                String newTitulo = leer.next();
                l.setTitulo(newTitulo);
                dao.actualizarLibro(l);
            }
            System.out.println("Desea modificar el anio: " + l.getAnio() + "? S/N:" );
            String respAnio = leer.next();
            if(respAnio.equalsIgnoreCase("s")){
                System.out.println("Ingrese el Anio");
                int newAnio = leer.nextInt();
                l.setAnio(newAnio);
                dao.actualizarLibro(l);
            }
            
                
    }
    
    public void eliminarLibro() {
        System.out.println("Ingrese el Id del libro a eliminar");
        int id = leer.nextInt();
        
        Libro a = this.buscarLibroPorID(id);
        if(a==null){
            System.out.println("El libro no existe en la base de datos");
            return;
        }
        dao.eliminarLibro(a);

       
    }
    
        public void DarDeBajaLibro() {
        System.out.println("Ingrese el nombre del Libro");
        String nombre = leer.next();
                
        Libro a = this.buscarLibroNombre(nombre);
        if(a == null){
            System.out.println("El libro no existe en la base de datos");
            return;
        
        }
        System.out.println("Ingrese la palabra 'false' para dar de baja");
        Boolean baja = leer.nextBoolean();

            a.setAlta(baja);
            dao.actualizarLibro(a);

    }
        
                
        public void buscarLibroPorISBN(){
            System.out.println("Ingresar ISBN del libro que quiere buscar");
            Long isbn = leer.nextLong();
            List<Libro> libroIsbn = ldao.buscarLibroPorIsbn(isbn); 
            if(libroIsbn.size()==0){
                System.out.println("El libro no existe");
            }else{
            for (Libro libro : libroIsbn) {
            System.out.println("ISBN: " + libro.getIsbn() + "\t Titulo: "+libro.getTitulo());
               
            }
        }
    }
        
        public void buscarLibroPorAutor(){
            System.out.println("Ingrese el nombre del autor para listar sus libros");
            String nombre = leer.next();
            List<Libro> libros = ldao.buscarLibroPorAutor(nombre);
            if(libros.size() == 0 || libros == null){
                System.out.println("No se encontraron libros de ese autor");
            }else{
                System.out.println(" ----------------Libros del autor " + nombre + "--------------------");
                for (Libro libro : libros) {
                    System.out.println("ISBN: " + libro.getIsbn() + "\t Titulo: " + libro.getTitulo() + "\tEditorial: " + libro.getEditorial().getNombre() + "\tAutor: " + libro.getAutor()+"\tAño: " + libro.getAnio());
                    
                }
            }
        }
        
        public void buscarLibroPorEditorial(){
            System.out.println("Ingrese el nombre de la editorial para listar sus libros");
            String nombre = leer.next();
            List<Libro> libros = ldao.buscarLibroPorEditorial(nombre);
            if(libros.size() == 0 || libros == null){
                System.out.println("No se encontraron libros de esa editorial");
            }else{
                System.out.println(" ----------------Libros de la editorial " + nombre + "--------------------");
                for (Libro libro : libros) {
                    System.out.println("ISBN: " + libro.getIsbn() + "\tTitulo: " + libro.getTitulo() + "\tEditorial: " + libro.getEditorial().getNombre() + "\tAutor: " + libro.getAutor()+ "\tAño: " + libro.getAnio());
                    
                }
            }
        }
        
        public void imprimirLibroPorNombre(){
            System.out.println("Ingrese el nombre del libro");
            String nombre = leer.next();
            List<Libro> libros = ldao.buscarLibroNombre(nombre);
            if(libros.size() == 0 || libros == null){
                System.out.println("No se encontro libro con ese nombre");
            }else{
                System.out.println(" ----------------Libros con nombre: " + nombre + "--------------------");
                for (Libro libro : libros) {
                    System.out.println("ISBN: " + libro.getIsbn() + "\t Titulo: " + libro.getTitulo() + "\tEditorial: " + libro.getEditorial().getNombre() + "\tAño: " + libro.getAnio());
                    
                }
            }
        }
        public Libro buscarLibroPorTitulo(){
            System.out.println("Ingrese el nombre del libro");
            String nombre = leer.next();
            Libro libros = this.buscarLibroNombre(nombre);
            return libros;
        }
        
        public boolean hayStock(Libro libro){
            return libro.getEjemplaresRestantes()>0;
            
        }
        
        public void confirmarPrestamo(Libro libro){
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()-1);
            ldao.modificarEjemplares(libro);
        }
        
        public void confirmarDevolucion(Libro libro){
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()-1);
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()+1);
            ldao.modificarEjemplares(libro);
        }
        
        public void agregarStock(){
            System.out.println("Ingrese el nombre del libro a que quiera sumar stock");
            String nombre = leer.next();
                    Libro l = this.buscarLibroNombre(nombre);
        if(l == null){
            System.out.println("El libro no existe en la base de datos");
            return;
        }
         System.out.println("Desea ingresar stock del libro: " + l.getTitulo() + "? S/N:" );
            String respTitulo = leer.next();
            if(respTitulo.equalsIgnoreCase("s")){
                System.out.println("Ingrese la cantidad de ejemplares");
                int newStock = leer.nextInt();
                l.setEjemplares(newStock);
                
                dao.actualizarLibro(l);
            }
        }
        
        
}



