import java.util.Objects;
import java.util.logging.Logger;

public class Automovil {

    //Atributos
     private String fabricante;
     private String model;
     private Color color = Color.AMARILLO;
     private double cilindrada;
     private int capacidadEstanque = 40;

     private TipoAutomovil tipo;

     //Atributos estaticos si se modifica en un objeto tambien lo hacen en los otros
     private static Color colorPatente = Color.NARANJA;

     //atributos final
    public static final Integer VELOCIDA_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";


     //Crear un identificar autoincremnetable para cada objto
     private int id;
     private static int ultimo;

     public Automovil(){
         this.id = ++ultimo;
     }

     public Automovil(String fabricante, String model){
         this();
         this.fabricante = fabricante;
         this.model = model;
     }

    public Automovil(String fabricante, String model, Color color) {
        this(fabricante,model);
        this.color = color;
    }

    //El this se usa cuando tenemos varios contructores y para reutilizar codigo, llamamos un constructor que tena
    // lo que requerimientos e inializacion los otros valores
    public Automovil(String fabricante, String model, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante,model,color);
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }

    public String detalle(){
         /*
         System.out.println("Fabricante del Auto " + this.fabricante);
         System.out.println("Modelo del Auto " + this.model);
         System.out.println("Color del Auto " + this.color);
         System.out.println("Cilindrada del Auto " + this.cilindrada);
          */
         StringBuffer sb = new StringBuffer();
         sb.append("  Fabricante del Auto " + this.fabricante);
         sb.append("\n, Modelo del Auto " + this.model);
         sb.append("\n, Color del Auto " + this.color);
         sb.append("\n, Cilindrada del Auto " + this.cilindrada);
         sb.append("\n, ColorPatente " + Automovil.colorPatente);
         sb.append("\n, TipoAutomovil " + this.tipo.getNombre());
         sb.append("\n, id:  " + this.id);

         return sb.toString();
     }

     public String acelerar(int rpm){
         return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm";
     }

     public float calcularComsumo (int km, float porcentajeBencina){
         return km/(this.capacidadEstanque * porcentajeBencina);
     }


    public float calcularComsumo (int km, int porcentajeBencina){
        return km/(this.capacidadEstanque * (porcentajeBencina / 100f));
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static Color getColorPatente(){
         return Automovil.colorPatente;
    }

    public static void setColorPatente(Color colorPatente){
         Automovil.colorPatente = colorPatente;
    }

    public String getFabricante(){
         return this.fabricante;
    }

    public String getModel(){
        return this.model;
    }

    public Color getColor(){
        return this.color;
    }

    public double getCilindrada(){
         return this.cilindrada;
    }

    public int getCapacidadEstanque(){
         return this.capacidadEstanque;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    //Sobreescribir el metodo equals de la clase padre -> object
    //a esto tambien se le conoce como polimorfimos-> muchas formas de hacer lo mismo
    @Override
    public boolean equals(Object obj) {
        // Siempre se compararn 2 valores del mismo tipo
        // por lo tanto se hace un cast
        //Haciendo de validacion ya que no se puede comparar un valor nulo

        //Si es el mismo objeto no es necesario comparar
        if(this == obj){
            return true;
        }

        //Comparacion por si son 2 tipos diferentes
        if (!(obj instanceof Automovil)) {
            return false;
        }else{
            Automovil a = (Automovil) obj;

            return (this.fabricante != null && this.model != null
                    && this.fabricante.equals(a.getFabricante())
                    && this.model.equals(a.getModel()));
        }
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }
}
