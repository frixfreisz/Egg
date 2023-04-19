


import Cuenta.Cuenta;
import Cuenta.ServicioCuenta;
import java.util.Scanner;


public class Ejercicio05Cuenta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean out = false;
        int op = 0;
        ServicioCuenta serv = new ServicioCuenta();
        serv.crearCuenta(leer);
        do{
            
            System.out.println("\n");
            System.out.println("Que operacion desea realizar?");
            System.out.println("1 - Ingresar dinero");
            System.out.println("2 - Retirar dinero");
            System.out.println("3 - Extraer dinero");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Consultar datos");
            System.out.println("6 - Salir");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    serv.Ingreso(leer);
                    
                    break;
                case 2:
                    serv.retirar(leer);
                    
                    break;
                case 3:
                    serv.extraer(leer);
                   
                    break;
                case 4:
                    serv.consultarSaldo();
                    
                    break;
                case 5:
                    serv.consultarDatos();
                    
                    break;
                case 6:
                    out = true;
               
                    break;
                default:
                    System.out.println("Elija una opcion correcta");
              
                    break;
                    
            }
        
        }while(out == false);
        System.out.println("Hasta la proxima");
        
       
     
    }
}


