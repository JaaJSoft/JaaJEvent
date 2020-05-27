package dev.jaaj.event;

import java.util.EventListener;

@FunctionalInterface
public interface JaaJEventListener<E extends JaaJEvent<?>> extends EventListener {

    /**
     * @param event event
     */
    void handle(E event);

}
