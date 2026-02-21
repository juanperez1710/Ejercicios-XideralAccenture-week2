package com.Ejercicio6;
import java.util.*;

public class EventBus {
    // TODO: Map de EventType a lista de handlers
    private final Map<EventType, List<EventHandler>> listeners = new EnumMap<>(EventType.class);

    public EventBus() {
        // TODO: inicializar lista vacia para cada EventType
        for (EventType type : EventType.values()) {
            listeners.put(type, new ArrayList<>());
        }
    }

    public void subscribe(EventType type, EventHandler handler) {
        // TODO: agregar handler a la lista del tipo
        listeners.get(type).add(handler);
    }

    public void publish(EventType type, String data) {
        System.out.printf("[BUS] Publicando %s%n", type);
        // TODO: ejecutar todos los handlers del tipo
        for  (EventHandler handler : listeners.get(type)){
            handler.handle(data);
        }
    }
}
