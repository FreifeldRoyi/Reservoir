package org.freifeld.reservoir.cqrswriter.entity;

import java.time.Instant;

/**
 * @author royif
 * @since 11/02/18.
 */
public abstract class ReservoirEvent
{
	private final Instant instant;

	protected ReservoirEvent()
	{
		this.instant = Instant.now();
	}

	public Instant getInstant()
	{
		return this.instant;
	}
}
