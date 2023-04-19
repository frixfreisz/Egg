/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;
import java.util.List;
import libreria.entidades.Autor;
/**
 *
 * @author Carlitox
 */
public final class AutorDAO extends DAO {

    public List<Autor> buscarAutorNombre(String nombre) {
        try{
        this.conectar();
            List<Autor> autores = (List<Autor>) em.createQuery("SELECT a FROM Autor a "
                + "WHERE a.nombre = :nombre").setParameter("nombre", nombre).getResultList();
        return autores;
        }catch(Exception e){
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    
    public List<Autor> buscarAutorNombreDeAlta(String nombre) {
        try{
            this.conectar();
        List<Autor> autores = (List<Autor>) em.createQuery("SELECT a FROM Autor a "
                + "WHERE a.nombre = :nombre AND a.alta = true").setParameter("nombre", nombre).getResultList();
        return autores;
        }catch(Exception e){
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    
    public List<Autor> buscarAutorNombreDeBaja(String nombre) {
        try{
     this.conectar();
            List<Autor> autores = (List<Autor>) em.createQuery("SELECT a FROM Autor a "
                + "WHERE a.nombre = :nombre AND a.alta = false").setParameter("nombre", nombre).getResultList();
        return autores;
        }catch(Exception e){
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    
    public Autor buscarAutorId(Integer id) {
        try{
     this.conectar();
            Autor a1 = (Autor) em.createQuery("SELECT a FROM Autor a "
                + "WHERE a.id = :id").setParameter("id", id).getSingleResult();
        return a1;
        }catch(Exception e){
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    
}