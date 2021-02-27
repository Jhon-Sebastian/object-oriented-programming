package clases.uml;

public class Auto implements Comparable<Auto>{

    //Atributos
    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    //Contador
    private static int contador;

    public Auto() {
        this.id = ++contador;
    }


    public Auto(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.estanque = estanque;
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public Integer getId() {
        return this.id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Auto.contador = contador;
    }

    public String showDetails() {
        return " Identificador = " + this.id
                + "\n Fabricante = " + this.fabricante
                + "\n Modelo = " + this.modelo
                + "\n Color = " + this.color.getColor()
                + "\n Motor = " + this.motor.getTipo()
                + "\n Capacidad Estanque = " + this.estanque.getCapacidad()
                + "\n Propietario = " + this.conductor
                + "\n # Ruedas = " + this.ruedas.length;

    }

    //Metodo comparable sobreescrito y modificado a nuestras necesidades
    @Override
    public int compareTo(Auto a) {

        /*  Hacemos un cast para obtener el auto que se pasa por argumento;
            Ya no usamos el cast ya que le decimos a la clase Comparable<Auto> que vamos a usar
            Datos de tipo Automovil, a esto se le
            conoce como Generics
        */

        //Auto a = (Auto) o;

        //Validamos si el fabricante de OBJETO 1 es menor en a tabla UNICODE
        // con el fabricante OBJETO 2
        return this.fabricante.compareTo(a.getFabricante());
    }

    @Override
    public String toString(){
        return "\n"+this.conductor;
    }
}
