
package entidades;

public class Juego {
 private String[] palabra;
 private int canLetrasEnc;
 private int erroresMax;
 private int intentos;

 public Juego(String[] palabra) {
        this.palabra = palabra;
        this.canLetrasEnc = 0;
        this.erroresMax = 10;
        this.intentos = 0;
    }

    public void setCanLetrasEnc(int canLetrasEnc) {
        this.canLetrasEnc = canLetrasEnc;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getCanLetrasEnc() {
        return canLetrasEnc;
    }

    public int getErroresMax() {
        return erroresMax;
    }

    public int getIntentos() {
        return intentos;
    }
    
    public int intentosRestantes(){
        int intRest = this.erroresMax - this.intentos;
        if(intRest == 0){
            System.out.println("Perdistessss");
        }
        return intRest;
    }
    
    public boolean esGanador(){
        if(this.palabra.length == this.canLetrasEnc){
          System.out.println("Felicitaciones! GANASTE");
            return true;
        }else{
            return false;
        }
    }
    
    public boolean contieneLetra(String letra){
        for (int i = 0; i < this.palabra.length; i++) {
            if(this.palabra[i].equalsIgnoreCase(letra)){
                this.canLetrasEnc++;
                return true;
            }
         
        }
        this.intentos++;
        return false;
    }

}
