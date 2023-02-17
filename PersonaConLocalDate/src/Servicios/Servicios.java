
package Servicios;

import PersonaLocal.Persona;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Servicios {
    
    Persona p;
    public Servicios(){
        this.p = new Persona();
    }
    
    public void crearPersona(Scanner leer){
        System.out.println("Ingrese el nombre: ");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.println("Dia: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Año: ");
        int anio = leer.nextInt();
        System.out.println("Hora de nacimiento?");
        System.out.println("Hora");
        int h = leer.nextInt();
        System.out.println("Minutos");
        int m = leer.nextInt();
        LocalDateTime nac = LocalDateTime.of(anio, mes, dia, h, m);
        p.setNacimiento(nac);
        
    }
    
    public void mostrarPersona(){
        System.out.println("Nombre: " + p.getNombre());
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd / MMM / YYYY  -  h:m a");
        
        System.out.println("Fecha de nacimiento: " + f.format(p.getNacimiento()));
    }
     
       
    
    
}
