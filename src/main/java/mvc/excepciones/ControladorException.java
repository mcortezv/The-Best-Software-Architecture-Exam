package mvc.excepciones;

public class ControladorException extends RuntimeException {

    public ControladorException(String message) {
        super(message);
    }
}
