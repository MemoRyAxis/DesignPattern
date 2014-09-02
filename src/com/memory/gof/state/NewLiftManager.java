package com.memory.gof.state;

import com.memory.gof.glossary.LiftState;

/**
 * @author MemoRyAxis
 * @todo Context
 * @date 2014/9/1 17:24
 */
public class NewLiftManager {

    private NewLift lift;
    private LiftState state;

    public NewLiftManager(NewLift lift) {
        this.lift = lift;
        this.state = LiftState.LIFTCLOSE;
    }

    public void open() {
        lift.open();
    }

    public void close() {
        lift.close();
    }


    public static void main(String[] args) {
        NewLiftManager manager = new NewLiftManager(new LiftOpen());
        manager.open();

        manager = new NewLiftManager(new LiftClose());
        manager.close();
    }
}
