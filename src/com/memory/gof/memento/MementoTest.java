package com.memory.gof.memento;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/29 17:17
 */
public class MementoTest {

    public static void main(String[] args) {
        Originator or = new Originator();
        or.setState(1);
        or.setData("the way");
        or.print();

        Caretaker ct = new Caretaker();
        ct.save("save1", or.save());

        or.setState(2);
        or.setData("to get away");
        or.print();

        or.recover(ct.restore("save1"));

        or.print();
    }
}
