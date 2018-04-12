package org.freifeld.reservoir.cqrswriter.boundary;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author royif
 * @since 30/03/18.
 */
@Health
@ApplicationScoped
public class HealthCheckResource implements HealthCheck
{
	@Override
	public HealthCheckResponse call()
	{
		return HealthCheckResponse.named("PING").up().build();
	}
}
