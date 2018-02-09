package org.freifeld.reservoir.cqrswriter.boundary;

import org.freifeld.reservoir.cqrswriter.entity.DatedEntity;

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
 * @since 09/02/18.
 */
@Path("datedEntities")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DatedEntityResource
{
	@Resource
	private ManagedExecutorService mes;

	@POST
	public void createEntity(DatedEntity datedEntity, @Suspended AsyncResponse response)
	{
		CompletableFuture.supplyAsync(() -> Response.ok(datedEntity).build(), this.mes).thenAccept(response::resume);
		//this.outboundManager.fire(complexEntity);
	}

	@PUT
	public void updateEntity(DatedEntity datedEntity, @Suspended AsyncResponse response)
	{
		//this.outboundManager.fire(complexEntity);
	}

	@DELETE
	@Path("{id}")
	public void deleteEntity(@PathParam("id") String id, DatedEntity datedEntity, @Suspended AsyncResponse response)
	{
		//this.outboundManager.fire(complexEntity);
	}
}
