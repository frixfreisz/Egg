/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopolimorfismo;

import Entidad.Alumno;
import Entidad.Docente;
import Entidad.Persona;
import Entidad.Prueba.Vaca;
import Interfaz.IAccion;
import java.util.ArrayList;

/**
 *
 * @author Carlitos
 */
public class EjercicioPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona docente = new Docente("Carlos", 29861251, "Profesor", 0);
        Persona alumno = new Alumno("Carlitos", 25625141, "Alumno", "Masculino");
        
        
       
        System.out.println(docente.toString());
        System.out.println(alumno.toString());
        
        Vaca vaca = new Vaca();
        System.out.println("La edad de la vaca es: " + vaca.getEdad());
        
        ArrayList<IAccion>listado = new ArrayList();
        listado.add(docente);
        listado.add(alumno);
        listado.add(vaca);
        
        for (IAccion item : listado) {
            System.out.println(item.gritar());
            
        }
        
    }
    
}
