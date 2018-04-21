package org.freifeld.reservoir.cqrswriter.boundary;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.freifeld.reservoir.events.VersionedEntity;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author royif
 * @since 12/01/18.
 */
@Path("/versionedEntities")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VersionEntityResource
{
	private static final Logger LOGGER = LoggerFactory.getLogger(VersionEntityResource.class);

	@Inject
	@ConfigProperty(name = "kafka.topic.raw")
	private String topic;

	@POST
	public Response createEntity(VersionedEntity versionedEntity)
	{
		System.out.println("THIS IS THE MOFO TOPIC = " + topic);
		//TODO
		LOGGER.info("RX data {}", versionedEntity);
		return Response.ok(versionedEntity).build();
	}

	@PUT
	public Response updateEntity(VersionedEntity versionedEntity)
	{
		//TODO
		return Response.ok(versionedEntity).build();
	}

	@DELETE
	@Path("{id}")
	public Response deleteEntity(@PathParam("id") String id, VersionedEntity versionedEntity)
	{
		//TODO
		return Response.ok(versionedEntity).build();
	}
}
