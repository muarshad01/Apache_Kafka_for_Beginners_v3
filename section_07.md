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

***

## 38. Kafka Console Consumer CLI

***

## 39. Kafka Consumers in Group

***

## 40. Kafka Consumer Groups CLI

***

## 41. Resetting Offsets

***
