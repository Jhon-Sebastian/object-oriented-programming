package clases.uml;

import java.util.Arrays;

public class EjemploInicioPrograma {
    public static void main(String[] args) {

        Auto autoNew = new Auto(
                "Lamborghini", "Urus",
                Color.AMARILLO,
                new Motor(2.9, TipoMotor.BENCINA),
                new Estanque(),
                new Persona("Jhon", "Cagua"),
                new Rueda[4]
        );
        Auto autoNew2 = new Auto(
                "Rolls Royce", "Phantom",
                Color.NEGRO,
                new Motor(1.9, TipoMotor.BENCINA),
                new Estanque(67),
                new Persona("Luis", "Enrique"),
                new Rueda[4]
        );
        Auto autoNew3 = new Auto(
                "Mercedes Benz", "AMG GTR",
                Color.AZUL,
                new Motor(4.3, TipoMotor.BOXER),
                new Estanque(120),
                new Persona("Carlos", "Alfonso"),
                new Rueda[4]
        );
        Auto autoNew4 = new Auto(
                "Audi", "A3",
                Color.AZUL,
                new Motor(4.3, TipoMotor.BOXER),
                new Estanque(23),
                new Persona("Hanival", "Chao"),
                new Rueda[4]
        );

        System.out.println("\n***CLIENTES***");
        System.out.println();
        System.out.println(autoNew.showDetails());
        System.out.println();
        System.out.println(autoNew2.showDetails());
        System.out.println();
        System.out.println(autoNew3.showDetails());
        System.out.println();
        System.out.println(autoNew4.showDetails());

        //Crear un arreglo y luego ordenarlo por atributo
        Auto[] automoviles = new Auto[4];
        automoviles[0] = autoNew;
        automoviles[1] = autoNew2;
        automoviles[2] = autoNew3;
        automoviles[3] = autoNew4;

        System.out.println("ORDENADO POR FABRICANTE");
        //ordenarAutoPorFabricante(automoviles);

        ordenarAutoPorFabricanteUsandoArraysSort(automoviles);
    }

    //Metodo que ordena los autos por fabricante por @JhonCagua y los muestra
    private static void ordenarAutoPorFabricante(Auto[] automoviles) {
        for (int i = 0; i < automoviles.length; i++) {
            for (int j = 0; j < automoviles.length - 1 - i; j++) {
                if (automoviles[j + 1].getFabricante().compareTo(automoviles[j].getFabricante()) < 0) {
                    Auto aux = automoviles[j];
                    automoviles[j] = automoviles[j + 1];
                    automoviles[j + 1] = aux;
                }
            }
        }

        for (Auto automovile : automoviles) {
            System.out.println(
                    "\n Identificador= " + automovile.getId()
                            + "\nFabricante= " + automovile.getFabricante()
                            + "\nModelo= " + automovile.getModelo()
                            + "\nColor= " + automovile.getColor()
                            + "\nMotor= " + automovile.getMotor().getTipo()
                            + "\nCapacidad Estanque= " + automovile.getEstanque().getCapacidad()
                            + "\nPropietario= " + automovile.getConductor()
                            + "\n# Ruedas= " + automovile.getRuedas().length);
        }

    }

    private static void ordenarAutoPorFabricanteUsandoArraysSort(Auto[] automoviles){
        /*Tambien se puede usar Arrays.sort(automoviles) para ordenar,
        Pero no puede ordenar por objeto asi que toca implementar la clase Comparable
        la cual posee el metodo TODO: compareTo() -> y lo que hacemos es sobreescribir
        acomodarlo a nuestras necesidades y comparar por el fabricante
         */

        //Todo esto ya que sort() usar el metodo compareTo y por ello es el que toca modificar
        Arrays.sort(automoviles);
        for (Auto automovile : automoviles) {
            System.out.println(automovile);
        }
    }
}
