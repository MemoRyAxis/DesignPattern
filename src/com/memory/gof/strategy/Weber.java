package com.memory.gof.strategy;

/**
 * @author MemoRyAxis
 * @todo Concrete Strategy : concretion of algorithms, they are interchangeable
 * @date 2014/9/2 16:39
 */
public class Weber implements JobHunt {
    @Override
    public void getSkill() {
        System.out.println("1. Java EE");
        System.out.println("2. Spring");
        System.out.println("3. Javascript");
    }
}
