package org.freifeld.reservoir.events;

import java.time.Instant;

/**
 * @author royif
 * @since 14/04/18.
 */
public abstract class Event
{
	public Instant instant;

	public Event()
	{
		this.instant = Instant.now();
	}
}
