package org.freifeld.reservoir.cqrswriter.controller;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.KafkaException;
import org.apache.kafka.common.errors.ProducerFencedException;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.freifeld.reservoir.cqrswriter.entity.ReservoirEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Properties;
import java.util.UUID;

/**
 * @author royif
 * @since 24/01/18.
 */
@ApplicationScoped
public class ReservoirEventProducer
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ReservoirEventProducer.class);

	//	@Inject
	//	@ConfigProperty()
	private Properties props;

	private Producer<UUID, ReservoirEvent> kafkaProducer;

	@Inject
	@ConfigProperty(name = "kafka.topics.raw")
	private String topic;

	//	@PostConstruct
	private void init()
	{
		LOGGER.info("Initializing KAFKA producer");
		//		this.topic = this.props.getProperty("topics.raw");
		//		this.kafkaProducer = new KafkaProducer<>(this.props);
		LOGGER.info("Successfully initialized KAFKA producer");
	}

	public void publish(ReservoirEvent event)
	{
		ProducerRecord<UUID, ReservoirEvent> record = new ProducerRecord<>(this.topic, event);
		try
		{
			this.kafkaProducer.beginTransaction();
			LOGGER.info("Publishing raw record: {}", record);
			this.kafkaProducer.send(record);
			this.kafkaProducer.commitTransaction();
		}
		catch (ProducerFencedException e)
		{
			LOGGER.error("An exception occurred while trying to publish a message to KAFKA. Closing producer...", e);
			this.kafkaProducer.close();
		}
		catch (KafkaException e)
		{
			LOGGER.error("An exception occurred while trying to publish a message to KAFKA. Aborting transaction...", e);
			this.kafkaProducer.abortTransaction();
		}
	}

	//	@PreDestroy
	private void close()
	{
		LOGGER.info("Destroying ReservoirEventProducer. Closing KAFKA producer");
		//		this.kafkaProducer.close();
	}

}
