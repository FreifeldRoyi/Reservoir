package org.freifeld.reservoir.cqrswriter.entity;

import java.time.ZonedDateTime;

/**
 * @author royif
 * @since 02/02/18.
 */
public interface DatedEntity
{
	ZonedDateTime getDate();
}
