
package alumnosmain;

import Servicio.ServicioAlumno;

public class AlumnosMain {
    public static void main(String[] args) {
        ServicioAlumno serv = new ServicioAlumno();
        serv.cargarAlumno();
        serv.cargarAlumno();
        System.out.println("");
        serv.mostarLista();
        float notaFinal = serv.promedioFinal();
        if(notaFinal==0){
            System.out.println("El alumno no se existe en la lista");
        }else{
            System.out.println("La nota final es: " + notaFinal);
        }
    }
    
    
}
