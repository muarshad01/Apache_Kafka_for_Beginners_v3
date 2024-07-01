## 17. Important: Starting Kafka & Lectures Order
* https://www.conduktor.io/kafka/starting-kafka/
  
***

## 18. FAQ for Setup Problems

***

## 19. Starting Kafka with Conduktor - Multi Platform

***

## 20. MAC OS X - Download and Setup Kafka in PATH
* https://www.conduktor.io/kafka/how-to-install-apache-kafka-on-mac/

```
# ---------
# JAVA_HOME
# ---------
unset JAVA_HOME
# export JAVA_HOME=/usr/libexec/java_home
export JAVA_HOME=~/blt/tools/Darwin/jdk/openjdk_11.0.14.1_11.54.26_x64
export PATH=$PATH:$JAVA_HOME/bin

# --------
# KAFKA
# --------
export KAFKA_HOME=~/kafka_2.13-3.7.0
export PATH=$PATH:$KAFKA_HOME/bin
```

***

## 21. Mac OS X - Start Zookeeper and Kafka

### Start Zookeeper
```bash
$ zookeeper-server-start.sh ~/kafka_2.13-3.7.0/config/zookeeper.properties
```

### Start Kafka
```bash
kafka-server-start.sh ~/kafka_2.13-3.7.0/config/server.properties
```

***

## 22. Mac OS X - Using brew

```bash
$ https://www.conduktor.io/kafka/how-to-install-apache-kafka-on-mac-with-homebrew/
```

***

## 23. Linux - Download and Setup Kafka in PATH

***

## 24. Linux - Start Zookeeper and Kafka

***

## 25. Windows WSL2 - Download Kafka and PATH Setup

***

## 26. Windows WSL2 - Start Zookeeper & Kafka

***

## 27. Windows WSL2 - How to Fix Problems

***

## 28. Windows WSL2 - Extra Instructions

***
## 29. Windows non-WSL2 - Start Zookeeper and Kafka***
