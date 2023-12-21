package com.denisog.playwithspi.rabbimq;
import com.denisog.playwithspi.api.QueueMessage;
import com.denisog.playwithspi.api.QueueService;

public class RabbitMQQueueService implements QueueService{
    public RabbitMQQueueService(){
        System.out.println("Initialize RabbitMQ service.");
    }
    @Override
    public void enqueue(QueueMessage q) {
        System.out.printf("Enqueue message '%s' to RabbitMQ service.%n", q);
    }

    @Override
    public QueueMessage dequeue() {
        System.out.println("Dequeue message from RabbitMQ service.");
        return null;
    }
}
