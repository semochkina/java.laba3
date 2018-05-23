package ru.omsk.sveta.example3;

public class SquareEqException extends Exception {
    public SquareEqException(String message) {
        super(message);
    }

    public SquareEqException(String message, Throwable cause) {
        super(message, cause);
    }

    public SquareEqException(Throwable cause) {
        super(cause);
    }

    public SquareEqException() {
        super("Equation has no roots.");
    }
}
