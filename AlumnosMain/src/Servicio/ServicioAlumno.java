
package Servicio;

import Entidad.EntidadAlumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {
    
    private Scanner leer;
    private ArrayList<EntidadAlumno>Listado;

    public ServicioAlumno() {
        this.leer = new Scanner(System.in);
        this.Listado = new ArrayList();
    }
    
    public void cargarAlumno(){
        System.out.println("Listado de alumnos");
        do{
            EntidadAlumno alumno = new EntidadAlumno();
            System.out.println("Ingresa el nombre del Alumno");
            alumno.setAlumno(leer.next());
            
            Integer[] notas = new Integer[3];
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Ingrese la " + (i+1) + "º Nota.");
                notas[i] = leer.nextInt();
            }
            alumno.setNotas(notas);
            Listado.add(alumno);
                
                System.out.println("Desea ingresar un nuevo alumno?");
                String resp = leer.next();
                if(resp.equals("no")){
                    break;
                }
                
        }while(true);
    }
    
    public void mostarLista(){
        for (EntidadAlumno alumnos : Listado) {
            System.out.println(alumnos);
            
        }
    }
    
    public float promedioFinal(){
        float nf = 0;
        System.out.println("Ingrese el nombre del alumno a promediar.");
        String nombre = leer.next();
        Integer[] notas = new Integer[3];
        for (EntidadAlumno alumno : Listado) {
            if(alumno.getAlumno().equals(nombre)){
                notas = alumno.getNotas();
                for (int i = 0; i < 3; i++) {
                    nf += notas[i]; 
                    
                }
                break;
            }
        }return (nf/3);
    }
    
    
}
