# KafkaBasicPubSub
Project gives you an aspect of basic publisher - subscriber model with Kafka for String and Json message

Starting Zookeper Server:- zkserver

Starting Kafka Server:- .\bin\windows\kafka-server-start.bat .\config\server.properties

Creating Kafka Topic :- kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic myTopic

Starting Publisher:- kafka-console-producer.bat --broker-list localhost:9092 --topic myTopic

Starting Consumer:- kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic myStringTopic

Listing All topics:- kafka-topics.bat --list --zookeeper localhost:2181
