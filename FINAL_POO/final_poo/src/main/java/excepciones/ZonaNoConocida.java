package excepciones;

public class ZonaNoConocida extends RuntimeException {
    public ZonaNoConocida(String message) {
        super(message);
    }
}
