
package Cuenta;

public class Cuenta {
    private int numCuenta;
    private long dni;
    private int saldoActual;

    public Cuenta(int numCuenta, long dni, int saldoActual) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldoActual = 0;
    }

    public Cuenta() {
        this.saldoActual = 0;
        
    }
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
public void agregarSaldo(int cantidad){
    this.saldoActual += cantidad;
}    
}
