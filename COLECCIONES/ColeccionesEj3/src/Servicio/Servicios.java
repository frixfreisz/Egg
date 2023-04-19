
package Servicio;

import Entidad.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicios {
    private Scanner leer;
    private ArrayList<Alumnos>Listado;
    
    public Servicios(){
        this.leer = new Scanner(System.in);
        this.Listado = new ArrayList();
    }
    
    public void cargarAlumno(){
        do{
        Alumnos alumno = new Alumnos();
            System.out.println("Ingrese el nombre de alumno a cargar");
            alumno.setAlumno(leer.next());
            
            Integer[]notas = new Integer[3];
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Ingrese la nota " + (i+1));
                notas[i] = leer.nextInt();
            }
            alumno.setNotas(notas);
            Listado.add(alumno);
            System.out.println("Desea ingresar otro alumno");
            String resp = leer.next().toLowerCase();
            if(resp.equals("n")){
                break;
            }
        }while(true);
      }
    
    public void mostrarListado(){
        for (Alumnos alumnos : Listado) {
            System.out.println(alumnos);
            
        }
    }
    
    public float notaFinal(){
        float promedio = 0;
        
        System.out.println("Ingrese el nombre del alumno para calcular promedio:");
        String nombre = leer.next();
        Integer[]notas = new Integer[3];
        for (Alumnos alumnos : Listado) {
            if(alumnos.getAlumno().equals(nombre)){
                notas = alumnos.getNotas();
                
                for (int i = 0; i < 3; i++) {
                    promedio+=notas[i];
                    
                }
                break;
            }
            
        }
        return (promedio/3);
    }
    
    
}
