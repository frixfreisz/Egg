/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Carlitos
 */
public class Voto {
    private Alumno votante;
    private ArrayList<Alumno>listaVotos;

    public Voto(Alumno votante) {
        this.votante = votante;
        this.listaVotos = new ArrayList();
    }
    
    public void aVotar(Alumno votacion){
        votacion.setCantidadVotos(votacion.getCantidadVotos() + 1);
        if(!listaVotos.contains(votacion)){
        listaVotos.add(votacion);
    
        }
    }

    public Alumno getVotante() {
        return votante;
    }

    public void setVotante(Alumno votante) {
        this.votante = votante;
    }

    public ArrayList<Alumno> getListaVotos() {
        return listaVotos;
    }

    public void setListaVotos(ArrayList<Alumno> listaVotos) {
        this.listaVotos = listaVotos;
    }

    @Override
    public String toString() {
        return "Voto{" + "votante=" + votante + ", listaVotos=" + listaVotos + '}';
    }
    
}
