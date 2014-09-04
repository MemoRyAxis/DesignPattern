package com.memory.gof.strategy;

/**
 * @author MemoRyAxis
 * @todo Concrete Strategy : concretion of algorithms, they are interchangeable
 * @date 2014/9/2 16:44
 */
public class Android implements JobHunt {
    @Override
    public void getSkill() {
        System.out.println("1. Java");
        System.out.println("2. Android SDK");
        System.out.println("3. app");
    }
}
