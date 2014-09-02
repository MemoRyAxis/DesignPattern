package com.memory.gof.state;

/**
 * @author MemoRyAxis
 * @todo State & Concrete State
 * @date 2014/9/2 10:08
 */
public interface VoteState {

    void vote(String voter, String elector, VoteManager manager);
}

class VoteStateNormal implements VoteState {

    @Override
    public void vote(String voter, String elector, VoteManager manager) {

    }
}

class VoteStateOver implements VoteState {

    @Override
    public void vote(String voter, String elector, VoteManager manager) {

    }
}