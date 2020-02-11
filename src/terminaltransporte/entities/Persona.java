package terminaltransporte.entities;

import java.util.Date;

public class Persona {

    private String nombre;
    private Date fechaNacimiento;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
        return 0;
    }
}
