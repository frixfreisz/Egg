/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Alumno;
import Entidad.Voto;
import java.util.ArrayList;

/**
 *
 * @author Carlitos
 */
public class Simulador {
    private ArrayList<Alumno>listado;
    private ArrayList<Voto> listadoVotos;

    public Simulador() {
        this.listado = new ArrayList();
        this.listadoVotos = new ArrayList();
        
    }
    
    public ArrayList<String> crearListaNombres(int cantidad){
        String[] nombres = new String[]{"Carlos", "Gabriel", "Lucas", "Martin", "Maxi", "Fede", "Valentino","Alfredo"};
        String[] apellido = new String[]{"Perez", "Garcia", "Diaz","Montoya","Soto","Torres","Madariaga","Aguirre"};
        ArrayList <String> listadoNombres = new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            int n = (int) (Math.random() * 8);
            
            String nombreCompleto = nombres[n]+","+apellido[n];
         listadoNombres.add(nombreCompleto);
        }
        return listadoNombres;
    }
    
    public ArrayList<Long> generadorDni(int cantidad){
        ArrayList<Long> listadoDni = new ArrayList();
        for (int i = 0; i < cantidad*4; i++) {
            long n = (long) ((Math.random() * (999999999 - 11111111)) + 111111111);
            
            if(!listadoDni.contains(n)){
                listadoDni.add(n);
                if(listadoDni.size()==cantidad){
                    break;
                }
            }
            
        }
        return listadoDni;
    }
    
    public ArrayList<Alumno> generarAlumnos(int cantidad){
        ArrayList<String> nombres = this.crearListaNombres(cantidad);
        ArrayList<Long> dnis = this.generadorDni(cantidad);
        for (int i = 0; i < cantidad; i++) {
            String[] nombreApellido = nombres.get(i).split(",");
            Alumno alumno = new Alumno(nombreApellido[0],nombreApellido[1],dnis.get(i));
            listado.add(alumno);
        }
        return listado;
    }
    
    public ArrayList<Voto> generarVotacion(){
        
        for (Alumno alumno : listado) {
            Voto voto = new Voto(alumno);
            ArrayList<Alumno>votaciones = new ArrayList();
            while(votaciones.size() < 3){
                int pos = (int)(Math.random()*listado.size());
                Alumno votacion = listado.get(pos);
                if(alumno.getDni()!= votacion.getDni() && !votaciones.contains(votacion)){
                    voto.aVotar(votacion);
                    votaciones.add(votacion);

                }
            }
            
            listadoVotos.add(voto);
        }
        return listadoVotos;
    }
    
    public void calcularVotos(){
        
    }
    
    public ArrayList<Voto> mostrarListadoDeVotos(){
        return listadoVotos;
    }
    
}
