package exceptions;

public class InexistentUserFileException extends RuntimeException {

    public InexistentUserFileException() {
        super("USERS file doesn't exist!");
    }
}
