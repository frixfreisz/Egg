
package coleccionesej5;

import Servicio.ServPais;

public class MainPais {

    
    public static void main(String[] args) {
        
        ServPais serv = new ServPais();
        serv.cargarPaises();
        serv.mostrarPais();
        serv.buscarPais();
    }
    
}
