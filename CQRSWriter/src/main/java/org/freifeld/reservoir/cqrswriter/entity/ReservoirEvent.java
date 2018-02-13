package org.freifeld.reservoir.cqrswriter.entity;

import javax.json.bind.annotation.JsonbProperty;
import java.time.Instant;

/**
 * @author royif
 * @since 11/02/18.
 */
public abstract class ReservoirEvent
{
	@JsonbProperty
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
