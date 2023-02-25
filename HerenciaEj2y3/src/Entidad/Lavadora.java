
package Entidad;

/**
 *
 * @author Carlitos
 */
public class Lavadora extends Electrodomestico {
    private float carga;
    

    public Lavadora() {
        super();
        this.carga = 0;
    }

    public Lavadora(float carga, float peso, float precio, String consumoElectrico, String color) {
        super(peso, precio, consumoElectrico, color);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "-------------------------------------------------" +"\n                    Lavadora" +"\n-------------------------------------------------" +  "\nCapacidad de Carga: " + carga+"\n" + super.toString() ;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
    if(this.carga > 30){
        this.precio += 500;
    }
    }
    
    
    
}
