package com.memory.gof.flyweight;

/**
 * @author MemoRyAxis
 * @todo Concrete Flyweight(core) : intrinsic state shared with others is immutable external state is custom
 * @date 2014/8/25 10:26
 */
public class ConcreteFlyweight implements Flyweight {

    private String intrinsic;

    public ConcreteFlyweight(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    @Override
    public void operation(String external) {
        System.out.println(intrinsic + " | " + external);
    }
}
