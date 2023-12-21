package com.denisog.playwithspi.api;

import java.util.Map;

public class QueueMessage {
    private final String body;
    private final Map<String,String> meta;

    public QueueMessage(String body, Map<String, String> meta) {
        this.body = body;
        this.meta = meta;
    }

    public String getBody() {
        return body;
    }

    public Map<String, String> getMeta() {
        return meta;
    }
}
