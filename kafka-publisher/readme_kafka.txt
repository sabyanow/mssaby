# kafka-publisher
Apache Kafka Publisher Example using SpringBoot

# start zookeeper.start bat file like below
zookeeper-server-start.bat D:\kafka_2.13-2.8.1\config\zookeeper.properties

# start kafka server
kafka-server-start.bat D:\kafka_2.13-2.8.1\config\server.properties

# Create Topic:
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic javatechie

# Produce a message 
kafka-console-producer.bat --broker-list localhost:9092 --topic javatechie

# Consume a message
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic javatechie