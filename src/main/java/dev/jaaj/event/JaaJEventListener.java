package dev.jaaj.event;

import java.util.EventListener;

@FunctionalInterface
public interface JaaJEventListener<E extends JaaJEvent<?>> extends EventListener {

    void handle(E event);

}
