/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooextra6.Entidades;

/**
 *
 * @author franc
 */
public class Ahorcado {
    //Atributos
    public char[] PalabraABuscar;
    public int LetrasEncontradas;
    public int JugadasMaximas;
    
    //Constructores

    public Ahorcado() {
    }

    public Ahorcado(char[] PalabraABuscar, int LetrasEncontradas, int JugadasMaximas) {
        this.PalabraABuscar = PalabraABuscar;
        this.LetrasEncontradas = LetrasEncontradas;
        this.JugadasMaximas = JugadasMaximas;
    }
    
    //Metodos

    public char[] getPalabraABuscar() {
        return PalabraABuscar;
    }

    public void setPalabraABuscar(char[] PalabraABuscar) {
        this.PalabraABuscar = PalabraABuscar;
    }

    public int getLetrasEncontradas() {
        return LetrasEncontradas;
    }

    public void setLetrasEncontradas(int LetrasEncontradas) {
        this.LetrasEncontradas = LetrasEncontradas;
    }

    public int getJugadasMaximas() {
        return JugadasMaximas;
    }

    public void setJugadasMaximas(int JugadasMaximas) {
        this.JugadasMaximas = JugadasMaximas;
    }
    
   
   
    
}
