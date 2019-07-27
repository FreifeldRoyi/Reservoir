package org.freifeld.reservoir.cqrswriter.controller.configuration;

import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.Map;

/**
 * @author royif
 * @since 03/04/18.
 */
public class PropertiesConfiguration implements ConfigSource {
    @Override
    public Map<String, String> getProperties() {
        return null;
    }

    @Override
    public String getValue(String propertyName) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
