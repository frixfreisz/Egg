/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enum.Color;

/**
 *
 * @author Carlitos
 */
public abstract class Electrodomestico {
    protected float precio;
    protected Color color;
    protected String consumoElectrico;
    protected float peso;

    public Electrodomestico() {
        this.consumoElectrico = consumoElectrico;
        this.color = Color.BLANCO;
        this.precio = 1000;
        
    }
/**
 * 
 * Constructor y a la vez metodo crearElectrodomestico 
 */ 

    public Electrodomestico(float peso, float precio, String consumoElectrico, String color) {
        this.precio = 1000;
        this.comprobarColor(color);
        this.comprobarConsumoElectrico(consumoElectrico);
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(String consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nTipo de Consumo Electrico: " + consumoElectrico + "\tColor: " + color +  "\nPeso: " + peso + "\tPrecio: " + precio;
    }
    
    private void comprobarConsumoElectrico(String letra) {
        switch (letra) {
            case "a":
            case "b":
            case "c":
            case "d":
            case "e":
                this.consumoElectrico = letra.toUpperCase();
                break;
            default:
                this.consumoElectrico = "F";
                break;
        }

    }
    
    private void comprobarColor(String color){
        this.setColor(Color.BLANCO);
        for (Color c : Color.values()) {

            if(c.name().equalsIgnoreCase(color)){
                this.setColor(c);
                break;
            }
        }
    }
    
    public void precioFinal(){
        switch(this.consumoElectrico){
            case "A":
                this.precio += 1000;
                break;
            case "B":
                this.precio += 800;
                break;
            case "C":
                this.precio += 600;
                break;
            case "D":
                this.precio += 500;
                break;
            case "E":
                this.precio += 300;
                break;
            case "F":
                this.precio += 100;
                break;
        }
        
        if(this.getPeso() >=1 && this.getPeso() <=19){
            this.precio +=  100;
        }else if(this.getPeso() >=20 && this.getPeso() <=49){
            this.precio += 500;
        }else if(this.getPeso() >=50 && this.getPeso() <=79){
            this.precio += 800;
        }else if(this.getPeso() >=81){
            this.precio += 1000;
        }
        
    }
   
}
