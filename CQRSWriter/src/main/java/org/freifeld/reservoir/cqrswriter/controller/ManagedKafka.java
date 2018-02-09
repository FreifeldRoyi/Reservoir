package org.freifeld.reservoir.cqrswriter.controller;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.freifeld.reservoir.cqrswriter.controller.configuration.ConfigVariable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.util.Properties;

/**
 * @author royif
 * @since 24/01/18.
 */
@ApplicationScoped
public class ManagedKafka
{
	@Inject
	@ConfigVariable("META-INF/kafka.properties")
	private Properties props;

	private KafkaProducer kafkaProducer;

	private String topic;

	@PostConstruct
	private void init()
	{
		this.topic = this.props.getProperty("topics.raw");
		//this.kafkaProducer = new KafkaProducer(this.props);
	}

	@PreDestroy
	public void stop()
	{
		//this.kafkaProducer.close();
	}

	@Produces
	public KafkaProducer kafkaProducerExposer()
	{
		return this.kafkaProducer;
	}
}
