
package sumarvector;

public class SumarVector {

    public static void main(String[] args) {
        
        int [][] mat = new int[5][5];
        int[] diag1 = new int[mat.length];
        int[] diag2 = new int[mat.length];
        int dato = 1;
         
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = dato;
                dato++;
                
            }
            
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("\t" + mat[i][j]);
                
                
            }
            System.out.println("");
            
        }
        
        //sacar diagonales
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                //guarda diagonal 1
                if(i==j){
                    diag1[i] = mat[i][j];
                }
                //guarda diagonal 2
                if((i+j) == mat.length-1){
                    diag2[i] = mat[i][j];
                }
            }
            System.out.println("");
            
        }
        //muestra diagonal 1
        int suma = 0; 
        System.out.println("Esta es la diagonal 1: ");
        for (int numeros :diag1) {
            System.out.print("\t" + numeros);
            suma += numeros;
            
            
        }
        //mostrar suma de diagonal 1
        System.out.println(" = " + suma);
        
        // muestra diagonal 2
        System.out.println("");
        suma = 0;
        System.out.println("Esta es la diagonal 2: ");
        for (int numeros : diag2) {
            System.out.print("\t" + numeros );
            suma += numeros;
            
        }
        //mostrar suma de diagonale 2 
        System.out.println(" = " + suma);
        
        
        System.out.println("");
          
            
        
    }
    
}
