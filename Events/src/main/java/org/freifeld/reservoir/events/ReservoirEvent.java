package org.freifeld.reservoir.events;

import javax.json.JsonObject;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * @author royif
 * @since 11/02/18.
 */
public class ReservoirEvent {
    private final UUID id;
    private final Instant creationTime;
    private final ZonedDateTime eventTime;
    private final long version;

    private final JsonObject changes;

    public ReservoirEvent(UUID id, ZonedDateTime eventTime, long version, JsonObject changes) {
        this.creationTime = Instant.now();
        this.id = id;
        this.eventTime = eventTime;
        this.version = version;
        this.changes = changes;
    }

    public Instant getCreationTime() {
        return this.creationTime;
    }

    public ZonedDateTime getEventTime() {
        return this.eventTime;
    }

    public long getVersion() {
        return this.version;
    }

    public UUID getId() {
        return this.id;
    }

    public JsonObject getChanges() {
        return this.changes;
    }
}
