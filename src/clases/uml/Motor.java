package clases.uml;

public class Motor {

    private double cilindraje;
    private TipoMotor tipo;

    public Motor(){

    }

    public Motor(double cilindraje, TipoMotor tipo) {
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
