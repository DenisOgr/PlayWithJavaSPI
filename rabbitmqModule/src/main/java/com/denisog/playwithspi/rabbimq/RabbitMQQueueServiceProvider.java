package com.denisog.playwithspi.rabbimq;

import com.denisog.playwithspi.api.QueueService;
import com.denisog.playwithspi.spi.QueueServiceProvider;

public class RabbitMQQueueServiceProvider implements QueueServiceProvider {
    @Override
    public QueueService create(String url) {
        return new RabbitMQQueueService();
    }

    @Override
    public boolean canUseUrl(String url) {
        return url.toLowerCase().startsWith("rabbitmq");
    }
}
