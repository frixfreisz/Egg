
package entidades;

public class Secreto {
    private String[] meses = new String[12];

    public Secreto() {
        this.meses[0] = "enero";
        this.meses[1] = "febrero";
        this.meses[2] = "marzo";
        this.meses[3] = "abril";
        this.meses[4] = "mayo";
        this.meses[5] = "junio";
        this.meses[6] = "julio";
        this.meses[7] = "agosto";
        this.meses[8] = "septiembre";
        this.meses[9] = "octubre";
        this.meses[10] = "noviembre";
        this.meses[11] = "diciembre";
        
    }

    public String[] getMeses() {
        return meses;
    }

    public void llenar(){
       
    }
}

