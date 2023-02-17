package Cuenta;

import java.util.Scanner;

public class ServicioCuenta {
private Cuenta cuenta;

    public void crearCuenta(Scanner leer) {
        System.out.println("Ingrese su numero de Cta.");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI.");
        long dni = leer.nextLong();
        int saldoActual = 0;
        this.cuenta = new Cuenta(numCuenta, dni, saldoActual);

    }
/**
 * Ingreso de efectivo a la cuenta
 * @param leer 
 */
    public void Ingreso(Scanner leer) {
        System.out.println("Cuanto dinero desea depositar? ");
        int ingreso = leer.nextInt();
        //this.cuenta.setSaldoActual(this.cuenta.getSaldoActual() + ingreso);
        this.cuenta.agregarSaldo(ingreso);
    }
/**
 * Retiro de efectivo. Si retira mas del Saldo actual la cuenta se queda en 0
 * @param leer 
 */
    public void retirar(Scanner leer) {
        System.out.println("Cuanto dinero desea retirar?");
        int retirar = leer.nextInt();
        if (retirar > this.cuenta.getSaldoActual()) {
            System.out.println("Su saldo es inferior a lo que queria retirar");
            this.cuenta.setSaldoActual(0);
           
        } else {
            System.out.println("Ok. usted retiro " + retirar);
            int resultado =  this.cuenta.getSaldoActual() - retirar;
            this.cuenta.setSaldoActual(resultado);
            System.out.println("Saldo atual: " + this.cuenta.getSaldoActual());
            
        }
        
    }
    /**
     * Extraer efectivo. No se puede extraer mas del 20% del saldoActual
     * @param leer 
     */
public void extraer(Scanner leer){
        System.out.println("Cuanto desea extraer?");
        int extraer = leer.nextInt();
        if(extraer > this.cuenta.getSaldoActual() * 20 /100){
            System.out.println("El monto solicitado supera el limite de extraccion diario");
            
        }else{
            System.out.println("Ok, usted hizo una extraccion de " + extraer);
            int resultado = this.cuenta.getSaldoActual() - extraer;
            this.cuenta.setSaldoActual(resultado);
            System.out.println("Saldo atual: " + this.cuenta.getSaldoActual());
        }
    }
    
    public void consultarSaldo(){
    System.out.println("Su saldo es: " + this.cuenta.getSaldoActual());
}
    public void consultarDatos(){
    System.out.println("Numero de cuenta: " + this.cuenta.getNumCuenta());
    System.out.println("DNI: " + this.cuenta.getDni());
    System.out.println("Saldo Actual: " + this.cuenta.getSaldoActual());
}

}   
