package com.memory.gof.strategy;

/**
 * @author MemoRyAxis
 * @todo Concrete Strategy : concretion of algorithms, they are interchangeable
 * @date 2014/9/2 16:45
 */
public class IOSer implements JobHunt {
    @Override
    public void getSkill() {
        System.out.println("apple~");
    }
}
