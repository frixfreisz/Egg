/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;



import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 *
 * @author Carlitox
 */
public final class ProductoDAO extends DAO{
    
        
    public void guardarProducto(Producto producto) throws Exception{
     try{
         if(producto == null){
             throw new Exception("Debe ingresar un producto");
         }
         
         String sql = "INSERT INTO Producto (nombre, precio, codigo_fabricante)"
                 + "VALUES ('" + producto.getNombre() + "' , '" + producto.getPrecio() 
                 + "' , '" + producto.getCodigoFabricante() + "' );";
         insertarModificarEliminar(sql);
                 
     }   catch(Exception e){
         throw e;
         
     }
    }
    
     public void editarProducto(Producto producto) throws Exception{
     try{
         if(producto == null){
             throw new Exception("Debe ingresar un producto");
         }
         
         String sql = "UPDATE Producto set nombre = '" 
                 + producto.getNombre() + "' , precio = " 
                 + producto.getPrecio() + " WHERE codigo = " 
                 + producto.getCodigo();
                 
         insertarModificarEliminar(sql);
                 
     }   catch(Exception e){
         throw e;
         
     }
    }
    
   
    public Collection<Producto> listarNombresDeProductos() throws Exception{
      try{
          
          String sql = "SELECT nombre FROM Producto";
          
          consultarBase(sql);
          
          Producto producto = null;
          Collection<Producto> productos = new ArrayList();
          while(resultado.next()){
              producto = new Producto();
              producto.setNombre(resultado.getString("nombre"));
              productos.add(producto);
          }
          desconectarBase();
          return productos;
          
      }  catch(Exception e){
          e.printStackTrace();
          desconectarBase();
          throw new Exception ("Error de sistema");
      }
    }
    
    public Collection<Producto> listarNombresYPreciosDeProductos() throws Exception{
      try{
          
          String sql = "SELECT nombre, precio FROM Producto;";
          
          consultarBase(sql);
          
          Producto producto = null;
          Collection<Producto> productos = new ArrayList();
          while(resultado.next()){
              producto = new Producto();
              producto.setNombre(resultado.getString("nombre"));
              producto.setPrecio(resultado.getDouble("precio"));
              productos.add(producto);
          }
          desconectarBase();
          return productos;
          
      }  catch(Exception e){
          e.printStackTrace();
          desconectarBase();
          throw new Exception ("Error de sistema");
      }
    }
    
    public Collection<Producto> listarProductosPreciosPrecioEntre120y202() throws Exception{
      try{
          
          String sql = "SELECT * FROM Producto WHERE precio BETWEEN 120 AND 202;";
          
          consultarBase(sql);
          
          Producto producto = null;
          Collection<Producto> productos = new ArrayList();
          while(resultado.next()){
              producto = new Producto();
              producto.setCodigo(resultado.getInt("codigo"));
              producto.setNombre(resultado.getString("nombre"));
              producto.setPrecio(resultado.getDouble("precio"));
              productos.add(producto);
          }
          desconectarBase();
          return productos;
          
      }  catch(Exception e){
          e.printStackTrace();
          desconectarBase();
          throw new Exception ("Error de sistema");
      }
    }
    
    public Collection<Producto> listarPortatiles() throws Exception{
      try{
          
          String sql = "SELECT * FROM Producto WHERE nombre LIKE '%portátil%';";
          
          consultarBase(sql);
          
          Producto producto = null;
          Collection<Producto> productos = new ArrayList();
          while(resultado.next()){
              producto = new Producto();
              producto.setCodigo(resultado.getInt("codigo"));
              producto.setNombre(resultado.getString("nombre"));
              producto.setPrecio(resultado.getDouble("precio"));
              productos.add(producto);
          }
          desconectarBase();
          return productos;
          
      }  catch(Exception e){
          e.printStackTrace();
          desconectarBase();
          throw new Exception ("Error de sistema");
      }
    }
    
        public Collection<Producto> listarProductoMasBarato() throws Exception{
      try{
          
          String sql = "SELECT * FROM Producto WHERE precio =(Select MIN(precio)FROM Producto);";
          
          consultarBase(sql);
          
          Producto producto = null;
          Collection<Producto> productos = new ArrayList();
          while(resultado.next()){
              producto = new Producto();
              producto.setCodigo(resultado.getInt("codigo"));
              producto.setNombre(resultado.getString("nombre"));
              producto.setPrecio(resultado.getDouble("precio"));
              productos.add(producto);
          }
          desconectarBase();
          return productos;
          
      }  catch(Exception e){
          e.printStackTrace();
          desconectarBase();
          throw new Exception ("Error de sistema");
      }
    }
    
    public Collection<Producto> listarProductos() throws Exception{
      try{
          
          String sql = "SELECT * FROM Producto";
          
          consultarBase(sql);
          
          Producto producto = null;
          Collection<Producto> productos = new ArrayList();
          while(resultado.next()){
              producto = new Producto();
              producto.setCodigo(resultado.getInt("codigo"));
              producto.setNombre(resultado.getString("nombre"));
              producto.setPrecio(resultado.getDouble("precio"));
              productos.add(producto);
          }
          desconectarBase();
          return productos;
          
      }  catch(Exception e){
          e.printStackTrace();
          desconectarBase();
          throw new Exception ("Error de sistema");
      }
    }
    
    //    public void modificarProducto(Producto producto) throws Exception{
//     try{
//         if(producto == null){
//             throw new Exception("Debe indicar el producto que quiere modificar");
//         }
//         
//         String sql = "UPDATE Producto SET "
//                 + "nombre = + '" + producto.getNombre() + "'WHERE codigo = '" + producto.getCodigo() + "' );";
//         insertarModificarEliminar(sql);
//                 
//     }   catch(Exception e){
//         throw e;
//         
//     }
//    }
//    
//    public void eliminarFabricante(Producto producto) throws Exception{
//     try{
//                  
//         String sql = "DELETE FROM Producto WHERE nombre = '" + producto.getNombre() + "'";
//               
//         insertarModificarEliminar(sql);
//                 
//     }   catch(Exception e){
//         throw e;
//         
//     }
//    }
//    
//    public Producto buscarProductoPorCodigo(String nombre) throws Exception{
//      try{
//          
//          String sql = "SELECT * FROM Producto"
//                    + "WHERE nombre - '" + nombre + "'";
//          consultarBase(sql);
//          
//          Producto producto = null;
//          
//          while(resultado.next()){
//              producto = new Producto();
//              producto.setCodigo(resultado.getInt("codigo"));
//              producto.setNombre(resultado.getString("nombre"));
//              producto.setPrecio(resultado.getDouble("precio"));
//          }
//          desconectarBase();
//          return producto;
//          
//      }  catch(Exception e){
//          desconectarBase();
//          throw e;
//      }
//    }
      
}


