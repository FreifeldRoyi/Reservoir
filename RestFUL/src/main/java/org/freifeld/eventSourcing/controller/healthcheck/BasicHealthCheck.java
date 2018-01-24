package org.freifeld.eventSourcing.controller.healthcheck;

import com.codahale.metrics.health.HealthCheck;

/**
 * @author royif
 * @since 12/01/18.
 */
public class BasicHealthCheck extends HealthCheck
{
	@Override
	protected Result check() throws Exception
	{
		return Result.healthy();
	}
}
