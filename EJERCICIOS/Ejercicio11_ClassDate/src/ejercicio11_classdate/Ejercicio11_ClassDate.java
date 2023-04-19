
package ejercicio11_classdate;

import Date.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio11_ClassDate {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        LocalDate fechaHoy = LocalDate.now();
        Date fecha = new Date();
               
        System.out.println("Ingresa numero de dia");
        fecha.setDia(leer.nextInt());
        System.out.println("Ingresa el numero de mes");
        fecha.setMes(leer.nextInt());
        System.out.println("Ingresa el año");
        fecha.setAnio(leer.nextInt());
        
        LocalDate fechaManual = LocalDate.of(fecha.getAnio(),fecha.getMes(),fecha.getDia());
        
        System.out.println("La fecha de hoy es: " + fechaHoy);
        System.out.println("La fecha ingresada es: " + fechaManual);
        System.out.println("La diferenca en años entre ambas fechas es: " +fechaHoy.compareTo(fechaManual));
        
    }
    
}
