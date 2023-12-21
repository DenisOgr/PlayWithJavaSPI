package com.denisog.playwithspi;

import com.denisog.playwithspi.api.QueueService;
import com.denisog.playwithspi.exceptions.NoQueueServiceProviderImpException;
import com.denisog.playwithspi.spi.QueueServiceProvider;

import java.util.Iterator;
import java.util.ServiceLoader;

public class QueueServiceLoader {
    public static QueueService byUrl(String url) throws NoQueueServiceProviderImpException {
        ServiceLoader<QueueServiceProvider> providers = ServiceLoader.load(QueueServiceProvider.class);
        Iterator<QueueServiceProvider> providerIterator = providers.iterator();
        while(providerIterator.hasNext()){
            QueueServiceProvider provider = providerIterator.next();
            if(provider.canUseUrl(url)){
                return provider.create(url);
            }
        }
        throw new NoQueueServiceProviderImpException("Service provider for '"+ url+ "' not found.");
    }
}
