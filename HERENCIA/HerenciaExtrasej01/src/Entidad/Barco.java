/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Carlitos
 */
public abstract class Barco {
    protected String matricula;
    protected Integer eslora;
    protected Integer anio;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    public Integer calcularModulo(){
     return this.eslora*10;
 }   
    @Override
    public String toString() {
        return "Barco con matricula: " + matricula + ". " + eslora + " metros de eslora y  anio de fabricacion " + anio;
    }
    
    
    
}
