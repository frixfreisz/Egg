package ejerciciospoo;


import Cadenas.Cadena;
import Matetaica.Circunsferencia;
import Matetaica.Operacion;
import Matetaica.Rectangulo;
import Persona.Persona;
import Persona.ServicioPersona;
import Reales.Cafetera;
import Reales.Cuenta;
import java.util.Scanner;
import libreria.Libros;

public class EjerciciosPoo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

// //EJERCICIO 1
//       Libros libro1 = new Libros();
//       libro1.cargarLibro(leer);
//       libro1.imprimirLibro();
//       
//       Libros libro2 = Libros.cargarLibroEstatico(leer);//con el static
//       libro2.imprimirLibro();//con el static
//       
//EJERCICIO 2
//       Circunsferencia circunsferencia = Circunsferencia.crearCircunsferencia(leer);
//        System.out.println(circunsferencia.toString());

//
 //EJERCICIO 3 
//Operacion operacion = Operacion.crearOperacion(leer);
//        System.out.println("La suma es: " + operacion.Suma());
//        System.out.println("La resta es: " + operacion.Resta());
//        System.out.println(operacion.Multiplicar());
//        System.out.println(operacion.Dividir());
       
//EJERCICIO 4
//Rectangulo rectangulo = Rectangulo.crearRectangulo(leer);
//        System.out.println("La superficio del rectangulo es: " + rectangulo.getSuperficie());
//        System.out.println("El preimetro del rectangulo es: " + rectangulo.getPerimetro());
//        rectangulo.dibujarRectangulo();
//
// EJERCICIO 5
//        Cuenta cuenta = Cuenta.crearCuenta(leer);
//
//        String salir = "";
//
//        while (!salir.equals("s")) {
//            System.out.println("1 Ingresar");
//            System.out.println("2 Retirar");
//            System.out.println("3 Extraer");
//            System.out.println("4 Consultar saldo");
//            System.out.println("5 Consultar datos");
//            System.out.println("6 Salir");
//            int op = leer.nextInt();
//            leer.nextLine();
//
//            switch (op) {
//                case 1:
//                    cuenta.Ingreso(leer);
//                    break;
//                case 2:
//                    cuenta.Egreso(leer);
//                    break;
//                case 3:
//                    cuenta.Extraccion(leer);
//                    break;
//                case 4:
//                    cuenta.consultarSaldo();
//                    break;
//                case 5:
//                    cuenta.consultarDatos();
//                    break;
//                default:
//                    System.out.println("Seguro que desea salir?");
//                    salir = leer.nextLine();
//                    
//
//            }
//        }
//        System.out.println("Hasta la proxima amiguitos");

// EJERCICIO 6
//Cafetera cafetera = new Cafetera();
//cafetera.llenarCafetera(leer);
//        System.out.println(cafetera.getCantidadActual());
//cafetera.servirTaza(leer);
//cafetera.agregarCafe(leer);
//cafetera.vaciarCafetera();        
//
// EJERCICIO 7
//
//ServicioPersona servicio = new ServicioPersona(3);
//        for (int i = 0; i < 3; i++) {
//            servicio.crearPersona(leer);
//            servicio.getCalcularIMC(i);
//            servicio.esMayorDeEdad(i);
//            
//            
//        }
//servicio.contadores();
//
// EJERCICIO 8

Cadena cadena = new Cadena();
        System.out.println("Ingrese la frase:");
String frase = leer.nextLine();
cadena.setFrase(frase);
int[] vocales = cadena.mostrarVocales();
int cantVocales = 0;
        for (int i = 0; i < vocales.length; i++) {
            cantVocales += vocales[i];
            
        }
        System.out.println("La frase contiene " + cantVocales + " vocales");
        System.out.println(" a: " + vocales[0]);
        System.out.println(" e: " + vocales[1]);
        System.out.println(" i: " + vocales[2]);
        System.out.println(" o: " + vocales[3]);
        System.out.println(" u: " + vocales[4]);
        
        System.out.println("La frase invertida es: " + cadena.invertirFrase());
        System.out.println("Elija un caracter a  buscar: ");
        String caracter = leer.nextLine();
        System.out.println("El caracter se repite: " + cadena.vesesRepetido(caracter.charAt(0)));
        System.out.println("Ingrese una nueva frase para comparar su longitud");
        String newFrase = leer.nextLine();
        int resultado = cadena.compararLongitud(newFrase.length());
        if(resultado < 0){
            System.out.println("La nueva frase es mas larga");
            
        }else if(resultado == 0){
            System.out.println("Las frases son iguales de largas");
        }else{
            System.out.println("La frase original es mas larga");
        }
        
        System.out.println("La nueva frase es: " + cadena.unirFrase(newFrase));
        System.out.println("Ingrese la letra a reemplazar:");
        String newLetra = leer.nextLine();
        System.out.println("La frase quedpo de la siguiente manera:" + cadena.reemplazarFrase(newLetra.charAt(0)));
        boolean contiene = cadena.contieneLetra(newLetra.charAt(0));
        if(contiene == true){
            System.out.println("La frase contiene la letra " + newLetra);
        }else{
            System.out.println("La frase no contiene la letra " + newLetra);
        }
                
        System.out.println("");
        
        
   }

}
 



