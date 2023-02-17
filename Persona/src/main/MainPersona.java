package main;

import Persona.Persona;
import Persona.PersonaService;

public class MainPersona {

    public static void main(String[] args) {
        
    PersonaService personSer = new PersonaService();
        
        Persona persona1 = personSer.crearPersona(); 
        personSer.calcularIMC(persona1);
        System.out.println("Mayor de edad: " + personSer.mayorDeEdad(persona1));
        Persona persona2 = personSer.crearPersona();
        personSer.calcularIMC(persona2);
        System.out.println("Mayor de edad: " + personSer.mayorDeEdad(persona2));
        Persona persona3 = personSer.crearPersona();
        personSer.calcularIMC(persona3);
        System.out.println("Mayor de edad: " + personSer.mayorDeEdad(persona3));
        Persona persona4 = personSer.crearPersona();
        personSer.calcularIMC(persona4);
        System.out.println("Mayor de edad: " + personSer.mayorDeEdad(persona4));
     
        
        int pesos [] = new int [4];
        pesos[0]=personSer.calcularIMC(persona1);
        pesos[1]=personSer.calcularIMC(persona2);
        pesos[2]=personSer.calcularIMC(persona3);
        pesos[3]=personSer.calcularIMC(persona4); 
                
        int ideal=0;
        int bajo=0;
        int sobre=0;
        
        for (int i = 0; i < 4; i++) {
            switch (pesos[i]){
                case -1:
                    bajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1: 
                    sobre++;
                    break;
            }
        }
        
        System.out.println("Los que estan debajo del peso son: "+ (bajo * 100/4)+"%");
        System.out.println("Los que estan en peso ideal son: "+ (ideal*100/4)+"%");
        System.out.println("Los que estan con sobrepeso son: "+ (sobre*100/4)+"%");
        
        boolean[] edad= new boolean[4]; 
        edad[0] = personSer.mayorDeEdad(persona1);
        edad[1] = personSer.mayorDeEdad(persona2);
        edad[2] = personSer.mayorDeEdad(persona3);
        edad[3] = personSer.mayorDeEdad(persona4);
        
        int mayor=0;
        int menor=0;
        for (int i = 0; i < 4; i++) {
            if(edad[i]){
                mayor++;
            }else{
                menor++;
            }
            
        }
        System.out.println("El procentaje de mayores es: " + (mayor*100/4) + "%");
        System.out.println("El procentaje de menores es: " + (menor*100/4) + "%");
    }
}
