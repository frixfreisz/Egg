s/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author franc
 */
public class ServicioTienda {
    private final Scanner leer;
    
    private final HashMap<String,Double> productos;
    private Tienda t;
    

    public ServicioTienda() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap();
        this.t = new Tienda();
        
    }

    

    public void crearProducto(){
        String r;
        do {            
            System.out.println("Ingrese el producto");
            t.setProducto(leer.next());
            System.out.println("Ingrese el precio");
            t.setPrecio(leer.nextDouble());
            productos.put(t.getProducto(), t.getPrecio());
            System.out.println("Quieres agregar otro productos?");
            r = leer.next();
            if (r.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);
    }
    
    public void mostrar(){
        System.out.println("Productos y sus precios");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Producto: "+key+" Precio: "+value);
            
        }
    }
    
    public void reemplazo(){
//        productos.replace(t.getProducto(), t.setPrecio(aux));
        System.out.println("Que producto quiere cambiarle el precio: ");
        String r = leer.next();
        for (String pro: productos.keySet()) {
            if (pro.equals(r)) {
//                productos.replace(t.getProducto(), t.getPrecio(), leer.nextDouble());
                  System.out.println("Actualice el precio.");
                  productos.replace(pro, leer.nextDouble());
            }
        }

    }
    
        public void eliminar(){

        System.out.println("Que producto quiere eliminar el precio: ");
        String r = leer.next();
//        for (String pro: productos.keySet()) {
//            if (pro.equals(r)) {
//                  productos.remove(pro, t.getPrecio())
//            }
//        }
        productos.remove(r);

    }
    
}
