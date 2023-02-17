package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

public class Servicios {
    private Operacion op;

    public Servicios() {
        this.op = new Operacion();
    }
    
    public void cargarNumero(Scanner leer){
        System.out.print("Ingresa el primer numero: ");
        this.op.setN1(leer.nextInt());
        System.out.print("Ingresa el segundo numero: ");
        this.op.setN2(leer.nextInt());
    }
    
    public int suma(){
        return this.op.getN1()+this.op.getN2();
    }
    public int resta(){
        return this.op.getN1()-this.op.getN2();
    }
    public int multiplicacion(){
        return this.op.getN1()*this.op.getN2();
    }
    
    
}
