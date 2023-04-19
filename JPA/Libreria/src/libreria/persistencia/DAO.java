/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Cliente;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

/**
 *
 * @author Carlitox
 */
public class DAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();

    protected void conectar() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    public void insertarLibro(Libro libro) {
        this.conectar();
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void actualizarLibro(Libro libro) {
        this.conectar();
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void eliminarLibro(Libro libro) {
        this.conectar();
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void insertarAutor(Autor autor) {
        this.conectar();
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void actualizarAutor(Autor autor) {
        this.conectar();
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void eliminarAutor(Autor autor) {
        this.conectar();
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void insertarEditorial(Editorial editorial) {
        this.conectar();
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void actualizarEditorial(Editorial editorial) {
        this.conectar();
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void eliminarEditorial(Editorial editorial) {
        this.conectar();
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void insertarCliente(Cliente cliente) {
        this.conectar();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void actualizarCliente(Cliente cliente) {
        this.conectar();
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void eliminarCliente(Cliente cliente) {
        this.conectar();
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
        this.desconectar();
    }
    
    public void insertarPrestamo(Prestamo prestamo) {
        this.conectar();
        em.getTransaction().begin();
        em.persist(prestamo);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void actualizarPrestamo(Prestamo prestamo) {
        this.conectar();
        em.getTransaction().begin();
        em.merge(prestamo);
        em.getTransaction().commit();
        this.desconectar();
    }

    public void eliminarPrestamo(Prestamo prestamo) {
        this.conectar();
        em.getTransaction().begin();
        em.remove(prestamo);
        em.getTransaction().commit();
        this.desconectar();
    }

}
