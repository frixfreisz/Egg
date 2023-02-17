
package Entidad;

import java.util.Arrays;

public class EntidadAlumno {

private String alumno;
private Integer[]notas;

    public EntidadAlumno() {
        this.notas = new Integer[3];
    }

    public EntidadAlumno(String alumno, Integer[] notas) {
        this.alumno = alumno;
        this.notas = notas;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public Integer[] getNotas() {
        return notas;
    }

    public void setNotas(Integer[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "EntidadAlumno{" + "alumno=" + alumno + Arrays.toString(notas) + '}';
    }
    
    

}
