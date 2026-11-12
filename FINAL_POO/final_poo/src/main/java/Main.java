import excepciones.CapacidadMaximaMoto;
import excepciones.PesoInvalido;
import excepciones.ZonaNoConocida;

public class Main {
    public static void main(String[] args) {
        try {
            despacho.agregar(new Express());
            despacho.agregar(new Fragil());

        } catch (CapacidadMaximaMoto e) {
            System.out.println("Error registrando pedidos:" + e.getMessage());
        }



    }
}