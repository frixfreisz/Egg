
package coleccionesej3;

import Servicio.Servicios;

public class ColeccionesEj3 {

    public static void main(String[] args) {
        Servicios serv = new Servicios();
        serv.cargarAlumno();
        System.out.println("");
        serv.mostrarListado();
        float notaFinal = serv.notaFinal();
        if(notaFinal==0){
            System.out.println("El alumno no se existe en la lista");
        }else{
            System.out.println("La nota final es: " + notaFinal);
        }
    }
    
}
