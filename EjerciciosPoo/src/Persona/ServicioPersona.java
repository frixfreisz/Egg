
package Persona;

import java.util.Scanner;

public class ServicioPersona {

    private Persona[] personas;
    private int posicion;
    public ServicioPersona() {
        this.personas = new Persona[4];
        this.posicion = 0;
    }
    
    public ServicioPersona(int cantidad){
        this.personas = new Persona[cantidad];
        this.posicion = 0;
    }
    
    public void crearPersona(Scanner leer){
        System.out.println("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Edad: ");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Sexo con el que se identifica: ");
        System.out.println("H - Hombre");
        System.out.println("M - Mujer");
        System.out.println("O - Otro");
        String sexo = leer.nextLine().toLowerCase();
        System.out.println("Peso: ");
        float peso = leer.nextFloat();
        leer.nextLine();
        System.out.println("Altura: ");
        float altura = leer.nextFloat();
        leer.nextLine();
        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        if(posicion < personas.length){
            personas[posicion] = persona;
            posicion++;
            System.out.println("La persona se agrego correctamente");
        }else{
            System.out.println("La persona no pudo agregarse");
        }
    }
    public void getCalcularIMC(int posicion){
        if(posicion > personas.length || personas[posicion] == null){
            System.out.println("La persona no existe");
            return;
        }
        System.out.println("Vamos a calcular si su peso es el ideal");
        
        Persona.IMC imc = personas[posicion].calcularIMC();
        if(imc == Persona.IMC.BAJO){
            System.out.println("Esta por debajo del peso ideal");
        }else if(imc == Persona.IMC.IDEAL){
            System.out.println("Esta en su peso ideal");
        }else {
            System.out.println("Esta por arriba del peso ideal");
        }
         
    }
    public void esMayorDeEdad(int posicion){
        if(posicion > personas.length || personas[posicion] == null){
            System.out.println("La persona no existe");
            return;
        }
        String resultado = personas[posicion].esMayorDeEdad() ?
                "La persona es mayor de edad" : "La persona es menor de edad";
        System.out.println(resultado);
    }    
    public void contadores(){
        int contBajo = 0, contIdeal = 0, contSobre = 0;
        for (int i = 0; i < personas.length; i++) {
            if(personas[i].getImc() == Persona.IMC.BAJO){
                contBajo++;
            }else if(personas[i].getImc() == Persona.IMC.IDEAL){
                contIdeal++;
            }else{
                contSobre++;
            }
            
        }
        System.out.println("El porcentaje de personas con bajo peso es: " + contBajo * 100 / personas.length + "%");
        System.out.println("El porcentaje de personas con peso ideal es: " + contIdeal * 100 / personas.length + "%");
        System.out.println("El porcentaje de personas con sobrepeso es: " + contSobre * 100 / personas.length + "%");
    }
}
