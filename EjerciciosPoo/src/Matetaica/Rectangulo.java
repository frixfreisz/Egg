
package Matetaica;

import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }
    
    
    public static Rectangulo crearRectangulo(Scanner leer){
        System.out.println("ingrese el tamaño de la base: ");
        int base = leer.nextInt();
        System.out.println("ingrese el tamaño de la altura: ");
        int altura = leer.nextInt();
        
        Rectangulo rect = new Rectangulo(base, altura);
        return rect;
        
    }
    public int getSuperficie(){
        int superficie = this.base * this.altura;
        return superficie;
        
    }
    public int getPerimetro(){
        int perimetro = (this.base + this.altura)*2;
        return perimetro;
    }
    public void dibujarRectangulo(){
        for (int f = 0; f < this.altura; f++) {
            for (int c = 0; c < this.base; c++) {
                System.out.print(" * ");
                
            }
            System.out.println(" ");
        }
        
    }
}
