
package Servicios;

import Celular.Celular;
import java.util.Scanner;

public class Servicios {
    private Celular celular;
    
    public Servicios(){
        this.celular = new Celular();
    }
    public void cargarCelular(Scanner leer){
        System.out.println("Ingrese marca del celular");
        this.celular.setMarca(leer.nextLine());
        System.out.println("Ingrese el costo:");
        this.celular.setPrecio(leer.nextDouble());
        System.out.println("Ingrese modelo");
        this.celular.setModelo(leer.next());
        
        System.out.println("Memoria Ram");
        this.celular.setMemoriaRam(leer.nextInt());
        System.out.println("Almacenamiento");
        this.celular.setAlmacenamiento(leer.nextInt());
        
    }
    
    public void ingresarCodigo(Scanner leer){
        System.out.println("Codigo numerico de 7");
        int aux = leer.nextInt();
        int[] nuevo = new int[7];
        String num= String.valueOf(aux);
        //char[] aCaracteres = sCadena.toCharArray();
        int aux2 = 0;
        for (int i = 0; i < num.length(); i++) {
            nuevo [i] = Integer.parseInt(num.substring(i, i +1));
             
        }
            this.celular.setCodigo(nuevo);
    }
    
    public void mostrarDatos(){
        System.out.println("Marca: " + this.celular.getMarca());
        System.out.println("Precio: " + this.celular.getPrecio());
        System.out.println("Modelo: " + this.celular.getModelo());
        System.out.println("Ram: " + this.celular.getMemoriaRam());
        System.out.println("Almacenamiento: " + this.celular.getAlmacenamiento());
        System.out.print("Codigo: ");
        for (int i = 0; i < this.celular.getCodigo().length; i++) {
            
        System.out.print(this.celular.getCodigo()[i]);
        }
        System.out.println("");

    }
    
}
