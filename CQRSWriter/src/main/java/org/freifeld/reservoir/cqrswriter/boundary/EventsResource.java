package org.freifeld.reservoir.cqrswriter.boundary;

import org.freifeld.reservoir.cqrswriter.controller.eventsconsumers.EventConsumer;
import org.freifeld.reservoir.events.ReservoirEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author royif
 * @since 09/02/18.
 */
@Path("/events")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class EventsResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventsResource.class);

    @Inject
    private EventConsumer eventConsumer;

	@POST
    public Response createEntity(ReservoirEvent reservoirEvent) {
        return Response.accepted(reservoirEvent).build();
	}

	@PUT
    public Response updateEntity(ReservoirEvent reservoirEvent) {
        return Response.accepted(reservoirEvent).build();
	}

	@DELETE
	@Path("{id}")
    public Response deleteEntity(@PathParam("id") String id, ReservoirEvent reservoirEvent) {
        return Response.accepted(reservoirEvent).build();
	}
}
