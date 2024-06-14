## 34. CLI Introduction

```bash
$ kafka-topics.sh
```

```bash
$ kafka-topics.sh --bootstrap-server localhost 9092
$ kafka-topics.sh --zookeeper        localhost 2181          # Don't use
```

***

## 35. WINDOWS WARNING: PLEASE READ

***

## 36. Kafka Topics CLI
* Create Kafka Topics
* List Kafka Topics
* Describe Kafka Topics
* Increase Partitions in a Kafka Topics
* Delete Kafka Topics

* File `0-kafka-topics.sh`
```bash
$ kafka-topics.sh 

$ kafka-topics.sh --bootstrap-server localhost:9092 --list 

$ kafka-topics.sh --bootstrap-server localhost:9092 --topic first_topic --create

$ kafka-topics.sh --bootstrap-server localhost:9092 --topic second_topic --create --partitions 3

$ kafka-topics.sh --bootstrap-server localhost:9092 --topic third_topic --create --partitions 3 --replication-factor 2

# Create a topic (working)
$ kafka-topics.sh --bootstrap-server localhost:9092 --topic third_topic --create --partitions 3 --replication-factor 1

# List topics
$ kafka-topics.sh --bootstrap-server localhost:9092 --list 

# Describe a topic
$ kafka-topics.sh --bootstrap-server localhost:9092 --topic first_topic --describe

# Delete a topic 
$ kafka-topics.sh --bootstrap-server localhost:9092 --topic first_topic --delete
# (only works if delete.topic.enable=true)
```
  
***

## 37. Kafka Console Producer CLI
*  File `2-kafka-console-consumer.sh`
```bash
# create a topic with 3 partitions
$ kafka-topics.sh --bootstrap-server localhost:9092 --topic second_topic --create --partitions 3

# consuming
$ kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic second_topic

# other terminal
$ kafka-console-producer.sh --bootstrap-server localhost:9092 --producer-property partitioner.class=org.apache.kafka.clients.producer.RoundRobinPartitioner --topic second_topic

# consuming from beginning
$ kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic second_topic --from-beginning

# display key, values and timestamp in consumer
$ kafka-console-consumer.sh --bootstrap-server localhost:9092
--topic second_topic
--formatter kafka.tools.DefaultMessageFormatter
--property print.timestamp=true
--property print.key=true
--property print.value=true
--property print.partition=true
--from-beginning
```

***

## 38. Kafka Console Consumer CLI

***

## 39. Kafka Consumers in Group

* File `3-kafka-console-consumer-in-groups.sh`

```bash
# create a topic with 3 partitions
$ kafka-topics.sh --bootstrap-server localhost:9092 --topic third_topic --create --partitions 3

# start one consumer
$ kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic third_topic --group my-first-application

# start one producer and start producing
$ kafka-console-producer.sh
--bootstrap-server localhost:9092
--producer-property partitioner.class=org.apache.kafka.clients.producer.RoundRobinPartitioner
--topic third_topic

# start another consumer part of the same group. See messages being spread
$ kafka-console-consumer.sh
--bootstrap-server localhost:9092
--topic third_topic
--group my-first-application

# start another consumer part of a different group from beginning
$ kafka-console-consumer.sh
--bootstrap-server localhost:9092
--topic third_topic
--group my-second-application
--from-beginning
```

***

## 40. Kafka Consumer Groups CLI

***

## 41. Resetting Offsets

***
