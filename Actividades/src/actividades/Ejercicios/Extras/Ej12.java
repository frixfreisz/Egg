
package actividades.Ejercicios.Extras;

public class Ej12 {

    public static void main(String[] args) {
        
     for (int u = 0; u <= 9; u++) { 
            for (int d = 0; d <= 9; d++) {
                for (int c = 0; c <= 9; c++) {
                   if(u == 3){
                       char letra = 'E';
                       
                   } 
                    System.out.print(u != 3 ? u : "E");
                    System.out.print(d != 3 ? d : "E");
                    System.out.print(c != 3 ? c : "E");
                    System.out.println("");
                }
            }
        }
    }
}