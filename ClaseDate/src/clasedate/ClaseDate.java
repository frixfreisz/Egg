
package clasedate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import java.util.Scanner;




public class ClaseDate {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int año = 0, mes = 0, dia = 0;
        System.out.println("Ingrese dia");
        dia = leer.nextInt();
        System.out.println("Ingrese mes");
        mes = leer.nextInt();
        System.out.println("Ingrese año");
        año = leer.nextInt();
     
        LocalDate fechaHoy = LocalDate.now();
        DateTimeFormatter formato0 = DateTimeFormatter.ofPattern("dd / MM / YYYY");
        System.out.println("La fecha de hoy es: " + formato0.format(fechaHoy));
        
        LocalDate fechaManual = LocalDate.of(año, mes, dia);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd / MM / YYYY");
        System.out.println("La fecha manual ingresada es: " + formato.format(fechaManual));
        
       
    
        if(fechaHoy.isAfter(fechaManual)){
            System.out.println("La fecha de hoy es Posterior a la fecha ingresada");
        }else{
            System.out.println("La fecha de hoy es Anterior a la fecha ingresada");
        }    
        
        System.out.println("La diferecia en años entre la fecha de hoy y la fecha manual es: " + fechaHoy.compareTo(fechaManual) + " años");
    }
    
}
