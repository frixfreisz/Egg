
package Cafetera;

import java.util.Scanner;

public class servicioCafetera {
    private Cafetera cafetera;
    
    public servicioCafetera(){
        this.cafetera = new Cafetera();    
    }
    /**
     * Llena la cafetera hasta 2.5 lts
     */
    public void llenarCafetera() {
       this.cafetera.setCantActual(this.cafetera.getCapaMaxima());
        
    }
    public void estadoDeCafetera(){
        System.out.println("La cafetera contiene " + this.cafetera.getCantActual() + "ml de cafe");
    }
    
    public void llenarTaza(Scanner leer){
        int taza;
        boolean out = false;
        
            System.out.println("Elija la taza que quiere llenar");
            System.out.println("1 - Taza pequeña (150 ml)");
            System.out.println("2 - Taza mediana (240 ml)");
            System.out.println("3 - Taza grande (500 ml)");
            System.out.println("4 - Salir");
            taza = leer.nextInt();
            
            switch(taza){
                case 1:
                    if(this.cafetera.getTAZA_PEQUEÑA() >= this.cafetera.getCantActual()){
                        System.out.println("La cafetera ha quedado vacia. Se cargaron " + this.cafetera.getCantActual() + "ml de cafe");
                        this.cafetera.setCantActual(0);
                    }else{
                        System.out.println("Usteda ha elegido una taza pequeña");
                        this.cafetera.setCantActual(this.cafetera.getCantActual() - this.cafetera.getTAZA_PEQUEÑA());
                    }
                    break;
                case 2:
                    if(this.cafetera.getTAZA_MEDIANA() >= this.cafetera.getCantActual()){
                        System.out.println("La cafetera ha quedado vacia. se cargaron " + this.cafetera.getCantActual() + "ml de cafe");
                        this.cafetera.setCantActual(0);
                    }else{
                        System.out.println("Usteda ha elegido una taza mediana");
                        this.cafetera.setCantActual(this.cafetera.getCantActual() - this.cafetera.getTAZA_MEDIANA());
                    }
                    break;
                case 3:
                    if(this.cafetera.getTAZA_GRANDE() >= this.cafetera.getCantActual()){
                        System.out.println("La cafetera ha quedado vacia. Se cargaron " + this.cafetera.getCantActual() + "ml de cafe");
                        this.cafetera.setCantActual(0);
                    }else{
                        System.out.println("Usteda ha elegido una taza grande");
                        this.cafetera.setCantActual(this.cafetera.getCantActual() - this.cafetera.getTAZA_GRANDE());
                    }
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
           
        
    }
    
    public void vaciarCafetera(){
        this.cafetera.setCantActual(0);
    }
    public void agregarCafe(Scanner leer){
        System.out.println("Cuantos ml desea agregar?");
        double agregar = leer.nextDouble();
        if(this.cafetera.getCantActual() + agregar > this.cafetera.getCapaMaxima()){
            System.out.println("La cafetera ya se lleno");
            this.cafetera.setCantActual(this.cafetera.getCapaMaxima());
        }else{
            this.cafetera.setCantActual(agregar + this.cafetera.getCantActual());
            System.out.println("La cafetera ahora contiene " + this.cafetera.getCantActual());
            
        }
    }
}
