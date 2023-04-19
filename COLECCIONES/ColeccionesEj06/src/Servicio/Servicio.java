
package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Servicio {
   private Scanner leer;
   private HashMap<String, Integer> lista;
   Tienda tienda;

    public Servicio() {
        this.leer = new Scanner(System.in);
        this.tienda = new Tienda();
        this.lista  = new HashMap();
        
    }
    
    public void cargarTienda(){
        System.out.println("---Carga de auticulos---");
        do{
            System.out.println("Que producto desea cargar?");
            this.tienda.setProducto(leer.next());
            System.out.println("Precio ?");
            this.tienda.setPrecio(leer.nextInt());
            lista.put(this.tienda.getProducto(),this.tienda.getPrecio());
            System.out.println("Desea cragar un nuevo producto");
           
            
            
        }while(leer.next().equalsIgnoreCase("si"));
    }
    
    public void mostrarLista(){
        for (Map.Entry<String, Integer> list : lista.entrySet()) {
            String key = list.getKey();
            Integer value = list.getValue();
            System.out.println("Articulo: " + key + "----------- $ " + value);
        }
            
    }
    
    public void modificarPrecio(){
        System.out.println("A que producto desea cambiar precio?");
        String edit = leer.next();
        for (String producto : this.lista.keySet()) {
            if(producto.equalsIgnoreCase(edit)){
                System.out.println("Actualice el precio");
                lista.replace(edit, leer.nextInt());
            
        }
            
        }
    }
    
    public void eliminarProducto(){
        System.out.println("Que producto desea eliminar?");
        String borrar = leer.next();
        for (String producto : this.lista.keySet()) {
            if(producto.equalsIgnoreCase(borrar)){
                lista.remove(borrar);
            
        }
            
        }
        
    }
    
}
   
   

