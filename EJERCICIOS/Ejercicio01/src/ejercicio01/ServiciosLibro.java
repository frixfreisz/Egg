
package ejercicio01;

import ejercicio01.Libro.Libro;
import java.util.Scanner;

public class ServiciosLibro{
    
    public Libro cargarLibro(Scanner leer){
        System.out.println("Ingrese codigo ISBN");
        String isbn = leer.nextLine();
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el nombre del autor");
        String autor = leer.nextLine();
        System.out.println("Ingrese la cantidad de paginas");
        int cantidadPaginas = leer.nextInt(); 
        
        return new Libro(isbn,titulo,autor,cantidadPaginas);
    }    
    
    public void mostrarLibro(Libro mostrar){
        System.out.println("ISBN: " + mostrar.getIsbn());
        System.out.println("Titulo: " + mostrar.getTitulo());
        System.out.println("Autor: " + mostrar.getAutor());
        System.out.println("Cantidad de paginas: " + mostrar.getNumeroPaginas());
        
        
    }

  
    
    
}
