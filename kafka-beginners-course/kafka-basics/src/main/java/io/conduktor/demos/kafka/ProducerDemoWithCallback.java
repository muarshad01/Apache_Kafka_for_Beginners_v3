package io.conduktor.demos.kafka;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class ProducerDemoWithCallback {

    private final static Logger log = LoggerFactory.getLogger(ProducerDemoWithCallback.class.getSimpleName());

    public static void main(String[] args) {
        log.info("I'm a a Kafka Producer");

        // connect to Local host
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
        properties.setProperty("batch.size", "400");

        // create Producer properties
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", StringSerializer.class.getName());

        properties.setProperty("batch.size", "400");
        properties.setProperty("partitioner.class", RoundRobinPartitioner.class.getName());


        // create the Producer
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 30; i++) {
                // create a Producer Record
                ProducerRecord<String, String> producerRecord = new ProducerRecord<>("demo_java", "Hello World!" + i);

                // send data
                producer.send(producerRecord, new Callback() {
                    @Override
                    public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                        if (e == null) {
                            log.info("Received new metadata \n" +
                                    "Topic: " + recordMetadata.topic() + "\n" +
                                    "Partition: " + recordMetadata.partition() + "\n" +
                                    "Offset: " + recordMetadata.offset() + "\n" +
                                    "Timestamp: " + recordMetadata.timestamp());
                        } else {
                            log.error("Error while producing", e);
                        }
                    }
                });
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        // tell the producer to send all data and block until done - synchronous
        producer.flush();

        // flush and close the Producer
        producer.close();
    }
}
