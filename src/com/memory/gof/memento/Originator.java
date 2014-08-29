package com.memory.gof.memento;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/29 17:10
 */
public class Originator {

    private int state;
    private String data;
    private Caretaker caretaker;

    public Originator() {
        caretaker = new Caretaker();
    }

    public void recover(Memento memento) {
        this.state = memento.getState();
        this.data = memento.getData();
    }

    public Memento save() {
        return new Memento(state, data);
    }

    public void print() {
        System.out.println("State: " + state + "\nData: " + data);
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

    public Caretaker getCaretaker() {
        return caretaker;
    }
}

