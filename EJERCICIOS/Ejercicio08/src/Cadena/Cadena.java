
package Cadena;

public class Cadena {
     private String frase;
    private int longitud;

    public Cadena() {
        this.frase = "";
        this. longitud = 0;
        
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }
    
    public int[] mostrarVocales(){
        int [] vocales = new int[5];
        for (int i = 0; i < frase.length(); i++) {
            if(this.frase.toLowerCase().charAt(i)== 'a'){
                vocales[0]++;
            }else if(this.frase.toLowerCase().charAt(i)== 'e'){
                vocales[1]++;
            }else if(this.frase.toLowerCase().charAt(i)== 'i'){
                vocales[2]++;
            }else if(this.frase.toLowerCase().charAt(i)== 'o'){
                vocales[3]++;
            }else if(this.frase.toLowerCase().charAt(i)== 'u'){
                vocales[4]++;
            }
            
        }
        return vocales;
    }
    public String invertirFrase(){
        String invertida = "";
        for (int i = frase.length()-1; i >= 0; i--) {
            invertida += frase.charAt(i);
            
        }
        return invertida;
    }
    
    public int vesesRepetido(char letra){
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(this.frase.toLowerCase().charAt(i)== letra){
                contador++;
            }
        }
        return contador;
    }
    
    public int compararLongitud(int newLong){
        return longitud - newLong;
        
    }
    
    public String unirFrase(String frase){
        this.frase += frase;
        this.longitud = this.frase.length();
        return this.frase;
    }
    
    public String reemplazarFrase(char newLetra){
        String modificado = "";
        for (int i = 0; i < frase.length(); i++) {
            if(this.frase.toLowerCase().charAt(i)=='a'){
                modificado += newLetra;
            }else{
                modificado += this.frase.charAt(i);
            }
            
        }
        return modificado;
 
    }
    
    public boolean contieneLetra(char letra){
        boolean contiene = false;
        for (int i = 0; i < frase.length(); i++) {
            if(this.frase.toLowerCase().charAt(i)== letra){
                contiene = true;
                break;
            }
        }
        return contiene;
    }

}


