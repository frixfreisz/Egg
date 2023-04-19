/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.persistencia.ClienteDAO;
import libreria.persistencia.DAO;

/**
 *
 * @author Carlitox
 */
public class ClienteServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DAO dao = new DAO();
    ClienteDAO cdao = new ClienteDAO();

    public Cliente buscarClienteNombre(String nombre) {
        List<Cliente> clientes = cdao.buscarClienteNombre(nombre);

        return clientes.size() == 0 ? null : clientes.get(0);

    }
    
    public Cliente buscarOCrearCliente(){
        System.out.println("El cliente existe? - S/N");
        String resp = leer.next();
        if(resp.equalsIgnoreCase("S")){
            System.out.println("Ingrese el DNI del cliente");
            long dni = leer.nextLong();
            Cliente c = this.buscarClientePorDNI(dni);
            if(c!=null){
                return c;
            }
            System.out.println("No se encontro un cliente con ese dni. Desea crearlo? - S/N");
            String resp2 = leer.next();
            if(resp2.equalsIgnoreCase("N")){
                return null;
            }
            
        }
        return this.crearCliente();
    }

    public Cliente buscarClientePorDNI(Long documento) {
        Cliente clientes = cdao.buscarClientePorDNI(documento);

        return clientes;

    }

    public Cliente crearCliente() {
        System.out.println("Ingrese el dni del Cliente");
        Long documento = leer.nextLong();

        Cliente c = cdao.buscarClientePorDNI(documento);
        if (c == null) {
            c = new Cliente();
            c.setDocumento(documento);
            System.out.print("Ingrese primer y segurndo nombre: ");
            c.setNombre(leer.next());
            System.out.print("Ingrese Apellidos: ");
            c.setApellido(leer.next());
            System.out.print("Ingrese el numero de telefono: ");
            c.setTelefono(leer.next());

            dao.insertarCliente(c);

        } else {
            System.out.println("El cliente ya existe en la base de datos");
        }
        return c;
    }

    public void editarCliente() {
        System.out.println("Ingrese el nombre del Cliente");
        String nombre = leer.next();

        Cliente c = this.buscarClienteNombre(nombre);
        if (c == null) {
            System.out.println("El cliente no existe en la base de datos");
            return;

        }
        System.out.println("Desea modificar el Cliente: " + c.getNombre() + "? S/N:");
        String respCliente = leer.next();
        if (respCliente.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el Nombre");
            String newCliente = leer.next();
            c.setNombre(newCliente);
            dao.actualizarCliente(c);
        }
    }

    public void eliminarCliente() {
        System.out.println("Ingrese el Id del cliente a eliminar");
        Long documento = leer.nextLong();

        Cliente c = this.buscarClientePorDNI(documento);
        if (c == null) {
            System.out.println("El cliente no existe en la base de datos");
            return;
        }
        dao.eliminarCliente(c);

    }

    public void buscarClienteNombre() {
        System.out.println("Ingrese el nombre del cliente");
        String nombre = leer.next();
        List<Cliente> clientes = cdao.buscarClienteNombre(nombre);
        if (clientes.size() == 0) {
            System.out.println("El cliente no existe en la base de datos");
            return;
        } else {

            for (Cliente cliente : clientes) {
                System.out.println("ID - " + cliente.getId() + "\tCliente: " + cliente.getNombre());

            }
        }
    }
    
    
}
