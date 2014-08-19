package com.memory.gof.mediator;

/**
 * @author MemoRyAxis
 * @todo Concrete Colleague
 * @date 2014/8/18 14:52
 */
public class QA extends Colleague {

    private Mediator mediator;

    public QA(Mediator mediator) {
        this.mediator = mediator;
    }
}
