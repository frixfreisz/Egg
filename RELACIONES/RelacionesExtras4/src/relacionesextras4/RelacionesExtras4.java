/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesextras4;

import Entidad.Alumno;
import Entidad.Voto;
import Servicios.Simulador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class RelacionesExtras4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Simulador sim = new Simulador();
        System.out.println("Cuentos alumnos quiere generar?");
        int cantidad = leer.nextInt();
        ArrayList<Alumno>alumnos = sim.generarAlumnos(cantidad);
        System.out.println(alumnos);
        ArrayList<Voto>votaciones = sim.generarVotacion();
        System.out.println(votaciones);
        
    }
    
}
