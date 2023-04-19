/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Carlitox
 */
public class ServProducto {
   private Scanner leer = new Scanner(System.in).useDelimiter("\n");
   private ProductoDAO dao;
   private ServFabricante ServFab;
    
    public ServProducto(){
        this.dao = new ProductoDAO();
        this.ServFab = new ServFabricante();
    }
    
    public void presioneTecla() {
        System.out.println("");
        System.out.println("Presione una tecla para continuar...");
        String letra = leer.next();
        
    }
     public Collection<Producto> listarProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    public void listarNombresDeProductos() throws Exception{
        try{
         //listarProductos
         Collection<Producto>productos = listarProductos();
         
         if(productos.isEmpty()){
             throw new Exception("No existen productos en la lista");
             
         }else{
        System.out.println("------Listado de productos-------");
            for (Producto producto : productos) {
                 System.out.println(producto.getNombre());
                 
            }
        }
        }catch(Exception e){
            throw e;
            
        }
    }
    
     public void listarNombresYPreciosDeProductos() throws Exception{
        try{
         //listarProductos
         Collection<Producto>productos = listarProductos();
         
         if(productos.isEmpty()){
             throw new Exception("No existen productos en la lista");
             
         }else{
        System.out.println("------Listado de productos con precios-------");
                
            for (Producto producto : productos) {
                 System.out.println("Producto: " + producto.getNombre() +"\tPrecio: $ "+ producto.getPrecio());
                 
            }
        }
        }catch(Exception e){
            throw e;
            
        }
    }
     
    public void listarProductosPreciosPrecioEntre120y202() throws Exception{
        try{
         //listarProductos
         Collection<Producto>productos = dao.listarProductosPreciosPrecioEntre120y202();
         
         if(productos.isEmpty()){
             throw new Exception("No existen productos dentro de ese rango de precios");
             
         }else{
        System.out.println("------Listado de productos con precios entre $120 y $202-------");
                
            for (Producto producto : productos) {
                 System.out.println("Codigo " + producto.getCodigo() + "\tProducto: " + producto.getNombre() +"\tPrecio: $ "+ producto.getPrecio());
                 
            }
        }
        }catch(Exception e){
            throw e;
            
        } 
    }
    
        public void listarPortatiles() throws Exception{
        try{
         //listarProductos
         Collection<Producto>productos = dao.listarPortatiles();
         
         if(productos.isEmpty()){
             throw new Exception("No existen productos con esos datos");
             
         }else{
        System.out.println("------Listado de productos Portatiles-------");
                
            for (Producto producto : productos) {
                 System.out.println("Codigo " + producto.getCodigo() + "\tProducto: " + producto.getNombre() +"\tPrecio: $ "+ producto.getPrecio());
                 
            }
        }
        }catch(Exception e){
            throw e;
            
        } 
    }
        
    public void listarProductoMasBarato() throws Exception{
        
         Collection<Producto>productos = dao.listarProductoMasBarato();
         
        
        System.out.println("------Producto mas barato-------");
                
            for (Producto producto : productos) {
                 System.out.println("Codigo " + producto.getCodigo() + "\tProducto: " + producto.getNombre() +"\tPrecio: $ "+ producto.getPrecio());
                 
            }
        
        
    }
    
    public void IngresarProducto() throws Exception{
        try{
            Producto producto = new Producto();
            System.out.println("Ingrese el nombre del producto");
            producto.setNombre(leer.next());
            System.out.println("Ingrese el valor del producto");
            producto.setPrecio(leer.nextDouble());
            System.out.println("Ingrese el nombre del fabricante");
            String fab = leer.next();
            
            Fabricante fabricante = ServFab.buscarFabricanteNombre(fab);
            
            if(fabricante == null){
            ServFab.crearFabricante(fab);
            fabricante = ServFab.buscarFabricanteNombre(fab);
            }
            producto.setCodigoFabricante(fabricante.getCodigo());
            
            dao.guardarProducto(producto);
            
        }catch(Exception e){
            throw e;
        }
    }
    
    public void modificarProducto() throws Exception{
        try{
             Collection<Producto>productos = dao.listarProductos();
             for (Producto producto : productos) {
                 System.out.println("CODIGO: " + producto.getCodigo()+ "\tPRODUCTO: " + producto.getNombre());
                 
            }
             System.out.println("Indique el codigo del producto que quiere modificar");
             int op = leer.nextInt();
             Producto prodElegido = null;
             for (Producto producto : productos) {
                 if(producto.getCodigo() == op){
                     prodElegido = producto;
                     break;
                 }
                 
                
            }
                if(prodElegido == null){
                    System.out.println("El producto no existe");
                    return;
                }
            System.out.println("Desea modificar el nombre: " + prodElegido.getNombre() + "? S/N:" );
            String respNombre = leer.next();
            if(respNombre.equalsIgnoreCase("s")){
                System.out.println("Ingrese el Nombre");
                String newNombre = leer.next();
                prodElegido.setNombre(newNombre);
            }
            System.out.println("Desea modificar el precio: " + prodElegido.getPrecio() + "? S/N:" );
            String respPrecio = leer.next();
            if(respPrecio.equalsIgnoreCase("s")){
                System.out.println("Ingrese el Precio");
                double newPrecio = leer.nextDouble();
                prodElegido.setPrecio(newPrecio);
            }
          
            dao.editarProducto(prodElegido);
            System.out.println("El producto se actualizo");
            
            
        }catch(Exception e){
            throw e;
        }
    }
    
    public void menu() throws Exception{
        System.out.println("MENU");
        System.out.println("1 - Lista el nombre de todos los productos que hay en la tabla producto.");
        System.out.println("2 - Lista los nombres y los precios de todos los productos de la tabla producto.");
        System.out.println("3 - Listar aquellos productos que su precio esté entre 120 y 202.");
        System.out.println("4 - Buscar y listar todos los Portátiles de la tabla producto.");
        System.out.println("5 - Listar el nombre y el precio del producto más barato.");
        System.out.println("6 - Ingresar un producto a la base de datos.");
        System.out.println("7 - Ingresar un fabricante a la base de datos");
        System.out.println("8 - Editar un producto con datos a elección.");
        System.out.println("9 - Salir");
        int op = leer.nextInt();
        
        switch(op){
            case 1: 
                this.listarNombresDeProductos();
                this.presioneTecla();
                menu();
                break;
            case 2:
                this.listarNombresYPreciosDeProductos();
                this.presioneTecla();
                this.menu();
                break;
            case 3:
                this.listarProductosPreciosPrecioEntre120y202();
                this.presioneTecla();
                this.menu();
                break;
            case 4:
                this.listarPortatiles();
                this.presioneTecla();
                this.menu();
                break;
            case 5:
                this.listarProductoMasBarato();
                this.presioneTecla();
                this.menu();
                break;
            case 6:
                this.IngresarProducto();
                this.presioneTecla();
                this.menu();
                break;
            case 7:
                System.out.println("Ingrese el nombre del fabricante");
                String nom = leer.next();
                this.ServFab.crearFabricante(nom); 
                this.presioneTecla();
                this.menu();
                break;
            case 8:
                this.modificarProducto();
                this.presioneTecla();
                this.menu();
                break;
            case 9:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
                this.menu();
                break;
                
                
                
        }
    }
}
            
    
