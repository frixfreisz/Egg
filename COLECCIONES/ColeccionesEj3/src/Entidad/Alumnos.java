
package Entidad;

import java.util.Arrays;

public class Alumnos {

private String Alumno;    
private Integer[]notas;

    public Alumnos() {
        this.notas = new Integer[3];
    }

    public Alumnos(String Alumno, Integer[] notas) {
        this.Alumno = Alumno;
        this.notas = notas;
    }

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    public Integer[] getNotas() {
        return notas;
    }

    public void setNotas(Integer[] notas) {
        this.notas = notas;
    }   

    @Override
    public String toString() {
        return "Alumnos{" + "Alumno=" + Alumno + Arrays.toString(notas) + '}';
        
    }
}
