
package Fraccion;

public class Fraccion {
    private int num1;
    private int den1;
    private int num2;
    private int den2;

    public Fraccion() {
    }

    public Fraccion(int num1, int den1, int num2, int den2) {
        this.num1 = num1;
        this.den1 = den1;
        this.num2 = num2;
        this.den2 = den2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getDen1() {
        return den1;
    }

    public void setDen1(int den1) {
        this.den1 = den1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getDen2() {
        return den2;
    }

    public void setDen2(int den2) {
        this.den2 = den2;
    }
}
