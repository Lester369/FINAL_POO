package modelo;

import java.util.Optional;

public class Fragil extends Paquete{
    private final int costoEnvio = costoEnvio + 5000; // condicion del manejo especial



    @Override
    public int getCostoEnvio() {
        return costoEnvio;
    }
}

