package org.freifeld.reservoir.cqrswriter.controller.healthcheck;

import org.freifeld.reservoir.cqrswriter.entity.healthcheck.HealthCheck;
import org.freifeld.reservoir.cqrswriter.entity.healthcheck.HealthCheckResult;

import javax.ejb.Stateless;

/**
 * @author royif
 * @since 12/01/18.
 */
@Stateless
public class BasicHealthCheck implements HealthCheck
{
	private final HealthCheckResult result = new HealthCheckResult("Ping", HealthCheckResult.HealthCheckStatus.OK);

	@Override
	public HealthCheckResult check()
	{
		return this.result;
	}
}
