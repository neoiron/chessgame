package chessgame.domain.exception;

public class PieceException extends Exception {

    public PieceException(String message) {
        super(message);
    }

    public PieceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PieceException(Throwable cause) {
        super(cause);
    }
}