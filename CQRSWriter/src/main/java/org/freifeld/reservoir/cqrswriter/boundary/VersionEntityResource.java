package org.freifeld.reservoir.cqrswriter.boundary;

import org.freifeld.reservoir.cqrswriter.entity.VersionedEntity;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.ws.rs.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.concurrent.CompletableFuture;

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
	public void createEntity(VersionedEntity versionedEntity, @Suspended AsyncResponse response)
	{
		System.out.println("Version is: " + versionedEntity.getVersion());
		CompletableFuture.supplyAsync(() -> Response.ok(versionedEntity).build(), this.mes).thenAccept(response::resume);
		//this.outboundManager.fire(complexEntity);
	}

	@PUT
	public void updateEntity(VersionedEntity versionedEntity, @Suspended AsyncResponse response)
	{
		//this.outboundManager.fire(complexEntity);
	}

	@DELETE
	@Path("{id}")
	public void deleteEntity(@PathParam("id") String id, VersionedEntity versionedEntity, @Suspended AsyncResponse response)
	{
		//this.outboundManager.fire(complexEntity);
	}
}