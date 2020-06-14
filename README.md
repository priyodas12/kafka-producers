# kafka-producers
Kafka Server Start cmd:

Open new cmd:

Start Zookeeper:
===============
open new cmd:

C:\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Zookeeper will start at below default port:

[2020-06-14 17:14:27,890] INFO binding to port 0.0.0.0/0.0.0.0:2181 (org.apache.zookeeper.server.NIOServerCnxnFactory)

Start Kafka Server:
==================
open new cmd:

C:\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

Kafka Server will start port:

[2020-06-14 17:17:08,907] INFO Awaiting socket connections on 0.0.0.0:9092. (kafka.network.Acceptor)


Create Kafka Topic:
===================

C:\kafka>.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic TestTopic2
        

Created topic TestTopic2.

See list of Topics:
==================

C:\kafka>.\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181
TestNewTopic
TestTopic
TestTopic2

Add Message to a Topic:
=======================
C:\kafka>.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic TestTopic2

>Abcd
>defg
>kajsja

Get All Topics created with a consumer:
======================================

C:\kafka>.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic TestTopic --from-beginning
