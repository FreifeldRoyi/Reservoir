package org.freifeld.reservoir.cqrswriter.controller;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;
import java.util.UUID;

/**
 * @author royif
 * @since 06/04/18.
 */
public class UUIDSerDe implements Serializer<UUID>, Deserializer<UUID>
{
	@Override
	public void configure(Map<String, ?> configs, boolean isKey)
	{
		// Nothing to do
	}

	@Override
	public UUID deserialize(String topic, byte[] data)
	{
		return data == null ? null : UUID.fromString(new String(data));
	}

	@Override
	public byte[] serialize(String topic, UUID data)
	{
		return data == null ? null : data.toString().getBytes();
	}

	@Override
	public void close()
	{
		// Nothing to do
	}
}
