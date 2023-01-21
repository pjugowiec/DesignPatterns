package com.wsb.observer;

public interface EventListener {
    void update(String eventType, String topic);
}
