package com.Ejercicio1;

public class InsufficientBalanceException extends Exception {
    private final double deficit;

    // TODO: constructor con mensaje y deficit
    public InsufficientBalanceException(String message, double deficit) {
        super(___);
        this.deficit = ___;
    }

    public double getDeficit() { return ___; }
}