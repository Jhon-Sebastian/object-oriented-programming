public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.setFabricante("Luisa");
        auto.setModel("BMW");
        auto.setColor(Color.BLANCO);
        auto.setCilindrada(5.4);
        auto.setTipo(TipoAutomovil.FURGON);

        TipoAutomovil tipoAuto = auto.getTipo();
        System.out.println("Name: " + tipoAuto.getNombre());
        System.out.println("Description: " + tipoAuto.getDescripcion());

        System.out.println(Color.BLANCO);

        tipoAuto = TipoAutomovil.CONVERTIBLE;

        //Switch
          switch (tipoAuto) {
            case CONVERTIBLE:
                System.out.println("El automovil es convertible");
                break;
            case FURGON:
                System.out.println("El automovil es grande y robusto");
                break;
            case STATTION_MAGON:
                System.out.println("El automovil es norteamerica statiion");
                break;
        }

        System.out.println();
        //Recorrer un enumerador con Foreach
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil i : tipos){
            System.out.println(i);
        }


    }
}
