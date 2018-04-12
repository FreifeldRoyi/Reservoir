package org.freifeld.reservoir.cqrswriter.boundary;

import org.eclipse.microprofile.metrics.annotation.Counted;
import org.freifeld.reservoir.cqrswriter.entity.VersionedEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

	@POST
	public Response createEntity(VersionedEntity versionedEntity)
	{
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
