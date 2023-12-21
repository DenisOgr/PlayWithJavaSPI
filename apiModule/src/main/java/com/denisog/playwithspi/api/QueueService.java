package com.denisog.playwithspi.api;

public interface QueueService {
    public void enqueue(QueueMessage q);

    public QueueMessage dequeue();
}
