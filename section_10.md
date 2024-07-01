
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

$ kafka-configs          --bootstrap-server localhost:9092 --entity-type topics --entity-name configured-topic --describe

$ kafka-configs          --bootstrap-server localhost:9092 --entity-type topics --entity-name configured-topic --alter --add-config min.insync.replicas=2

$ kafka-configs          --bootstrap-server localhost:9092 --entity-type topics --entity-name configured-topic --alter --delete-config min.insync.replicas
```

## Segment and Indexes
* Topic = {P1, P2, ..., P_n}
* Partion = {S1, S2, ..., S_m}
* A smaller `log.segment.bytes` means:
  * More segments per partition
  * Log compaction happens more often
  * MUT Kafka must keep more files open
  * __ASK YOURSELF__: How fast will I've new segments based on throughput? 
* A smaller `log.segment.ms` means:
  * You set a max frequency for log compaction (more frequent triggers)
  * Maybe you want daily compaction insted of weekly?
  * __ASK YOURSELF__: How often do I need log compaction to happen?
