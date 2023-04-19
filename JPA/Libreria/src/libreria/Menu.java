/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;
import libreria.persistencia.DAO;
import libreria.persistencia.LibroDAO;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;

/**
 *
 * @author Carlitox
 */
public class Menu {

    private Scanner leer = new Scanner(System.in);
    DAO dao = new DAO();
    LibroServicio ls = new LibroServicio();
    AutorServicio as = new AutorServicio();
    EditorialServicio es = new EditorialServicio();
    LibroDAO ldao = new LibroDAO();
    PrestamoServicio ps = new PrestamoServicio();

    public void menu() {
        
        System.out.println("---------------------LIBRERIA---------------------");
        System.out.println("");
        System.out.println("1 - Registrar nuevo libro");
        System.out.println("2 - Editar Libro");
        System.out.println("3 - Editar Autor");
        System.out.println("4 - Editar Editorial");
        System.out.println("5 - Dar de baja a libro o autor");
        System.out.println("6 - Litado de libros");
        System.out.println("7 - Buscar autor por nombre:");
        System.out.println("8 - Buscar libro por ISBN");
        System.out.println("9 - Buscar libro por titulo");
        System.out.println("10 - Buscar libro por nombre de autor");
        System.out.println("11 - Buscar libro por nombre de editorial");
        System.out.println("12 - Ingresar Stock");
        System.out.println("13-Prestamo");
        System.out.println("14-Devolucion");
        System.out.println("15 - Salir");
        System.out.println("");
        System.out.println("Ingrese una opcion");
        int op = leer.nextInt();
        switch (op) {
            case 1:
                ls.crearLibro();
                this.menu();
                break;
            case 2:
                ls.editarLibro();
                this.menu();
                break;
            case 3:
                as.editarAutor();
                this.menu();
                break;
            case 4:
                es.editarEditorial();
                this.menu();
                break;
            case 5:
                ls.DarDeBajaLibro();
                this.menu();
                break;
            case 6:
                ldao.listarLibos();
                this.menu();
                break;
            case 7:
                as.buscarAutorNombre();
                this.menu();
                break;
            case 8:
                ls.buscarLibroPorISBN();
                this.menu();
                break;
            case 9:
                ls.imprimirLibroPorNombre();
                this.menu();
                break;
            case 10:
                ls.buscarLibroPorAutor();
                this.menu();
                break;
            case 11:
                ls.buscarLibroPorEditorial();
                this.menu();
                break;
            case 12:
                ls.agregarStock();
                this.menu();
                break;
            case 13:
                ps.prestamo();
                this.menu();
                break;
            case 14:
                ps.devolucion();
                this.menu();
                break;
            case 15:
                System.out.println("Fin");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                this.menu();
                break;
        }
        
        
        

    }

    public void limpiarPantalla() throws AWTException {
//        //metodo para ir borrando consola.. video:https://www.youtube.com/watch?v=dKYhbm4o354
        Robot pressbot = new Robot();

        pressbot.setAutoDelay(30);//tiempo de espara antes de borrar
        pressbot.keyPress(17);//orden para apretar ctrl key
        pressbot.keyPress(76);//orden para apretar L key
        pressbot.keyRelease(17);//orden para soltar ctrl key
        pressbot.keyRelease(76);//orden para soltar L key

    }
}
