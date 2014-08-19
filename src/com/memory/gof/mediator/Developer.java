package com.memory.gof.mediator;

/**
 * @author MemoRyAxis
 * @todo Concrete Colleague
 * @date 2014/8/18 14:51
 */
public class Developer extends Colleague {

    private Mediator mediator;

    public Developer(Mediator mediator) {
        this.mediator = mediator;
    }
}
