package com.memory.gof.observer;

/**
 * @author MemoRyAxis
 * @todo Observer : change status or update via observable object
 * @date 2014/8/18 1:18
 */
public interface MailBox {

    void update(String content);
}
