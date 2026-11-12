package modelo;

import excepciones.PesoInvalido;

public class Express extends Paquete{
    private final int costoEnvio = costoEnvio + costoEnvio*0.5; // condicion del 50% extra

    public Express(int numeroGuia, int peso, String zonaDestino) throws PesoInvalido {
        super(numeroGuia, peso, zonaDestino);
    }
    @Override
    public int getCostoEnvio() {
        return costoEnvio;
    }
}
