## 30. Note: try out Kafka KRaft

***

## 31. Mac OS X - Start Kafka in KRaft mode
* https://www.conduktor.io/kafka/how-to-install-apache-kafka-on-mac-without-zookeeper-kraft-mode/

***

## 32. Linux - Start Kafka in KRaft mode

```bash
$ kafka-storage.sh random-uuid
``` 

```bash
$ kafka-storage.sh format -t <uuid> -c ~/kafka_2.13-3.7.0/config/kraft/server.properties
```

```bash
$ kafka-server-start.sh ~/kafka_2.13-3.7.0/config/kraft/server.properties
```

***

## 33. Windows WSL2 - Start Kafka in KRaft mode

***
