
package servicios;

import entidades.Revolver;

public class ServRevolver {

    public Revolver llenarRevolver(){
        Integer posAct = (int) (Math.random() * 6) + 1;
        Integer posBala = (int) (Math.random() * 6) + 1;
        return new Revolver(posAct, posBala);
    }

    public Boolean cargada(Revolver revolver){
        return revolver.getPosActual()==revolver.getPosBala();
    }
    
    public void siguienteBala(Revolver revolver){
        if (revolver.getPosActual()==6) {
            revolver.setPosActual(1);
        } else {
            revolver.setPosActual(revolver.getPosActual()+1);   
        }
    }
    
} //end ServRevolver
