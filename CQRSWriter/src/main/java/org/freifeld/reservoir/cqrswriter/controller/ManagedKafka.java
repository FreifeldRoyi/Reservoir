package org.freifeld.reservoir.cqrswriter.controller;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.freifeld.reservoir.cqrswriter.controller.configuration.ConfigVariable;
import org.freifeld.reservoir.cqrswriter.entity.ReservoirEvent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
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

	private KafkaProducer<String, ReservoirEvent> kafkaProducer;

	private String topic;

	@PostConstruct
	private void init()
	{
		this.topic = this.props.getProperty("topics.raw");
		this.kafkaProducer = new KafkaProducer<>(this.props);
	}

	public void publish(ReservoirEvent event)
	{
		ProducerRecord<String, ReservoirEvent> record = new ProducerRecord<>(this.topic, event);
//		try
//		{
////			this.kafkaProducer.
//		}
	}

	@PreDestroy
	private void stop()
	{
		this.kafkaProducer.close();
	}

}
