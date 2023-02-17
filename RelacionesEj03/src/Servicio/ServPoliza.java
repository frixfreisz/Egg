/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cliente;
import Entidad.Cuota;
import Entidad.Poliza;
import Entidad.Vehiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class ServPoliza {

    Scanner leer;
    private ArrayList<Poliza> poliza;
    private int polizaId;
    private float cuotaBase;
    private float gtosAdmin;
    private int gtosGranizo;
    private ServiVehiculo sVehiculo;
    private ServCliente sCliente;
    

    public ServPoliza() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.poliza = new ArrayList();
        this.polizaId = 0;
        this.cuotaBase = 2000;
        this.gtosAdmin = 500;
        this.gtosGranizo = 1000;
        this.sCliente = new ServCliente();
        this.sVehiculo = new ServiVehiculo();
        
    }

    public Poliza crearPoliza() {
        
        this.polizaId++;
        System.out.println("-----Creando Poliza Nº " + this.polizaId + "-------" );
        System.out.print("Ingrese la cantidad de meses que desea poseer la poliza: ");
        int meses = leer.nextInt();
        System.out.println("Desea cobertura por granizo?");
        String granizo = leer.next();
        System.out.println("Forma de pago?");
        String forPag = leer.next();
        System.out.println("Calculando monto de poliza...");
        float monto = meses * this.cuotaBase;
        if(granizo.equalsIgnoreCase("si")){
            monto += meses * this.gtosGranizo;
        }
        
        monto += this.gtosAdmin;
        ServCuota sc = new ServCuota();
        ArrayList<Cuota> plan = sc.generarPlan(meses, monto, forPag);
        
        
        System.out.println("El monto de la poliza es $ " + monto);
        sc.mostrarPlan();
        System.out.println("");
        System.out.println("Desea continuar?");
        if(leer.next().equalsIgnoreCase("si")){
            System.out.println("A continuacion cargaremos el cliente...");
            
            Cliente buscarCliente = this.sCliente.buscarCliente();
            if(buscarCliente == null ){
                
                buscarCliente = this.sCliente.crearCliente();
                
                               
            }else{
                System.out.println("El cliente ya se encuentra registrado\n" + buscarCliente);
            }
            
            System.out.println("A continuacion cargaremos los datos del auto...");
            
            Vehiculo buscarVehiculo = this.sVehiculo.buscarVehiculo();
            if(buscarVehiculo == null){
                buscarVehiculo = this.sVehiculo.cargarVehiculo();
            }
            
            LocalDate fechaInicio = LocalDate.now();
            LocalDate fechaFin = fechaInicio.plusMonths(meses);
            
            System.out.println("Los datos se cargaron con exito");
            System.out.println("Crearemos la poliza entre la fecha: " + fechaInicio + " y " + fechaFin);
            Poliza p = new Poliza();
            
            p.setNumero(this.polizaId);
            p.setFormaPago(forPag);
            p.setFechaInicio(fechaInicio);
            p.setFechaFin(fechaFin);
            p.setCantidadCuotas(meses);
            p.setGranizo(granizo.equalsIgnoreCase("si"));
            p.setMontoGranizo(this.gtosGranizo);
            p.setCliente(buscarCliente);
            p.setVehiculo(buscarVehiculo);
            p.setPlan(plan);
            p.setTipoCobertura(granizo.equalsIgnoreCase("si")? "TOTAL":"PARCIAL");
            this.poliza.add(p);
            return p;
        }
        return null;
    }
    
    public void eliminarPoliza() {
        Poliza poli = buscarPoliza();
      if(poli!=null){
          poliza.remove(poli);
          System.out.println("El cliete ha sido borrado de la lista con exito!");
      }else{
          System.out.println("El cliente no se encuentra en la lista");
      }
      
      mostrarPoliza();

    }

    public Poliza buscarPoliza(){
    System.out.print("Ingrese el numero de poliza que quiere buscar: ");
        Long resp = leer.nextLong();
        for (Poliza buscar : poliza) {
            if(resp.equals(buscar.getNumero()))
                return buscar;
            
        }
        return null;
        
    }
    public void menuPoliza() {
        int op = 0;
        ServCliente servCliente = new ServCliente();
        ServiVehiculo servVeh = new ServiVehiculo(); 
        do{
        System.out.println("---------SEGUROS LA TERCERA---------");
        System.out.println("");
        System.out.println("Que operacion desea realizar");
        System.out.println("1 - Ver Polizas");
        System.out.println("2 - Crear polizas");
        System.out.println("3 - Menu Cliente");
        System.out.println("4 - Menu Vehiculo");
        System.out.println("5 - Ver Poliza");
        System.out.println("6 - Sailr");
        op = leer.nextInt();
        
        switch(op){
            case 1:
               this.mostrarPoliza();
               break;
            case 2:
                this.crearPoliza();
                break;
            case 3:
                servCliente.menuCliente();
                break;
            case 4:
                servVeh.menuVehiculo();
                break;
            case 5:
                buscarPoliza();
                break;
            case 6:
                break;
               
        }
        }while(op!=6);
        System.out.println("Hasta la proxima...");

    }

    public void mostrarPoliza() {
        for (Poliza poliza1 : poliza) {
            System.out.println(poliza1);

        }

    }

}
