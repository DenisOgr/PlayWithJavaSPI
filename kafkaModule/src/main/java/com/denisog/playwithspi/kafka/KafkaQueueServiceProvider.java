package com.denisog.playwithspi.kafka;

import com.denisog.playwithspi.api.QueueService;
import com.denisog.playwithspi.spi.QueueServiceProvider;

public class KafkaQueueServiceProvider implements QueueServiceProvider {
    @Override
    public QueueService create(String url) {
        return new KafkaQueueService();
    }

    @Override
    public boolean canUseUrl(String url) {
        return url.toLowerCase().startsWith("kafka");
    }
}
