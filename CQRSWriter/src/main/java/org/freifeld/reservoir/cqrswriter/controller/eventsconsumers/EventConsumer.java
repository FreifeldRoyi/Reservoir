package org.freifeld.reservoir.cqrswriter.controller.eventsconsumers;

import org.freifeld.reservoir.cqrswriter.exceptions.EventAlreadyExistsException;
import org.freifeld.reservoir.cqrswriter.exceptions.EventDoesntExistException;
import org.freifeld.reservoir.events.ReservoirEvent;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class EventConsumer {

    public Map<UUID, ReservoirEvent> events;

    public EventConsumer() {
        this.events = new ConcurrentHashMap<>();
    }

    public void insert(ReservoirEvent event) {
        var ret = this.events.putIfAbsent(event.getId(), event);
        if (ret != null) {
            throw new EventAlreadyExistsException(ret.getId());
        }
    }

    public ReservoirEvent update(ReservoirEvent event) {
        var oldEvent = this.events.replace(event.getId(), event);
        if (oldEvent == null) {
            throw new EventDoesntExistException(event.getId());
        }
        return oldEvent;
    }

    public ReservoirEvent delete(ReservoirEvent event) {
        var oldEvent = this.events.remove(event.getId());
        if (oldEvent == null) {
            throw new EventDoesntExistException(event.getId());
        }
        return oldEvent;
    }
}
