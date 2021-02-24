import java.util.Date;

public class EjemploAutomovilStatico {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.setFabricante("Luisa");
        auto.setModel("BMW");
        auto.setColor(Color.BLANCO);
        auto.setCilindrada(5.4);
        auto.setTipo(TipoAutomovil.FURGON);

        Automovil auto2 = new Automovil("Luisa","BMW",Color.ROJO,5.4,5);
        auto2.setTipo(TipoAutomovil.CONVERTIBLE);

        Automovil auto3 = new Automovil("BMW","Nissan");
        auto3.setTipo(TipoAutomovil.STATTION_MAGON);

        //Atributo static debe llevar metodos estaticos
        System.out.println(auto.detalle());
        System.out.println(auto2.detalle());
        System.out.println(auto3.detalle());

        System.out.println("\n");
        System.out.println("Velocidad maxima en carretera: "+Automovil.VELOCIDA_MAXIMA_CARRETERA + " KM");
        System.out.println("Velocidad maxima en ciudad: "+Automovil.VELOCIDAD_MAX_CIUDAD + " KM");


    }
}
