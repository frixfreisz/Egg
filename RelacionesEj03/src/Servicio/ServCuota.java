/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuota;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class ServCuota {

    private Scanner leer;
    private ArrayList<Cuota> cuotas;
    

    public ServCuota() {
        this.leer = new Scanner(System.in);
        this.cuotas = new ArrayList();

    }

    public ArrayList<Cuota> generarPlan(int cant, float valor, String pago) {
        System.out.println("----------PLAN DE CUOTAS----------");
        System.out.println("");



        float montoCuota = valor / cant;
        LocalDate hoy = LocalDate.now();
        for (int i = 1; i <= cant; i++) {

            Cuota cuota = new Cuota();
            cuota.setNumero(i);
            cuota.setMonto(montoCuota);
            cuota.setForma(pago);
            cuota.setVence(hoy.plusMonths(i));

            cuotas.add(cuota);
        }
        System.out.print("PLAN GENERADO CON EXITO");
        return cuotas;

    }

    public void mostrarPlan() {
        for (Cuota cuota : cuotas) {
            System.out.println(cuota);

        }
    }

    public void pagarCuota(int cuota) {
        cuotas.get(cuota).setPagada(true);
    }

}
