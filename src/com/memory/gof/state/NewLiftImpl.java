package com.memory.gof.state;

/**
 * @author MemoRyAxis
 * @todo Concrete State
 * @date 2014/9/1 17:23
 */
public class NewLiftImpl implements NewLift {
    @Override
    public void open() {
    }

    @Override
    public void close() {
    }
}

class LiftOpen implements NewLift {
    @Override
    public void open() {
        System.out.println("it's open already");
    }

    @Override
    public void close() {
        System.out.println("open...");
    }
}

class LiftClose implements NewLift {
    @Override
    public void open() {
        System.out.println("close...");
    }

    @Override
    public void close() {
        System.out.println("...");
    }
}
