/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.DAO;
import libreria.persistencia.EditorialDAO;


/**
 *
 * @author Carlitox
 */
public class EditorialServicio {
   
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EditorialDAO edao = new EditorialDAO();
    DAO dao = new DAO();
    

    public Editorial buscarEditorialNombre(String nombre) {
        List<Editorial> editoriales = edao.buscarEditorialNombre(nombre);

        return editoriales.size() == 0 ? null : editoriales.get(0);

    }
    public Editorial buscarEditorialPorID(Integer id) {
        Editorial editoriales = edao.buscarEditorialId(id);

        return editoriales;

    }

    public Editorial crearEditorial() {
        System.out.println("Ingrese el nombre del Editorial");
        String nombre = leer.next();

        Editorial a = this.buscarEditorialNombre(nombre);
        if (a == null) {
            a = new Editorial();
            a.setNombre(nombre);

            dao.insertarEditorial(a);
            
        } else {
            System.out.println("El editorial ya existe en la base de datos");
        }
        return a;
    }
    
    public void editarEditorial() {
        System.out.println("Ingrese el nombre del Editorial");
        String nombre = leer.next();
                
        Editorial a = this.buscarEditorialNombre(nombre);
        if(a == null){
            System.out.println("El editorial no existe en la base de datos");
            return;
        
        }
        System.out.println("Desea modificar la Editorial: " + a.getNombre() + "? S/N:" );
            String respEditorial = leer.next();
            if(respEditorial.equalsIgnoreCase("s")){
                System.out.println("Ingrese el nuevo Nombre");
                String newEditorial = leer.next();
                a.setNombre(newEditorial);
                dao.actualizarEditorial(a);
            }
    }
    
    
    public void eliminarEditorial() {
        System.out.println("Ingrese el Id del editorial a eliminar");
        int id = leer.nextInt();
        
        Editorial a = this.buscarEditorialPorID(id);
        if(a==null){
            System.out.println("El editorial no existe en la base de datos");
            return;
        }
        dao.eliminarEditorial(a);

       
    }
    
        public void DarDeBajaEditorial() {
        System.out.println("Ingrese el nombre del Editorial");
        String nombre = leer.next();
                
        Editorial a = this.buscarEditorialNombre(nombre);
        if(a == null){
            System.out.println("El editorial no existe en la base de datos");
            return;
        
        }
        System.out.println("Ingrese la palabra 'false' para dar de baja");
        Boolean baja = leer.nextBoolean();

            a.setAlta(baja);
            dao.actualizarEditorial(a);

    }
}
    