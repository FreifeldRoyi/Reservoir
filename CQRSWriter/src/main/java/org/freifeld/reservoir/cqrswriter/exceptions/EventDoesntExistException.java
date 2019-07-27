package org.freifeld.reservoir.cqrswriter.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.UUID;

public class EventDoesntExistException extends WebApplicationException {
    public EventDoesntExistException(UUID id) {
        super("Event with UUID " + id + " doesn't exist", Response.Status.BAD_REQUEST);
    }
}
