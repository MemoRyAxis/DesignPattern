package com.memory.gof.facade;

/**
 * @author MemoRyAxis
 * @todo client
 * @date 2014/8/10 3:03
 */
public class Deploy {
    public static void main(String[] args) {
        new WebProject().request(new MVC());
    }
}
