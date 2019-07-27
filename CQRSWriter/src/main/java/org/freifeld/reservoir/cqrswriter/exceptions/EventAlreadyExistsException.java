package org.freifeld.reservoir.cqrswriter.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.UUID;

public class EventAlreadyExistsException extends WebApplicationException {
    public EventAlreadyExistsException(UUID id) {
        super("Event with UUID " + id + " already exists", Response.Status.BAD_REQUEST);
    }
}
