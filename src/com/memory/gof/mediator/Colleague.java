package com.memory.gof.mediator;

/**
 * @author MemoRyAxis
 * @todo Colleague
 * @date 2014/8/18 14:34
 */
public abstract class Colleague {

    private Mediator mediator;

    public void publishTask(String request) {
        System.out.println("request | " + request);
    }

    public void receiveTask(String response) {
        System.out.println("response | " + response);
    }
}
