public enum Color {

    //Constantes que van a aparecer, pero tiene el mismo valor que el nombre
    //Luego de crear el construcor toca pasarle el valor constante por argumento
    //Seria como invocar un constructor y pasar el valor por argumento
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NEGRO("Negro"),
    NARANJA("Naranja");

    //Para cambiar el valor, secrea un atributo
    //y ej: Aca seria el inicio de la clase
    private final String color;

    //Luego se crea un constructor para pasarle el valor
    Color(String color){
        this.color = color;
    }

    //Aca el metodo get
    public String getColor(){
        return  this.color;
    }

    //Existen dos formas de mostrar el valor string, una es ir al atributo y utilizar el metodo .getColor()
    //Otra es usar el metodo toString retornando solo el color

    @Override
    public String toString(){
        return this.color;
    }
}
