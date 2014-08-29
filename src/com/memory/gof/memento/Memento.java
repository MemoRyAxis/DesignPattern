package com.memory.gof.memento;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/29 17:10
 */
public class Memento {
    private int state;
    private String data;

    public Memento(int state, String data) {
        this.state = state;
        this.data = data;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
