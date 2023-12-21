package com.denisog.playwithspi.kafka;

import com.denisog.playwithspi.api.QueueMessage;
import com.denisog.playwithspi.api.QueueService;

public class KafkaQueueService implements QueueService {

    public KafkaQueueService(){
        System.out.println("Initialize Kafka Queue Service");
    }
    @Override
    public void enqueue(QueueMessage q) {
        System.out.printf("Enqueue %s message to Kafka service.%n", q);

    }

    @Override
    public QueueMessage dequeue() {
        System.out.println("Dequeue message form the Kafka service.");
        return null;
    }
}
