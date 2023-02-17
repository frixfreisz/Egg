
package PersonaLocal;


import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    private LocalDateTime nacimiento;
    

    public Persona() {
    }

    public Persona(String nombre, LocalDateTime nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDateTime nacimiento) {
        this.nacimiento = nacimiento;
    }
    
}
