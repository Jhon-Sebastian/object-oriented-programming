package clases.uml;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}
