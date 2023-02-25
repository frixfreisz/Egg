/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author Carlitos
 */
public abstract class Animal {
    private int edad;
    public String varPublica;
    protected String varProtected;
    private String varPrivate;

    public Animal() {
        this.edad = 100;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
}
