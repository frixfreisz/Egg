
package Servicio;



import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class ServElec{
    private Scanner leer;
    private String consElec;
    private float pesoElec;
    private String colorElec;
   
    
    

    public ServElec() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        
    }
    
    private void crearElectrodomestico(String tipo){

        System.out.println("Ingresa la letra del consumo electrico de " + tipo + ": A,B,C,D,F");
        this.consElec = leer.next();
        System.out.println("Ingrese el peso de " + tipo + " en Kg: ");
        this.pesoElec = leer.nextFloat();
        System.out.println("Ingrese el color de " + tipo + ": ");
        this.colorElec = leer.next();
    }
    
    public Lavadora crearLavadora(){
        System.out.println("");
        System.out.println("Cargando datos de LAVADORA...");
        this.crearElectrodomestico("la Lavadora");
        System.out.println("Ingrese capacidad de carga de la Lavadora: ");
        float carga = leer.nextFloat();
        Lavadora lav = new Lavadora(carga, this.pesoElec, 1000, this.colorElec, this.colorElec);
        lav.precioFinal();
        return lav;
    }
    
    public Televisor crearTelevisor(){
        System.out.println("");
        System.out.println("Cargando datos del TELEVISOR...");
        this.crearElectrodomestico("El Televisor");
        System.out.println("Cantidad de pulgadas del TV?:");
        int res = leer.nextInt();
        System.out.println("Tiene TDT?");
        boolean tdt = leer.next().equalsIgnoreCase("si");
        
        Televisor tv = new Televisor(res, tdt, this.pesoElec, 1500, this.colorElec, this.colorElec );
        tv.precioFinal();
        return tv;
    }
  
 
}
    
