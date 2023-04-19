
package actividades.Ejercicios;

public class Ej21 {

    public static void main(String[] args) {
       
        int [][] m = {
            {1,5,6,8,3,65,12,5,5,6,3},                   
            {12,5,6,8,52,44,5,52,5,2},
            {1,5,6,8,3,65,12,5,5,6,3},
            {12,5,6,8,52,44,5,52,5,2},
            {1,5,6,8,3,65,12,5,5,6,3},
            {12,5,6,8,52,44,5,52,5,2},
            {1,5,6,8,3,65,12,5,5,6,3},
            {12,5,6,8,52,44,5,52,5,2},
            {1,5,6,8,3,65,12,5,5,6,3},
            {12,5,6,8,52,44,5,52,5,2},
        };
                
        int [][] p = {{1,5,6},{12,5,6},{1,5,6}};
        
        
        boolean bandera = true;
        for (int fm = 0; fm < m.length; fm++) {
            for (int cm = 0; cm < m.length; cm++) {
                if(Ej21.contieneSub(m, p, fm, cm)){
                    break;
                }
            }
            if(bandera == true){
                break;
            }
        }
        if(bandera == true){
            System.out.print("Si lo contiene");
        }else{
            System.out.println("no lo contiene");
        }
        
    
    }
     public static boolean contieneSub(int[][] matriz, int[][] subMatriz, int fila, int columna){
        for (int fp = 0; fp < subMatriz.length; fp++) {
            for (int cp = 0; cp < subMatriz.length; cp++) {
                if(subMatriz[fp][cp] != matriz[fila + fp][columna + cp]){
                    return false;
                }
                        
            }

        }
        return true;

         
    }
}

