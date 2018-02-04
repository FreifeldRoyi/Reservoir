package org.freifeld.reservoir.cqrswriter.boundary;

import org.freifeld.reservoir.cqrswriter.entity.VersionedEntity;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.ws.rs.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

/**
 * @author royif
 * @since 12/01/18.
 */
@Path("versionedEntities")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VersionEntityResource
{

	@Resource
	private ManagedExecutorService mes;

	@POST
	public <T extends VersionedEntity> void createEntity(T versionedEntity, @Suspended AsyncResponse response)
	{
		//this.outboundManager.fire(complexEntity);
	}

	@PUT
	public <T extends VersionedEntity> void updateEntity(T versionedEntity, @Suspended AsyncResponse response)
	{
		//this.outboundManager.fire(complexEntity);
	}

	@DELETE
	@Path("{id}")
	public <T extends VersionedEntity> void deleteEntity(@PathParam("id") String id, T versionedEntity, @Suspended AsyncResponse response)
	{
		//this.outboundManager.fire(complexEntity);
	}
}
