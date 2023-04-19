/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Armadura;
import entidades.Materiales;
import entidades.TipoMaterial;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class ServArmadura {
    private ArrayList<Armadura>lista;
    private Scanner leer;
    private Armadura a;
    
    public ServArmadura(){
        this.leer = new Scanner(System.in);
        this.a = null;
        this.lista = new ArrayList();
        
    }
    
    public void material(){
              
        System.out.println("Elija el material de la armadura");
        System.out.println("1 - Acero");
        System.out.println("2 - Adamantio");
        System.out.println("3 - Aluminio");
        int op = leer.nextInt();
        
        switch(op){
            case 1: 
               entidades.Materiales m = new entidades.Materiales(entidades.TipoMaterial.Acero);
               a = new Armadura(m);
               break;
            case 2:
               Materiales m1 = new Materiales(TipoMaterial.Adamantio);
               a = new Armadura(m1);
               break;
            default:
               Materiales m2 = new Materiales(TipoMaterial.Aluminio);
               a = new Armadura(m2);
               break;
               
        }
        lista.add(a);
    }
    public void color(){
        
        System.out.println("Ingrese el color primario de la armadura: ");
        a.setColorPrimario(leer.next());
        System.out.println("Ingrese el color secundario de la armadura: ");
        a.setColorSecundario(leer.next());
        lista.add(a);
    }
    public void mostrar(){
        for (Armadura armadura : lista) {
            System.out.println(lista);
            
        }
    }
    public void accion(){
        System.out.println("-----------Elija una accion ------------");
        System.out.println("1 - Caminar");
        System.out.println("2 - Correr");
        System.out.println("3 - Propulsarse");
        System.out.println("4 - Volar");
        System.out.println("5 - Disparar");
        System.out.println("6 - Escribir");
        System.out.println("7 - Hablar");
        int op = leer.nextInt();
        
        switch(op){
            case 1:
                System.out.print("Cuantos segundos desea caminar? ");
                a.caminar(leer.nextInt());
                accion();
                break;
            case 2:
                System.out.print("Cuantos segundos desea correr? ");
                a.correr(leer.nextInt());
                accion();
                break;
            case 3:
                System.out.print("Cuantos segundos desea propulsarse? ");
                a.propulsarse(leer.nextInt());
                accion();
                break;
            case 4:
                System.out.print("Cuantos segundos desea volar? ");
                a.volar(leer.nextInt());
                accion();
                break;
            case 5:
                System.out.print("Cuantos segundos desea disparar? ");
                a.disparar(leer.nextInt());
                accion();
                break;
            case 6:
                System.out.print("Cuantos segundos desea dialogar? ");
                a.hablar(leer.nextInt());
                accion();
                break;
            case 7:
                System.out.print("Cuantos segundos desea escribir? ");
                a.escribir(leer.nextInt());
                accion();
                break;
            default:
                System.out.println("Ingrese una opcion valida.");
                accion();
        }
        
    }
    
}
    
    

