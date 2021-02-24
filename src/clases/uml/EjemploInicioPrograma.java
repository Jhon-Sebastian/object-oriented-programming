package clases.uml;

public class EjemploInicioPrograma {
    public static void main(String[] args) {

        Auto autoNew = new Auto(
                "Lamborghini","Urus",
                Color.AMARILLO,
                new Motor(2.9,TipoMotor.BENCINA),
                new Estanque(),
                new Persona("Jhon","Cagua"),
                new Rueda[4]
        );
        Auto autoNew2 = new Auto(
                "Rolls Royce","Phantom",
                Color.NEGRO,
                new Motor(1.9,TipoMotor.BENCINA),
                new Estanque(67),
                new Persona("Luis","Enrique"),
                new Rueda[4]
        );

        System.out.println("\n***CLIENTES***");
        System.out.println();
        System.out.println(autoNew.showDetails());
        System.out.println();
        System.out.println(autoNew2.showDetails());

    }
}
