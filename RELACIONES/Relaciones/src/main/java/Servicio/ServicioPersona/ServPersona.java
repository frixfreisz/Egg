
package Servicio.ServicioPersona;

import Entidad.Dni;
import Entidad.ManosPersonas;
import java.util.ArrayList;
import java.util.Scanner;

public class ServPersona {

    private Scanner leer;
    private ArrayList<ManosPersonas> Lista;
    private Dni dni = new Dni();

    public ServPersona() {
        this.leer = new Scanner(System.in);
        this.Lista = new ArrayList();
        
    }
    
    public void crearPersona(){
        do{
            ManosPersonas pers = new ManosPersonas();
            System.out.println("Ingrese el nombre de la persona");
            pers.setNombre(leer.next());
            System.out.println("Ingrese el apellido");
            pers.setApellido(leer.next());
             
            System.out.println("Ingrese la serie del documento");
            this.dni.setSerie(leer.next());
            System.out.println("Ingrese el numero de dni");
            this.dni.setNumero(leer.nextInt());
            Lista.add(pers);
            System.out.println("Desea cargar otra persona?");
            String resp = leer.next();
            if(resp.equalsIgnoreCase("no")){
                break;
            }
            
           
        }while(true);
    }
    
    public void mostrarPersona(){
        for (ManosPersonas m : Lista) {
            System.out.println(m);
            
        }
    }
            
}
