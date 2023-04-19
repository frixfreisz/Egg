
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Carlitox
 */
public class ServFabricante {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private FabricanteDAO dao;
   
    public ServFabricante() {
        this.dao = new FabricanteDAO();
    }
    public void crearFabricante(String nom) throws Exception{
        try {
            
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nom);
            dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void imprimirFabricantes() throws Exception{
         try {
            //Listar porductos
            Collection<Fabricante> fabricantes = dao.listarFabricantes();
            //Imprimimos los fabricantes, todos los argumentos
            if (fabricantes.isEmpty()) {
                throw new Exception("No existen fabricantes para imprimir");
            } else {
                for (Fabricante p : fabricantes) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    
    }
    public Fabricante buscarFabricanteNombre(String nombre) throws Exception{
         try {

            Fabricante fabricante = dao.buscarFabricanteNombre(nombre);

            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
    
}
