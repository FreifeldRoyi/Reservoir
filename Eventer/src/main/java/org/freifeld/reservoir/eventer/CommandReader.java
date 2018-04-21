package org.freifeld.reservoir.eventer;

import javax.json.JsonObject;
import java.util.List;
import java.util.concurrent.Flow;

/**
 * @author royif
 * @since 16/03/18.
 */
public class CommandReader implements Flow.Publisher<List<JsonObject>>
{
	@Override
	public void subscribe(Flow.Subscriber<? super List<JsonObject>> subscriber)
	{

	}
}
