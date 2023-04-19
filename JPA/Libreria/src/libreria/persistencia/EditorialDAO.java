/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;
import java.util.List;
import libreria.entidades.Editorial;

/**
 *
 * @author Carlitox
 */
public final class EditorialDAO extends DAO {
    

    public List<Editorial> buscarEditorialNombre(String nombre) {
try{
        List<Editorial> editoriales = (List<Editorial>) em.createQuery("SELECT a FROM Editorial a "
                + "WHERE a.nombre = :nombre").setParameter("nombre", nombre).getResultList();
        return editoriales;
            } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    
    public List<Editorial> buscarEditorialNombreDeAlta(String nombre) {
     try{
         this.conectar();
        List<Editorial> editoriales = (List<Editorial>) em.createQuery("SELECT a FROM Editorial a "
                + "WHERE a.nombre = :nombre AND a.alta = true").setParameter("nombre", nombre).getResultList();
        return editoriales;
            } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    
    public List<Editorial> buscarEditorialNombreDeBaja(String nombre) {
        try{
        List<Editorial> editoriales = (List<Editorial>) em.createQuery("SELECT a FROM Editorial a "
                + "WHERE a.nombre = :nombre AND a.alta = false").setParameter("nombre", nombre).getResultList();
        return editoriales;
             } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    
    public Editorial buscarEditorialId(Integer id) {
     try{
        Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a "
                + "WHERE a.id = :id").setParameter("id", id).getSingleResult();
        return editorial;
             } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
}