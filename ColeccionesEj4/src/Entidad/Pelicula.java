
package Entidad;

import java.util.Objects;

public class Pelicula {
   private String titulo;
   private String Director;
   private Float duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String Director, Float durecion) {
        this.titulo = titulo;
        this.Director = Director;
        this.duracion = durecion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Float getDurecion() {
        return duracion;
    }

    public void setDurecion(Float durecion) {
        this.duracion = durecion;
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.titulo);
        hash = 47 * hash + Objects.hashCode(this.Director);
        hash = 47 * hash + Objects.hashCode(this.duracion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.Director, other.Director)) {
            return false;
        }
        if (!Objects.equals(this.duracion, other.duracion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", Director=" + Director + ", durecion=" + duracion + '}';
    }
   
}
