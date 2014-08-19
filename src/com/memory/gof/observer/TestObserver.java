package com.memory.gof.observer;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/18 1:29
 */
public class TestObserver {
    public static void main(String[] args) {

        Service infoQ = new Weekly();
        MailBox gMail1 = new GMail();
        MailBox gMail2 = new GMail();

        infoQ.addUser(gMail1);
        infoQ.addUser(gMail2);

        infoQ.notifyUsers("What is AngularJS");
    }
}
