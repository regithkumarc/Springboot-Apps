
Kafka Implementation :-

1) Need to download kafka from this folder - https://kafka.apache.org/downloads.html - (Scala 2.12  - kafka_2.12-3.6.0.tgz (asc, sha512))
2) Create Spring boot app and create producer and create the topic to send a message
3) After create need to consume the message using - @KafkaListener(topics = "kafka_topic", groupId = "group_id")
4) Need to add below code in application.yml file

application.yml :-

spring:
  kafka:
    consumer:
      bootstrap-servers: localhost:9092
      group-id: group_id
      auto-offset-reset: earliest
      key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
      value-deserializer: org.apache.kafka.common.serialization.StringDeserializer
    producer:
      bootstrap-servers: localhost:9092
      key-serializer: org.apache.kafka.common.serialization.StringSerializer
      value-serializer: org.apache.kafka.common.serialization.StringSerializer


5) above code is for convert message string to serialize and deserialize

6) then will start the spring boot app
7) Will get the exception like "Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected"
8) Then Need to start zookeeper and kafka server using the below comments
9) go to the below folder

Start Zookeeper :-

E:\Regith\Software\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start Kafka server :-

E:\Regith\Software\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

10) After Starting the server it will not through any error we can get the message

URL :-

http://localhost:8084/KafkaController/publishMessage

Output :-

Kafka message
