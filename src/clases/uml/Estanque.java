package clases.uml;

public class Estanque {

    private Integer capacidad;

    public Estanque(){
        this.capacidad = 40;
    }

    public Estanque(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getCapacidad() {
        return capacidad;
    }
}
