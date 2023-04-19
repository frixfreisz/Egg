/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Cliente;

/**
 *
 * @author Carlitox
 */
public class ClienteDAO extends DAO {
    
    public List<Cliente> buscarClienteNombre(String nombre) {
        try{
        this.conectar();
            List<Cliente> clientes = (List<Cliente>) em.createQuery("SELECT a FROM Cliente a "
                + "WHERE a.nombre = :nombre").setParameter("nombre", nombre).getResultList();
        return clientes;
        }catch(Exception e){
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    
    public List<Cliente> buscarClienteNombreDeAlta(String nombre) {
        try{
            this.conectar();
        List<Cliente> clientes = (List<Cliente>) em.createQuery("SELECT a FROM Cliente a "
                + "WHERE a.nombre = :nombre AND a.alta = true").setParameter("nombre", nombre).getResultList();
        return clientes;
        }catch(Exception e){
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    
    public List<Cliente> buscarClienteNombreDeBaja(String nombre) {
        try{
     this.conectar();
            List<Cliente> clientes = (List<Cliente>) em.createQuery("SELECT a FROM Cliente a "
                + "WHERE a.nombre = :nombre AND a.alta = false").setParameter("nombre", nombre).getResultList();
        return clientes;
        }catch(Exception e){
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
    
    public Cliente buscarClientePorDNI(Long documento) {
        try{
     this.conectar();
            Cliente cliente = (Cliente) em.createQuery("SELECT c FROM Cliente c "
                    + "WHERE c.documento = :documento").setParameter("documento", documento).getSingleResult();
        return cliente;
        }catch(Exception e){
             
             return null;
        }finally{
            this.desconectar();
        }
    }
    
}
