package com.memory.gof.observer;

/**
 * @author MemoRyAxis
 * @todo Concrete Observer
 * @date 2014/8/18 1:20
 */
public class GMail implements MailBox{

    @Override
    public void update(String content) {
        System.out.println(content);
    }
}
