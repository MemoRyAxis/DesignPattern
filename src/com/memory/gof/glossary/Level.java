package com.memory.gof.glossary;

/**
 * @author MemoRyAxis
 * @todo common enum
 * @date 2014/8/21 11:04
 */
public enum Level {
    // level in cor
    LEVEL00(0, "LEVEL00"),
    LEVEL01(1, "LEVEL01"),
    LEVEL02(2, "LEVEL02"),
    LEVEL03(3, "LEVEL03");



    private final int value;
    private final String displayName;

    Level(int value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}

