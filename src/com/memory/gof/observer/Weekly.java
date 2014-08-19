package com.memory.gof.observer;

import java.util.ArrayList;
import java.util.List;
/**
 * @author MemoRyAxis
 * @todo Concrete Subject
 * @date 2014/8/18 1:17
 */
public class Weekly implements Service{

    List<MailBox> users;

    public Weekly() {
        users = new ArrayList<MailBox>();
    }

    @Override
    public void addUser(MailBox user) {
        users.add(user);
    }

    @Override
    public void removeUser(MailBox user) {
        users.remove(user);
    }

    @Override
    public void notifyUsers(String title) {
        for(int i = 0; i < users.size(); i ++) {
            users.get(i).update(users.get(i) + " | " + title);
        }
    }
}
