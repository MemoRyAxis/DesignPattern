package com.memory.gof.flyweight;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/25 10:45
 */
public class Client {
    public static void main(String[] args) {

        FlyweightFactory.clear();
        FlyweightFactory.getAll();

        Flyweight f1 = FlyweightFactory.getFlyweight("in1");
        f1.operation("out1");

        f1 = FlyweightFactory.getFlyweight("in2");
        f1.operation("out2");

        Flyweight f2 = FlyweightFactory.getFlyweight("in1");
        f2.operation("out3");

        f2 = FlyweightFactory.getFlyweight("in2");
        f2.operation("out4");

        Flyweight f3 = FlyweightFactory.getFlyweight("in2");
        f3.operation("out5");

        f3 = FlyweightFactory.getFlyweight("in1");
        f3.operation("out6");

        FlyweightFactory.getAll();
        FlyweightFactory.clear();
        FlyweightFactory.getAll();
    }
}
