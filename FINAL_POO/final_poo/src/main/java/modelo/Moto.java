package modelo;

import excepciones.CapacidadMaximaMoto;

public class Moto {
    private int capacidadMaxima = 30;

    public Moto(int capacidadMaxima) throws CapacidadMaximaMoto {
        this.capacidadMaxima = capacidadMaxima;
    }


}
