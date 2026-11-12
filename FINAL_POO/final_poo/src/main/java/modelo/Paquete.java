package modelo;
import excepciones.PesoInvalido;
import java.util.Objects;

public abstract class Paquete { //requisito 1:
    private final int numeroGuia; //esta en int la vd no sabia como ponerle EY-XXX lo siento profe
    private final int peso; //en kg
    public final double costoEnvio;
    private final String zonaDestino; //todo final para no ser modificable

    public int getNumeroGuia() {
        return numeroGuia;
    }

    public int getPeso() {
        return peso;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public String getZonaDestino() {
        return zonaDestino;
    }

    protected Paquete(int numeroGuia, int peso, String zonaDestino) throws PesoInvalido {
        this.numeroGuia = numeroGuia;
        this.peso = peso;
        this.zonaDestino = zonaDestino;

        if (peso < 0 || peso > 20) {
            throw new PesoInvalido("El paquete " + numeroGuia + "Tiene peso invalido");
    }

    // equals/hashCode SOLO por numeroGuia
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return numeroGuia.equals(((Paquete) o).numeroGuia);
    }



        @Override
        public String toString() {
            return getClass().getSimpleName() + "" + numeroGuia + "" + peso + "" + costoEnvio + "" + zonaDestino }
        }


}
