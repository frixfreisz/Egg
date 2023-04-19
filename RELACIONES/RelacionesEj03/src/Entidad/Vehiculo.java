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
public class Vehiculo {
    private String marca;
    private String patente;
    private String modelo; 
    private Integer anio;
    private String numMotor;
    private String numchasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer anio, String numMotor, String numchasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numMotor = numMotor;
        this.numchasis = numchasis;
        this.color = color;
        this.tipo = tipo;
        this.patente = patente;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }

    public String getNumchasis() {
        return numchasis;
    }

    public void setNumchasis(String numchasis) {
        this.numchasis = numchasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getPatente() {
        return tipo;
    }

    public void setPatente(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "----------------------------------------" + "\n| Marca: " + marca + "| Modelo: " + modelo + "| Patente: " + patente + "\n| Anio: " + anio + "| Motor: " + numMotor + "| Numero de Chasis: " + numchasis + "\n| Color: "  + color + "| Tipo: " + tipo + "\n----------------------------------------" + "\n";
    }
    
}
