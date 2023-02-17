
package ServiciosPersona;

import Persona.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServiciosPersona {
    private Persona persona;
  
  public ServiciosPersona(){
      this.persona = new Persona();
    }
  
  public void crearPersona(Scanner leer){
      System.out.println("Ingrese el nombre: ");
      persona.setNombre(leer.nextLine());
      System.out.println("Ingrese fecha de nacimiento");
      System.out.println("Dia: ");
      int dia = leer.nextInt();
      System.out.println("Mes: ");
      int mes = leer.nextInt();
      System.out.println("Año: ");
      int anio = leer.nextInt();
      Date fecha = new Date(anio-1900, mes-1, dia);
      persona.setNacimiento(fecha);
      
      
  }
  public void calcularEdad(){
      Date hoy = new Date();
      int edad = hoy.getYear() - persona.getNacimiento().getYear();
      System.out.println(persona.getNombre() + " tiene " + edad + " años.");
    }
  
  public boolean menorQue(Scanner leer ){
      boolean respuesta = false;
      System.out.println("Ingrese una nueva fecha");
      System.out.println("Dia");
      int dia = leer.nextInt();
      System.out.println("Mes");
      int mes = leer.nextInt();
      System.out.println("Año");
      int anio = leer.nextInt();
      Date nuevaFecha = new Date(anio-1900, mes-1, dia);
      if (nuevaFecha.compareTo(persona.getNacimiento()) < 0){
          respuesta = true;
       }
      return respuesta;
  }
  public void mostrarPersona(){
      System.out.println("Nombre: " + persona.getNombre());
      System.out.println("Fecha de nacimiento: " + persona.getNacimiento());
  }
}
