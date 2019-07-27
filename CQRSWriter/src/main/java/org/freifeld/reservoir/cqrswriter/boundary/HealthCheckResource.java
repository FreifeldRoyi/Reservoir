package org.freifeld.reservoir.cqrswriter.boundary;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author royif
 * @since 30/03/18.
 */
@Readiness
@Liveness
@ApplicationScoped
public class HealthCheckResource implements HealthCheck
{
	@Override
	public HealthCheckResponse call()
	{
		return HealthCheckResponse.named("CQRSWriter").up().build();
	}
}
