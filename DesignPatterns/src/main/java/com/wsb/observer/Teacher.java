package com.wsb.observer;

public class Teacher {
    public EventManager events;
    private String topic;

    public Teacher() {
        this.events = new EventManager("open", "topic");
    }

    public void putTopic() {
        events.notify("topic", topic);
    }

}
