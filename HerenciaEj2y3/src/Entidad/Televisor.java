
package Entidad;

/**
 *
 * @author Carlitos
 */
public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, float peso, float precio, String consumoElectrico, String color) {
        super(peso, precio, consumoElectrico, color);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "-------------------------------------------------" +"\n                    Televisor" + "\n-------------------------------------------------" + "\n" + resolucion + " Pulgadas" +  "\t TDT:" + sintonizadorTDT + "\n" + super.toString();
    }

    /*
    Metodo precioFinal TV
    */
    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if(this.resolucion>40){
            this.precio+=(this.precio * 0.3);
        }
        if(this.sintonizadorTDT){
            this.precio += 500;
        }
    }
    
    
    
    

    

  
    
    
}
