package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean bandera = false;
        
        while (bandera == false) {
            System.out.println("Ingrese el nombre de la persona");
            String nom = leer.nextLine();
            System.out.println("Ingrese la edad");
            int edad = leer.nextInt();
            leer.nextLine();
            if (edad > 17) {
                System.out.println("-----------------------------------------");
                System.out.println("Nombre: " + nom);
                System.out.println("Edad: " + edad);
                System.out.println("Es mayor de edad");
                System.out.println("-----------------------------------------");
                

            } else if(edad < 18){
                System.out.println("-----------------------------------------");
                System.out.println("Nombre: " + nom);
                System.out.println("Edad: " + edad);
                System.out.println("Es menor de edad");
                System.out.println("-----------------------------------------");
            }

            System.out.println("Desea cargar otra persona? si/no");
            String salir = leer.nextLine();
            
            if(salir.equals("no")){
                bandera = true;
            }else{
                bandera = false; 
            }
                
            

        }
        System.out.println("Muchas gracias...");
    }

}
