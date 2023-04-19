/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Carlitos
 */
public class Poliza {
    private Scanner leer;
    
    private Vehiculo vehiculo;
    private Cliente cliente;
    private ArrayList<Cuota> plan;
    
    private int numero;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String formaPago;
    private int cantidadCuotas;
    private boolean granizo;
    private int montoGranizo;
    private String tipoCobertura;

    public Poliza() {
    }

    public Poliza(Scanner leer, Vehiculo vehiculo, Cliente cliente, ArrayList<Cuota> plan, int numero, LocalDate fechaInicio, LocalDate fechaFin, String formaPago, int cantidadCuotas, boolean granizo, int montoGranizo, String tipoCobertura) {
        this.leer = leer;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.plan = plan;
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.formaPago = formaPago;
        this.cantidadCuotas = cantidadCuotas;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Cuota> getPlan() {
        return plan;
    }

    public void setPlan(ArrayList<Cuota> plan) {
        this.plan = plan;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(int montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "-------------------------------------------"+ 
               "\n| Cliente: " + cliente + "| Vehiculo: " + vehiculo + "| Plan de cuotas: " + plan + "|Poliza: " + "\n| Nº " + numero + "| Fecha de inicio: " + fechaInicio + "| Fecha de fin: " + fechaFin + "\n| Forma de Pago: " + formaPago + "| Cantidad de cuotas: " + cantidadCuotas + "| Cobertura contra granizo: " + granizo + "\n| Monto de cobretura contra granizo: " + montoGranizo + "| Tipo de Cobertura: " + tipoCobertura + "\n-------------------------------------------" + "\n";
    }

}
