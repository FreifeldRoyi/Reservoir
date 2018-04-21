package org.freifeld.reservoir.events;

import java.time.ZonedDateTime;

/**
 * @author royif
 * @since 02/02/18.
 */
public class DatedEntity extends ReservoirEvent
{
	private ZonedDateTime dateTime;

	public DatedEntity()
	{
		super();
	}

	public DatedEntity(ZonedDateTime dateTime)
	{
		super();
		this.dateTime = dateTime;
	}

	public ZonedDateTime getDateTime()
	{
		return this.dateTime;
	}

	public void setDateTime(ZonedDateTime dateTime)
	{
		this.dateTime = dateTime;
	}
}
