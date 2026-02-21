package com.Ejercicio6;

public class EmailStrategy implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] Enviando: " + message);
    }
}