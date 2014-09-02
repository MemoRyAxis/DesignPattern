package com.memory.gof.state;

import com.memory.gof.glossary.LiftState;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/9/1 16:28
 */
public class LiftImpl implements Lift {

    private LiftState state;

    public LiftImpl(LiftState state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.getState()) {
            case LIFTCLOSE:
                this.setState(LiftState.LIFTOPEN);
                break;
            case LIFTOPEN:
            case LIFTRUNNING:
            case LIFTSTOP:
                break;
        }
    }

    @Override
    public void close() {
        switch (this.getState()) {
            case LIFTOPEN:
                this.setState(LiftState.LIFTCLOSE);
                break;
            case LIFTSTOP:
            case LIFTRUNNING:
            case LIFTCLOSE:
                break;
        }
    }

    @Override
    public void run() {
        //...
    }

    @Override
    public void stop() {
        //...
    }

    public LiftState getState() {
        return state;
    }

    public void setState(LiftState state) {
        this.state = state;
    }
}
