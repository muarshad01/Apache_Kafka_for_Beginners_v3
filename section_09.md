## 43. Kafka SDK List
* https://www.conduktor.io/kafka/kafka-sdk-list/
  
***

## 44. Creating Kafka Project

### Create Project
* `IntelliJ`: File > New > Project
    * Gradle, Java, JDK 11
* Name
    * `kafka-beginners-course`
* Advanced Settings
    * GroupId: `io.conduktor.demos`
    * ArtifactId: `kafka-beginners-course`
* Delete
    * `src/main`
    * `src/test`
* File > New > Module
    * Java, Gradle, JDK11
* Name
    * `kafka-basics`
* Advanced Settings
    * GroupId: `io.conduktor.demos`
    * ArtifactId: `kafka-basics`

### Add Dependencis
* [Kafka Maven](https://mvnrepository.com/artifact/org.apache.kafka)
    * [kafka-clients](https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients) -> choose `Gradle (short)`
    * [SLF4J API](https://mvnrepository.com/artifact/org.slf4j/slf4j-api) -> choose `Gradle (short)`
    * [SLF4J Simple](https://mvnrepository.com/artifact/org.slf4j/slf4j-simple) -> choose `Gradle (short)`

* Load `Gradle`

### Create Java Class
* Java Class - `io.conduktor.demos.kafka.ProducerDemo`

### Settings
* IntelliJ > Settings > `Build, Execution, Deployment`
    * BuildTools
        * Gradle
            * Build and run using: `IntelliJ IDEA`
            * Run tests using: `Gradle`
      

### External Libraries not Showing Up
* [Getting Gradle dependencies in IntelliJ IDEA using Gradle build](https://stackoverflow.com/questions/27694442/getting-gradle-dependencies-in-intellij-idea-using-gradle-build)
    * 1 - Delete `.idea` directory from my project folder.
    * 2 - Reopen IntelliJ and `import the project again (as Gradle)`.
    * 3 - After the above, any new gradle dependency I added to `build.gradle` started appearing in External Dependencies section when I clicked the gradle refresh button.

***

## 45. Java Producer

```bash
$ source ~/.bash_profile
$ kafka-beginners-course % zookeeper-server-start.sh ~/kafka_2.13-3.7.0/config/zookeeper.properties

$ source ~/.bash_profile
$ kafka-server-start.sh ~/kafka_2.13-3.7.0/config/server.properties

$ source ~/.bash_profile
$ kafka-topics.sh --bootstrap-server localhost:9092 --topic demo_java --create --partitions 3
$ kafka-topics.sh --bootstrap-server localhost:9092 --topic demo_java --describe
```


```bash
$ source ~/.bash_profile
$ kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic demo_java    
```

***

## 46. Java Producer Callbacks

***

## 47. Java Producer with Keys

***

## 48. Java Consumer

***

## 49. Java Consumer - Graceful Shutdown

***

## 50. Java Consumer inside Consumer Group

***

## 51. Java Consumer Incremental Cooperative Rebalance & Static Group Membership
* Eager Rebalance (Stop-the-world events)
* Cooperative Rebalance
  
***

## 52. Java Consumer Incremental Cooperative Rebalance - Practice

***

## 53. Java Consumer Auto Offset Commit Behavior

***

## 54. Programming - Advanced Tutorials
* https://www.conduktor.io/kafka/java-kafka-programming/
* https://www.conduktor.io/kafka/advanced-kafka-consumer-with-java/
  
***
