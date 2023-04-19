package Persona;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private IMC imc;

    
    public enum IMC {BAJO, IDEAL, SOBREPESO}
            
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public IMC getImc() {
        return imc;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public IMC calcularIMC(){
        double pIdeal = (peso / Math.pow(altura, 2));
        if(pIdeal < 20){
           this.imc = IMC.BAJO;
        }else if(pIdeal >=20 && pIdeal <=25){
            this.imc = IMC.IDEAL;
        }else{
            this.imc = IMC.SOBREPESO;
        }
        return this.imc;
    }
    
    public boolean esMayorDeEdad(){
        return this.edad > 17;   
    }
}
