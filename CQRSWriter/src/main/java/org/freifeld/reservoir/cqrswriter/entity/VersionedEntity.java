package org.freifeld.reservoir.cqrswriter.entity;

import javax.json.bind.annotation.JsonbProperty;

/**
 * @author royif
 * @since 02/02/18.
 */
public class VersionedEntity extends ReservoirEvent
{
	@JsonbProperty
	private long version;

	public VersionedEntity()
	{
		super();
	}

	public VersionedEntity(long version)
	{
		super();
		this.version = version;
	}

	public long getVersion()
	{
		return this.version;
	}

	public void setVersion(long version)
	{
		this.version = version;
	}
}
