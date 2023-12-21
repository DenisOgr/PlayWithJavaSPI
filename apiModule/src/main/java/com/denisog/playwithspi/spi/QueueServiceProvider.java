package com.denisog.playwithspi.spi;

import com.denisog.playwithspi.api.QueueService;

public interface QueueServiceProvider {
    public QueueService create(String url);

    public boolean canUseUrl(String url);
}
