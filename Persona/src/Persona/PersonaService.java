
package Persona;

import java.util.Scanner;

public class PersonaService {
Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Persona crearPersona(){
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su peso: ");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese el sexo: ");
        p1.setSexo(leer.next());
        System.out.println("Ingrese la edad: ");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese su altura: ");
        p1.setAltura(leer.nextDouble());
        System.out.println("Los atributos de la persona están completos.");
        return p1;
    }
    
    public int calcularIMC(Persona persona){
        //variables aux
        double peso = persona.getPeso();
        double altura = persona.getAltura();
        //variables de uso
        double formula = (int)peso/(Math.pow(altura, 2));
        int resultado=0;
        System.out.println("El calculo dio como resultado: " + formula);
        if(formula<20){
            resultado = -1;
            System.out.println("La persona esta por debajo de su peso ideal.");
        }else if(formula >= 20 && formula <= 25){
            resultado = 0;
            System.out.println("La persona esta en su peso ideal.");
        }else if(formula>25){
            resultado = 1;
            System.out.println("La persona tiene sobrepeso.");
        }
        return resultado;
        
    }
    public boolean mayorDeEdad(Persona persona){
        boolean resultado = persona.getEdad()>18;
        return resultado;
    }
}