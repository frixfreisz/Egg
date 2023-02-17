
package actividades.Ejercicios.Extras;

import java.util.Scanner;

public class Ej23 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    String [][] matriz = new String [20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j]="*";
            }
            
        }
    int cant =0;
        while (cant<10){
            System.out.print("Ingresa uan palabra de 3 a 5 caracteres: ");
            String palabra=leer.nextLine();
            if(palabra.length()<6 && palabra.length()>2){
                
                cant++;
                insertarMatriz(matriz,palabra);
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(matriz[i][j].equals("*")){
                    matriz[i][j]=String.valueOf((int)(Math.random()*10));
                }
                System.out.print(matriz[i][j]+" ");    
                 }
                System.out.println("");    
            }
        
    }
    
    public static void insertarMatriz(String [][] matriz, String palabra){
        int fila, columna;
        boolean ocupado=false;    
            do{           
            fila= (int) (Math.random()*19);
            columna=  (int) (Math.random()*(19- palabra.length()));
                for (int i = columna; i <= columna + palabra.length(); i++) {
                    if(matriz[fila][i].equals("*")){
                        ocupado=false;
                        continue;
                    }
                    else{
                        ocupado=true;
                        break;
                    }
                    } 
                
                if (ocupado==false){
                    int pos=0;
                    for (int i = columna; i <(columna + palabra.length()); i++) {
                        matriz[fila][i]=palabra.substring(pos,pos+1 );
                        
                        pos+=1;                       
                    }                             
                }
            
             }while(ocupado==true) ; 
    }
    
}
