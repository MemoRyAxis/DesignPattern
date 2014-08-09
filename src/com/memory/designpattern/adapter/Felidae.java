package com.memory.designpattern.adapter;

/**
 * @author MemoRyAxis
 * @todo Adapter(core) : convert adaptee to target
 * @date 2014/8/10 2:17
 */
public abstract class Felidae implements Tiger {

    public abstract void eatFish();

    public abstract void climbTree();

    @Override
    public void eatMeet() {

    }

    @Override
    public void hunt() {

    }
}
