package clases.uml;

public enum TipoMotor {

    DIESEL("Diesel"), BENCINA("Bencina"), BOXER("Boxer");

    private final String tipo;

    TipoMotor(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
