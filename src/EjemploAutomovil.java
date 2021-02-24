import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.setFabricante("Luisa");
        auto.setModel("BMW");
        auto.setColor(Color.NEGRO);
        auto.setCilindrada(5.4);

        Automovil auto2 = new Automovil();

        auto2.setFabricante("Luisa");
        auto2.setModel("BMW");
        auto2.setColor(Color.NEGRO);
        auto2.setCilindrada(5.4);

        System.out.println(auto.detalle());
        System.out.println(auto.acelerar(54));

        System.out.println("Kilometros por litro " + auto.calcularComsumo(300,0.6f));
        System.out.println("Kilometros por litro " + auto.calcularComsumo(300,60));

        System.out.println("Son iguales? con iquals  " + (auto.equals(auto2)));
        System.out.println("Son iguales? " + (auto == auto2));

        // Comparar 2 objetos de tipos diferentes
        Date fecha = new Date();

        //Arroja una Exception ya que son tipos incompatibles
        System.out.println(" Son iguales? -> diferentes tipos " + (auto.equals(fecha)));

        //Imprimiendo el objeto usando el metodo toString
        //Lo que hace es que obtiene el hasCode = Identificador Unico y lo que convierte a int hexadecimal
        // Luego muestra -> Nombre de la clase @ int hexadecimal => Automovil@3892102
        //Lo que hace es imprimir una cadena String en lugar del identificador del objeto
        System.out.println(auto.toString());
        System.out.println("HasCode " +   auto.hashCode() + ", Hexadecimal -> " + Integer.toHexString(auto.hashCode()));

    }
}
