package org.freifeld.reservoir.cqrswriter.entity.healthcheck;

/**
 * @author royif
 * @since 04/02/18.
 */
public class HealthCheckResult
{
	private String name;

	private HealthCheckStatus status;

	public HealthCheckResult()
	{
	}

	public HealthCheckResult(String name, HealthCheckStatus status)
	{
		this.name = name;
		this.status = status;
	}

	public String getName()
	{
		return this.name;
	}

	public HealthCheckStatus getStatus()
	{
		return this.status;
	}

	public enum HealthCheckStatus
	{
		OK,
		WARNING,
		BAD,
		DOWN
	}

}
