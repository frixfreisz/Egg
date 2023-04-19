/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


/**
 *
 * @author Carlitos
 */
public class Armadura{
    private String colorPrimario;
    private String colorSecundario;
    private Bota botaDerecha;
    private Bota botaIzquierda;
    private Guante guanteDerecho;
    private Guante guanteIzquierdo;
    private Materiales material;
    private int nivelSalud;
    private Generador generador;
    private Consola consola;
    private Sintetizador sintetizador;

    public Armadura(Materiales material){
    this.nivelSalud = 100;   
    this.material = material;
    this.botaDerecha = new Bota();
    this.botaIzquierda = new Bota();
    this.guanteDerecho = new Guante();
    this.guanteIzquierdo = new Guante();
    this.generador = new Generador();
    this.sintetizador = new Sintetizador();
    this.consola = new Consola();
    
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Bota getBotaDerecha() {
        return botaDerecha;
    }


    public Bota getBotaIzquierda() {
        return botaIzquierda;
    }


    public Guante getGuanteDerecho() {
        return guanteDerecho;
    }


    public Guante getGuanteIzquierdo() {
        return guanteIzquierdo;
    }


    public Materiales getMaterial() {
        return material;
    }


    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public Generador getGenerador() {
        return generador;
    }


    public Consola getConsola() {
        return consola;
    }



    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    
    public void caminar(int seg){
        double energiaConsumida = 0;
        for (int i = seg; i >= 0; i--) {
            energiaConsumida += this.botaDerecha.consumoEnergiaNormal + this.botaIzquierda.consumoEnergiaNormal;
            
        }
        double energiaRestante = this.generador.consumir(energiaConsumida);
        System.out.println("\n----------------------Caminata terminada---------------------------");
        System.out.println("Consumo de energia: " + "\t" + energiaConsumida);
        System.out.println("EnergiaRestante: " + "\t" + energiaRestante);
        System.out.println("-------------------------------------------------------------------");
    }
    
    public void correr(int seg){
        double energiaConsumida = 0;
        for (int i = seg; i >= 0; i--) {
            energiaConsumida += (this.botaDerecha.consumoEnergiaNormal + this.botaIzquierda.consumoEnergiaNormal)* 2;
            
        }
        
        double energiaRestante = this.generador.consumir(energiaConsumida);
        
        System.out.println("\n----------------------Carrera terminada---------------------------");
        System.out.println("Consumo de energia: " + "\t" + energiaConsumida);
        System.out.println("EnergiaRestante: " + "\t" + energiaRestante);
        System.out.println("-------------------------------------------------------------------");
    }
    
    public void propulsarse(int seg){
        double energiaConsumida = 0;
        for (int i = seg; i >= 0; i--) {
            energiaConsumida += (this.botaDerecha.consumoEnergiaNormal + this.botaIzquierda.consumoEnergiaNormal)* 3;
            
        }
        
        double energiaRestante = this.generador.consumir(energiaConsumida);
        
        System.out.println("\n---------------------Propulsion finalizada-------------------------");
        System.out.println("Consumo de energia: " + "\t" + energiaConsumida);
        System.out.println("EnergiaRestante: " + "\t" + energiaRestante);
        System.out.println("-------------------------------------------------------------------");
    }
    
    public void volar(int seg){
        double energiaConsumida = 0;
        for (int i = seg; i >= 0; i--) {
            energiaConsumida += ((this.botaDerecha.consumoEnergiaAlto + this.botaIzquierda.consumoEnergiaAlto)* 3) + ((this.guanteDerecho.consumoEnergiaAlto + this.guanteIzquierdo.consumoEnergiaAlto)* 2);
            
        }
        
        double energiaRestante = this.generador.consumir(energiaConsumida);
        
        System.out.println("\n------------------------Vuelo terminado----------------------------");
        System.out.println("Consumo de energia: " + "\t" + energiaConsumida);
        System.out.println("EnergiaRestante: " + "\t" + energiaRestante);
        System.out.println("-------------------------------------------------------------------");
    }
    
        public void disparar(int seg){
        double energiaConsumida = 0;
        for (int i = seg; i >= 0; i--) {
            energiaConsumida += (this.guanteDerecho.consumoEnergiaAlto + this.guanteIzquierdo.consumoEnergiaAlto)* 3;
            
        }
        
        double energiaRestante = this.generador.consumir(energiaConsumida);
        
        System.out.println("\n----------------------Disparo finalizado---------------------------");
        System.out.println("Consumo de energia: " + "\t" + energiaConsumida);
        System.out.println("EnergiaRestante: " + "\t" + energiaRestante);
        System.out.println("-------------------------------------------------------------------");
    }
        
        public void hablar(int seg){
        double energiaConsumida = 0;
        for (int i = seg; i >= 0; i--) {
            energiaConsumida += this.sintetizador.consumoEnergiaBajo + this.sintetizador.consumoEnergiaBajo;
            
        }
        
        double energiaRestante = this.generador.consumir(energiaConsumida);
        
        System.out.println("\n----------------------Dialogo terminado----------------------------");
        System.out.println("Consumo de energia: " + "\t" + energiaConsumida);
        System.out.println("EnergiaRestante: " + "\t" + energiaRestante);
        System.out.println("-------------------------------------------------------------------");
    }
        
        public void escribir(int seg){
        double energiaConsumida = 0;
        for (int i = seg; i >= 0; i--) {
            energiaConsumida += this.consola.consumoEnergiaBajo + this.consola.consumoEnergiaBajo;
            
        }
        
        double energiaRestante = this.generador.consumir(energiaConsumida);
        
        System.out.println("\n---------------------Escritura terminada---------------------------");
        System.out.println("Consumo de energia: " + "\t" + energiaConsumida);
        System.out.println("EnergiaRestante: " + "\t" + energiaRestante);
        System.out.println("-------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "-------------Armadura------------"+ "\nColor Primario: " + colorPrimario + "\tColor Secundario: " + colorSecundario + "\nBota Derecha: " + botaDerecha + "\tBota Izquierda: " + botaIzquierda + "\nGuante Derecho: " + guanteDerecho + "\tGuante Izquierdo: " + guanteIzquierdo + "\nMaterial: " + material + "\nNivel de Salud: " + nivelSalud + "\n------------------------------------------";
    }
        
        
}

