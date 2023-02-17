package servicios;

import entidades.Secreto;
import java.util.Scanner;

public class servicios {

    private Secreto sec;
    private int secreto;//para usar en varios metodos
    

    public servicios() {
        this.sec = new Secreto();
        this.secreto = -1;
    }

    public void secret() {
        this.secreto = (int) (Math.random() * 11);
        System.out.println("el mes secreto es: " + this.sec.getMeses()[secreto]);
        
    }
    public void adivinar(Scanner leer){
        boolean parar = false;
        do{
        System.out.println("adivine el mes");
        String adivinar = leer.nextLine();
        for (int i = 0; i < this.sec.getMeses().length; i++) {
            if (this.sec.getMeses()[this.secreto].equals(adivinar)){
                System.out.println("Acertaste");
                parar = true;
                break;
                
            } else {
                System.out.println("Mal, intanta nuevamente");
                break;
            }
        }
        }while(parar == false);
    }
}



     
