package excepciones;

public class PesoInvalido extends RuntimeException {
    public PesoInvalido(String message) {
        super(message);
    }
}
