package org.freifeld.reservoir.cqrswriter.controller.configuration;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author royif
 * @since 04/02/18.
 */
@ApplicationScoped
public class Configuration
{
	private Map<String, Properties> properties;

	@PostConstruct
	private void init()
	{
		this.properties = new HashMap<>();
	}

	@Produces
	@ConfigVariable
	public String getStringEnv(InjectionPoint ip)
	{
		ConfigVariable metaData = ip.getAnnotated().getAnnotation(ConfigVariable.class);
		return System.getenv().get(metaData.value());
	}

	@Produces
	@ConfigVariable
	public int getIntEnv(InjectionPoint ip)
	{
		String env = this.getStringEnv(ip);
		return Integer.parseInt(env);
	}

	@Produces
	public Properties getProperties(InjectionPoint ip)
	{
		final Properties toReturn = new Properties();

		String key = ip.getAnnotated().getAnnotation(ConfigVariable.class).value();
		Properties props = this.properties.computeIfAbsent(key, path -> {
			try
			{
				Properties loadedProps = new Properties();
				loadedProps.load(Configuration.class.getResourceAsStream(path));
				return loadedProps;
			}
			catch (IOException e) { throw new IllegalStateException(e); }
		});

		toReturn.putAll(props);
		return toReturn;
	}
}
