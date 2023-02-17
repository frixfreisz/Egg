/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class ServiVehiculo {

    Scanner leer;
    private ArrayList<Vehiculo> lista;

    public ServiVehiculo() {
        this.leer = new Scanner(System.in);
        this.lista = new ArrayList();
    }

    public Vehiculo cargarVehiculo() {
        System.out.println("----------CARGA DE VEHICULO----------");
        System.out.println("");

        Vehiculo v = new Vehiculo();
        System.out.print("Marca: ");
        v.setMarca(leer.next());
        System.out.print("Modelo: ");
        v.setModelo(leer.next());
        System.out.print("Patente: ");
        v.setPatente(leer.next());
        System.out.print("Anio: ");
        v.setAnio(leer.nextInt());
        System.out.print("Motor: ");
        v.setNumMotor(leer.next());
        System.out.print("Chais: ");
        v.setNumchasis(leer.next());
        System.out.print("Color: ");
        v.setColor(leer.next());
        System.out.print("Tipo: ");
        v.setTipo(leer.next());

        lista.add(v);
        System.out.println("Vehiculo cargado con exito! ");
        
        return v;

    }

    public void modificarVehiculo() {
        System.out.println("-------------ACTUALIZAR DATOS DE VEHICULO---------------");
        Vehiculo v = buscarVehiculo();
        if (v == null) {
            System.out.println("El vehiculo no se encuentra en la lista");
            return;

        }
        int op = 0;

        System.out.println("Que dato desea modificar?");
        System.out.println("");
        System.out.println("1 - MARCA");
        System.out.println("2 - MODELO");
        System.out.println("3 - PATENTE");
        System.out.println("4 - ANIO");
        System.out.println("5 - NUMERO DE MOTOR");
        System.out.println("6 - CHASIS");
        System.out.println("7 - COLOR");
        System.out.println("8 - TIPO");
        System.out.println("9 - SALIR");

        op = leer.nextInt();

        switch (op) {
            case 1:
                System.out.println("Ingrese nuevamente la marca: ");
                v.setMarca(leer.next());
                break;
            case 2:
                System.out.println("Ingrese nuevamente el modelo: ");
                v.setModelo(leer.next());
                break;
            case 3:
                System.out.println("Ingrese nuevamente la patente: ");
                v.setPatente(leer.next());
                break;
            case 4:
                System.out.println("Ingrese nuevamente el Anio: ");
                v.setAnio(leer.nextInt());
                break;
            case 5:
                System.out.println("Ingrese nuevamente el numerio de motor: ");
                v.setNumMotor(leer.next());
                break;
            case 6:
                System.out.println("Ingrese nuevamente el numero de chasis: ");
                v.setNumchasis(leer.next());
                break;
            case 7:
                System.out.println("Ingrese nuevamente el color: ");
                v.setColor(leer.next());
                break;
            case 8:
                System.out.println("Ingrese nuevamente el tipo de vehiculo: ");
                v.setTipo(leer.next());
                break;

        }

        System.out.println(v.toString());

    }

    public void eliminarVehiculo() {
        System.out.println("---------ELIMINAR DATOS DE VEHICULO---------");
        Vehiculo v = buscarVehiculo();
        if (v != null) {
            lista.remove(v);
            System.out.println("El cliete ha sido borrado de la lista con exito!");
        } else {
            System.out.println("El cliente no se encuentra en la lista");
        }

        mostrarVehiculo();
    }

    public Vehiculo buscarVehiculo() {
        System.out.println("----------GESTION DE VEHICULOS-----------");
        System.out.println("");
        System.out.print("Ingrese la patente del vehiculo");
        String resp = leer.next();
        for (Vehiculo buscar : lista) {
            if (resp.equals(buscar.getPatente())) {
                return buscar;
            }

        }
        return null;

    }

    public void menuVehiculo() {

        int op = 0;
        do {
            System.out.println("          Menu VEHICULO");
            System.out.println("----------------------------------");
            System.out.println("Que desea hacer");
            System.out.println("");
            System.out.println("1 - CARGAR VEHICULO");
            System.out.println("2 - MODIFICAR DATOS");
            System.out.println("3 - ELIMINAR VEHICULO");
            System.out.println("4 - MOSTRAR LISTA");
            System.out.println("5 - SALIR");

            op = leer.nextInt();

            switch (op) {
                case 1:
                    cargarVehiculo();
                    break;
                case 2:
                    modificarVehiculo();
                    break;
                case 3:
                    eliminarVehiculo();
                    break;
                case 4:
                    mostrarVehiculo();
                    break;
                case 5:

                    break;

            }

        } while (op != 5);

    }

    public void mostrarVehiculo() {
        System.out.println("----------LISTA DE VEHICULOS ----------");
        System.out.println("");
        for (Vehiculo vehiculo : lista) {
            System.out.println(vehiculo);

        }
    }

}
