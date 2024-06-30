package io.conduktor.demos.kafka;

import org.apache.kafka.clients.consumer.ConsumerGroupMetadata;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.*;
import org.apache.kafka.common.errors.ProducerFencedException;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Future;

public class ProducerDemo {

    private final static Logger log = LoggerFactory.getLogger(ProducerDemo.class.getSimpleName());

    public static void main(String[] args) {
        log.info("I'm a a Kafka Producer");

        // connect to Local host
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "127.0.0.1:9092");

        // create Producer properties
        properties.setProperty("key.serializer",   StringSerializer.class.getName());
        properties.setProperty("value.serializer", StringSerializer.class.getName());

        // create the Producer
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        // create a Producer Record
        ProducerRecord<String, String> producerRecord =
                new ProducerRecord<>("demo_java", "Hello World!");

        // send data
        producer.send(producerRecord);

        // tell the producer to send all data and block until done - synchronous
        producer.flush();

        // flush and close the Producer
        producer.close();
    }
}
