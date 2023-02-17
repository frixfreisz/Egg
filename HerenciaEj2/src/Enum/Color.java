/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Carlitos
 */
public enum Color {
    AZUL("azul"), ROJO("rojo"), BLANCO("blanco"), NEGRO("negro"), GRIS("gris");
    
    private String col;

    private Color() {
        this.col = "BLANCO";
    }

    private Color(String col) {
        this.col = col;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }
    
    
}
