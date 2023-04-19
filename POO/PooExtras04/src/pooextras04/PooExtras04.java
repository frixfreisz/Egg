
package pooextras04;

import NIF.NIF;
import ServicioNIF.ServicioNIF;

public class PooExtras04 {

    public static void main(String[] args) {
        // TODO code application logic here
        ServicioNIF serv = new ServicioNIF();
        NIF n = serv.crearNIF();
        serv.mostrar(n);
        
    }

}
