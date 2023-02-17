
package ejercicio03.Operacion;

import java.util.Scanner;

public class ServiciosOperacion {
    
    public Operacion cargarNumeros(Scanner leer){
        System.out.println("Ingresa el primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = leer.nextInt();
        
        return new Operacion(num1,num2);
    }
    
    public int suma(Operacion mostrar){
        return mostrar.getNum1() + mostrar.getNum2();
    }
    
    public int resta(Operacion mostrar){
        return mostrar.getNum1() - mostrar.getNum2();
    }
    public void multiplicacion(Operacion mostrar){
        if (mostrar.getNum1() == 0 || mostrar.getNum2() == 0){
            System.out.println("Uno de los numero es 0 por lo tanto el resultado es 0");
        }else{
            System.out.println("El resultado de la multiplicacion es: " + mostrar.getNum1() * mostrar.getNum2());
            
        }
            
    }
    
    public void divicion(Operacion mostrar){
        if (mostrar.getNum1() == 0 || mostrar.getNum2() == 0){
          System.out.println("Uno de los numero es 0 por lo tanto el resultado es 0");
        }else{
            System.out.println("El resultado de la divicion es: " + (double)mostrar.getNum1() / (double)mostrar.getNum2());
            
        }
        
    }
    
}
