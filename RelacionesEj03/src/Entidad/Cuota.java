/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Carlitos
 */
public class Cuota implements Comparable<Cuota>{
    private int numero;
    private float monto;
    private boolean pagada;
    private LocalDate vence;
    private String forma;

    public Cuota() {
        this.pagada = false;
    }

    public Cuota(int numero, float monto, boolean pagada, LocalDate vence, String forma) {
        this.numero = numero;
        this.monto = monto;
        this.pagada = pagada;
        this.vence = vence;
        this.forma = forma;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public boolean getPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getVence() {
        return vence;
    }

    public void setVence(LocalDate vence) {
        this.vence = vence;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "--------------------------------------------" + "\n| Cantidad de cuotas: " + numero + "| Vence: " + vence + "| Forma de pago: " + forma + "\n| Monto: " + monto + "| Estado:" +( pagada ? " PAGADA ":" NO PAGADA ") + "\n--------------------------------------------" + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.numero);
        hash = 53 * hash + Objects.hashCode(this.monto);
        hash = 53 * hash + Objects.hashCode(this.pagada);
        hash = 53 * hash + Objects.hashCode(this.vence);
        hash = 53 * hash + Objects.hashCode(this.forma);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuota other = (Cuota) obj;
        if (!Objects.equals(this.forma, other.forma)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.monto, other.monto)) {
            return false;
        }
        if (!Objects.equals(this.pagada, other.pagada)) {
            return false;
        }
        if (!Objects.equals(this.vence, other.vence)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Cuota t) {
        return t.getNumero() - this.getNumero();
    }

    
}
