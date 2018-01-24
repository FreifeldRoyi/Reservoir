package org.freifeld.reservoir.cqrsWriter;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.freifeld.reservoir.cqrsWriter.boundary.ComplexEntityWriteResource;
import org.freifeld.reservoir.cqrsWriter.controller.healthcheck.BasicHealthCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author royif
 * @since 12/01/18.
 */
public class InboundService extends Application<RESTConfiguration>
{
	private static final Logger LOG = LoggerFactory.getLogger(InboundService.class);

	public static void main(String[] args) throws Exception
	{
		new InboundService().run(args);
	}

	@Override
	public String getName()
	{
		return "InboundService";
	}

	@Override
	protected void onFatalError()
	{
		LOG.error("Something wen't terribly wrong. Closing...");
		System.exit(-1);
	}

	@Override
	public void run(RESTConfiguration configuration, Environment environment) throws Exception
	{
		ComplexEntityWriteResource writeResource = new ComplexEntityWriteResource();
		environment.jersey().register(writeResource);

		BasicHealthCheck healthCheck = new BasicHealthCheck();
		environment.healthChecks().register("basic", healthCheck);
	}
}
