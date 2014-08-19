package com.memory.gof.observer;

/**
 * @author MemoRyAxis
 * @todo Subject : interface of observable object
 * @date 2014/8/18 1:13
 */
public interface Service {

    void addUser(MailBox user);

    void removeUser(MailBox user);

    void notifyUsers(String title);
}
