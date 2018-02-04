package org.freifeld.reservoir.cqrswriter.boundary;

import org.freifeld.reservoir.cqrswriter.controller.healthcheck.BasicHealthCheck;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Response;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author royif
 * @since 04/02/18.
 */
@Path("healthCheck")
public class HealthCheckResource
{

	@Resource
	private ManagedExecutorService mes;

	@EJB
	private BasicHealthCheck basicHealthCheck;

	@GET
	public void serviceStatus(@Suspended AsyncResponse response)
	{
		response.setTimeout(1, TimeUnit.SECONDS);

		CompletableFuture.supplyAsync(() -> Response.ok(this.basicHealthCheck.check()).build(), this.mes).thenAccept(response::resume);
	}

}
