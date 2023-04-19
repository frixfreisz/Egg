/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;
import java.util.List;
import libreria.entidades.Libro;
/**
 *
 * @author Carlitox
 */
public final class LibroDAO extends DAO {

    public void listarLibos() {
        try {
            this.conectar();
            List<Libro> ListaDeLibros = em.createQuery("SELECT l FROM Libro l").getResultList();
            for (Libro llist : ListaDeLibros) {
                System.out.println("ISBM: " + llist.getIsbn() + "\tTitulo:" + llist.getTitulo()
                        + "\tAnio: " + llist.getAnio() + "\tAutor: " + llist.getAutor() + "\tED: " + llist.getEditorial() + "\tEjemplares: " + llist.getEjemplares());
            }
        } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             
        }finally{
            this.desconectar();
        }
    }
    public void listarLibosPrestados() {
        try {
            this.conectar();
            List<Libro> ListaDeLibros = em.createQuery("SELECT l FROM Libro l").getResultList();
            for (Libro llist : ListaDeLibros) {
                System.out.println("ISBM: " + llist.getIsbn() + "\tTitulo:" + llist.getTitulo()
                        +  "\tEjemplares: " + llist.getEjemplares() + "\tPrestados: " + llist.getEjemplaresPrestados()+"\tEn Stock: " + llist.getEjemplaresRestantes());
            }
        } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             
        }finally{
            this.desconectar();
        }
    }

    public List<Libro> buscarLibroNombre(String titulo) {
        try {
            this.conectar();
            List<Libro> libros = (List<Libro>) em.createQuery("SELECT a FROM Libro a "
                    + "WHERE a.titulo = :titulo").setParameter("titulo", titulo).getResultList();
            return libros;

        } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }

    public List<Libro> buscarLibroNombreDeAlta(String titulo) {
        try {
            this.conectar();
            List<Libro> libros = (List<Libro>) em.createQuery("SELECT a FROM Libro a "
                    + "WHERE a.titulo = :titulo AND a.alta = true").setParameter("titulo", titulo).getResultList();
            return libros;
        } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }

    public List<Libro> buscarLibroNombreDeBaja(String titulo) {
        try {
            this.desconectar();
            List<Libro> libros = (List<Libro>) em.createQuery("SELECT a FROM Libro a "
                    + "WHERE a.titulo = :titulo AND a.alta = false").setParameter("titulo", titulo).getResultList();
            return libros;
        } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }

    public Libro buscarLibroId(Integer id) {
        try {
            this.conectar();
            Libro libro = (Libro) em.createQuery("SELECT a FROM Libro a "
                    + "WHERE a.id = :id").setParameter("id", id).getSingleResult();
            return libro;
        } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }

    public List<Libro> buscarLibroPorAutor(String nombre) {
        try {
            this.conectar();
            List<Libro> libro = (List<Libro>) em.createQuery("SELECT l FROM Libro l "
                    + "WHERE l.autor.nombre LIKE :nombre").setParameter("nombre", "%" + nombre + "%").getResultList();
            return libro;

        } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }

    public List<Libro> buscarLibroPorEditorial(String nombre) {
        try {
            this.conectar();
            List<Libro> libro = (List<Libro>) em.createQuery("SELECT l FROM Libro l "
                    + "WHERE l.editorial.nombre LIKE :nombre").setParameter("nombre", "%" + nombre + "%").getResultList();
            return libro;
        } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    

    public List<Libro> buscarLibroPorIsbn(Long isbn) {
        try {
            this.conectar();
            List<Libro> libros = (List<Libro>) em.createQuery("SELECT l FROM Libro l "
                    + "WHERE l.isbn = :isbn").setParameter("isbn", isbn).getResultList();
            return libros;
        } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    public void modificarEjemplares(Libro libro){
        this.actualizarLibro(libro);
        
        
}


}