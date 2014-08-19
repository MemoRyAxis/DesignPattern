package com.memory.gof.mediator;

/**
 * @author MemoRyAxis
 * @todo Concrete Mediator(core) : deal with relationship and action of colleagues
 * @date 2014/8/18 14:44
 */
public class TeamLeader extends Mediator {

    private Colleague dev;
    private Colleague qa;

    public TeamLeader() {
        dev = new Developer(this);
        qa = new QA(this);
    }

    @Override
    public void distributeTask() {
        dev.publishTask("finally, this module is complete.");
        qa.receiveTask("aha, i've been missing u for a long time");
    }


    public static void main(String[] args) {
        new TeamLeader().distributeTask();
    }
}
