package org.freifeld.reservoir.eventer;

import org.freifeld.reservoir.events.Event;

import javax.json.JsonObject;
import java.util.List;
import java.util.concurrent.Flow;

public class EventProcessor implements Flow.Processor<List<JsonObject>, List<Event>>
{

	@Override
	public void subscribe(Flow.Subscriber<? super List<Event>> subscriber)
	{

	}

	@Override
	public void onSubscribe(Flow.Subscription subscription)
	{

	}

	@Override
	public void onNext(List<JsonObject> item)
	{

	}

	@Override
	public void onError(Throwable throwable)
	{

	}

	@Override
	public void onComplete()
	{

	}
}
