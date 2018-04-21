package org.freifeld.reservoir.cqrswriter.boundary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.freifeld.reservoir.events.DatedEntity;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author royif
 * @since 09/02/18.
 */
@Path("/datedEntities")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DatedEntityResource
{
	private static final Logger LOGGER = LoggerFactory.getLogger(DatedEntityResource.class);

	//	@Inject
	//	private ReservoirEventProducer producer;

	@POST
	public Response createEntity(DatedEntity datedEntity)
	{
		//TODO
		LOGGER.info("RX {}", datedEntity);
		//this.producer.publish(datedEntity);
		return Response.ok(datedEntity).build();
	}

	@PUT
	public Response updateEntity(DatedEntity datedEntity)
	{
		//TODO
		return Response.ok(datedEntity).build();
	}

	@DELETE
	@Path("{id}")
	public Response deleteEntity(@PathParam("id") String id, DatedEntity datedEntity)
	{
		//TODO
		return Response.ok(datedEntity).build();
	}
}
