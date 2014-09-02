package com.memory.gof.template;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/9/1 15:17
 */
public class Workday {

    public static void main(String[] args) {

        Worker offical = new Offical();
        offical.aDay();
        System.out.println();
        Worker coder = new Coder();
        coder.aDay();
    }
}
