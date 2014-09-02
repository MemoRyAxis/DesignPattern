package com.memory.gof.glossary;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/9/1 16:10
 */
public enum LiftState {

    LIFTRUNNING(1, "running"),
    LIFTSTOP(2, "stop"),
    LIFTOPEN(3, "open"),
    LIFTCLOSE(4, "close");

//    LIFTUP(5, "LIFTUP"),
//    LIFTDOWN(6, "LIFTDOWN"),

    private final int value;
    private final String displayName;

    LiftState(int value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }
}
