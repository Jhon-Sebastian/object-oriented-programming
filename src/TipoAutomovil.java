public enum TipoAutomovil {

    BMW("BMW","Auton normal",4),
    SEDAN("Sedan","Auton normal",4),
    STATTION_MAGON("Stattion Magon","Auton mediano",4),
    PICKUP("Pick up","Auton pequeño",2),
    COUPE("Coupe","Auto pequeño",2),
    CONVERTIBLE("Convertible","Auton deportivo",2),
    FURGON("Furgon","Auton grande",4);

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String tipo, String descripcion, int numeroPuertas){
        this.nombre = tipo;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
