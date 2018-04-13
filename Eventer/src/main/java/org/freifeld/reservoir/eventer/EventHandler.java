package org.freifeld.reservoir.eventer;

import org.freifeld.reservoir.eventer.events.Event;

import java.util.List;
import java.util.concurrent.Flow;

public class EventHandler implements Flow.Subscriber<List<Event>> {
    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(List<Event> item) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
