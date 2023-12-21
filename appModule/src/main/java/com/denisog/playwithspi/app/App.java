package com.denisog.playwithspi.app;

import com.denisog.playwithspi.QueueServiceLoader;
import com.denisog.playwithspi.api.QueueMessage;
import com.denisog.playwithspi.api.QueueService;
import com.denisog.playwithspi.exceptions.NoQueueServiceProviderImpException;

import java.util.Map;

public class App {
    final static private String URL = "rabbitmq://localhost:1234";
    //final static private String URL = "kafka://localhost:1234";
    public static void main(String[] args) throws NoQueueServiceProviderImpException {
        QueueService service = QueueServiceLoader.byUrl(URL);
        service.enqueue(new QueueMessage("body1", Map.of()));
        service.enqueue(new QueueMessage("body2", Map.of()));
        service.dequeue();
    }

}
