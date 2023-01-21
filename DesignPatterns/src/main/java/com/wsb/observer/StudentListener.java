package com.wsb.observer;

public class StudentListener implements EventListener{

    private String topic;
    @Override
    public void update(String eventType, String topic) {
        System.out.println("Recived topic from teacher: " + topic);
    }
}
