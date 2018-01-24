package org.freifeld.eventSourcing.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author royif
 * @since 12/01/18.
 */
public class ComplexEntity
{
	private long id;

	private String name;
	private long number;

	public ComplexEntity()
	{
	}

	public ComplexEntity(long id, String name, long number)
	{
		this.id = id;
		this.name = name;
		this.number = number;
	}

	@JsonProperty
	public long getNumber()
	{
		return this.number;
	}

	@JsonProperty
	public long getId()
	{
		return this.id;
	}

	@JsonProperty
	public String getName()
	{
		return this.name;
	}

	@Override
	public String toString()
	{
		return "{id: " + this.id + ",name: " + this.name + ",number: " + this.number + "}";
	}
}
