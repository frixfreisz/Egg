package Reales;

import java.util.Scanner;

public class Cuenta {
    
    private int numeroCuenta;
    private long dni;
    private int saldoActual;

    public Cuenta(){
      this.saldoActual =  0; 
    }
    
    public Cuenta(int numeroCuenta, long dni) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = 0;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }
    public static Cuenta crearCuenta(Scanner leer){
        System.out.println("**************************************");
        System.out.println("    Ingrese los datos del usuario");
        System.out.println("**************************************");
        System.out.println("Numero de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.println("DNI: ");
        long dni = leer.nextLong();
        Cuenta cta = new Cuenta(numeroCuenta,dni);
        return cta;
    }
    public void Ingreso(Scanner leer){
        System.out.println("Cuanto dinero desea depositar? ");
        int ingreso = leer.nextInt();
        this.saldoActual = this.saldoActual + ingreso;             
       
    }
    public void Egreso(Scanner leer){
        System.out.println("Cuanto dinero desea retirar? ");
        int egreso = leer.nextInt();
        if(this.saldoActual < egreso){
            this.saldoActual = 0;
        } else{
        this.saldoActual = this.saldoActual - egreso;
        }
    }
    public void Extraccion(Scanner leer){
        System.out.println("Cuanto dinero desea extraer");
        int extraccion = leer.nextInt();
        int permitido = this.saldoActual * 20 /100;
        if(extraccion > permitido){
            System.out.println("El monto solicitado supera el limite de extraccion diario");
        }else {
        this.saldoActual -= extraccion;  // es lo mismo
        }
    }
public void consultarSaldo(){
    System.out.println("Su saldo es: " + this.saldoActual);
}
public void consultarDatos(){
    System.out.println("Numero de cuenta: " + this.numeroCuenta);
    System.out.println("DNI: " + this.dni);
    System.out.println("Saldo Actual: " + this.saldoActual);
}
}
