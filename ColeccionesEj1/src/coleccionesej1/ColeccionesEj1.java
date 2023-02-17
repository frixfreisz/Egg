package coleccionesej1;

import Servicio.Servicio;
import java.util.Scanner;

public class ColeccionesEj1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Servicio serv = new Servicio();
        boolean bandera = true;
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("            Inventario de Razas Caninas            ");
            System.out.println("---------------------------------------------------");
            System.out.println("                 Que desea hacer?");
            System.out.println("");
            System.out.println("1 - cargar raza");
            System.out.println("2 - mostrar razas");
            System.out.println("3 - eliminar raza");
            System.out.println("4 - salir");
            int resp = leer.nextInt();

            switch (resp) {
                case 1:
                    serv.crearRaza();
                    serv.ordenarRaza();
                    
                    break;
                case 2:
                    serv.ordenarRaza();
                    serv.mostrarRaza();
                    break;
                case 3:
                    serv.eliminarPorRazaConFor();
                    serv.ordenarRaza();
                    
                    break;

                case 4:
                    bandera = false;
            }

        } while (bandera == true);
        System.out.println("Hasta la proxima");
    }

}
