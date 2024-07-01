
## Changing a Topic Configuration
* Some topics may need different values by defaults
  * Replication factor
  * \# Partitions
  * Message size
  * Compression level
  * Log cleanup policy
  * min InSync Replicas (ISR)
  * Other configurations
  * https://kafka.apache.org/documentation/#brokerconfigs

```bash
$ kafka-topics --create --bootstrap-server localhost:9092 --topic configured-topic --replication-factor 1 --partitions 3

$ kafka-topics          --bootstrap-server localhost:9092 --topic configured-topic --describe

$ kafka-topics          --bootstrap-server localhost:9092 --entity-type topics --entity-name configured-topic --describe

$ kafka-topics          --bootstrap-server localhost:9092 --entity-type topics --entity-name configured-topic --alter --add-config min.insync.replicas=2

$ kafka-topics          --bootstrap-server localhost:9092 --entity-type topics --entity-name configured-topic --alter --delete-config min.insync.replicas
```
``
