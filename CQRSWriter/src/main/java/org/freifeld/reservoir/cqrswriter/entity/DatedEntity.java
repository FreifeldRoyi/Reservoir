package org.freifeld.reservoir.cqrswriter.entity;

import java.time.ZonedDateTime;

/**
 * @author royif
 * @since 02/02/18.
 */
public class DatedEntity
{
	private ZonedDateTime dateTime;

	public DatedEntity()
	{
	}

	public DatedEntity(ZonedDateTime dateTime)
	{
		this.dateTime = dateTime;
	}

	public ZonedDateTime getDateTime()
	{
		return this.dateTime;
	}
}
