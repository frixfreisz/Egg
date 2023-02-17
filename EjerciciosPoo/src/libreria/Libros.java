
package libreria;

import java.util.Scanner;

public class Libros {

private long isbn;
private String titulo;
private String autor;
private int  numeroPaginas;

public Libros(){
    
}

    public Libros(long isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    public void imprimirLibro(){
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Tituli del libro : " + this.titulo);
        System.out.println("Autor : " + this.autor);
        System.out.println("ISBN: " + this.numeroPaginas);
        
    }
    public void  cargarLibro(Scanner leer){
        System.out.println("Codigo ISBN del libro: ");
        this.isbn = leer.nextLong();
        System.out.println("Titulo: ");
        leer.nextLine();
        this.titulo = leer.nextLine();
        System.out.println("Autor: ");
        this.autor = leer.next();
        leer.nextLine();
        System.out.println("Cantidad de paginas: ");
        this.numeroPaginas = leer.nextInt();
               
    }
    //con static
    public static Libros cargarLibroEstatico(Scanner leer){
        System.out.println("Codigo ISBN del libro: ");
        long isbn = leer.nextLong();
        System.out.println("Titulo: ");
        leer.nextLine();
        String titulo = leer.nextLine();
        System.out.println("Autor: ");
        String autor = leer.next();
        leer.nextLine();
        System.out.println("Cantidad de paginas: ");
        int numeroPaginas = leer.nextInt();
        
        Libros libro = new Libros(isbn,titulo,autor,numeroPaginas);
        return libro;
    }
    
}
