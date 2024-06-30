package io.conduktor.demos.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ConsumerDemo {

    private final static Logger log = LoggerFactory.getLogger(ProducerDemo.class.getSimpleName());

    public static void main(String[] args) {
        log.info("I'm a a Kafka Producer");

        String groudId = "my-java-application";
        String topic = "demo_java";

        // connect to Local host
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "127.0.0.1:9092");

        // create Producer properties
        properties.setProperty("key.deserializer", StringDeserializer.class.getName());
        properties.setProperty("value.deserializer", StringDeserializer.class.getName());
        properties.setProperty("group.id", groudId);
        properties.setProperty("auto.offset.reset", "earliest");

                // create the consumer
                KafkaConsumer < String, String > consumer = new KafkaConsumer<>(properties);

        // subscribe to a topic
        consumer.subscribe(Arrays.asList(topic));

        // pool for date
        while (true) {
            log.info("Polling");

            // create a Producer Record
            ConsumerRecords<String, String> records =
                    consumer.poll(Duration.ofMillis(1000));

            for (ConsumerRecord<String, String> record : records) {
                log.info("Key: " + record.key() + ", Value: " + record.value());
                log.info("Partition: " + record.partition() + ", Value: " + record.offset());
            }

        }
    }
}
