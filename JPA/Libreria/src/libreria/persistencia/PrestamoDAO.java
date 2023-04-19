/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

/**
 *
 * @author Carlitox
 */
public class PrestamoDAO extends DAO{
    
     public List<Prestamo> buscarPrestamoPorCliente(Cliente cliente){
            
        try {
            this.conectar();
            List<Prestamo> prestamo = (List<Prestamo>) em.createQuery("SELECT p FROM Prestamo p "
                    + "WHERE p.cliente.documento = :documento").setParameter("documento",cliente.getDocumento()).getResultList();
            return prestamo;

        } catch (Exception e) {
             System.out.println("ERROR"+e.getMessage());
             return null;
        }finally{
            this.desconectar();
        }
    }
        
    
}


