package com.memory.gof.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/29 17:10
 */
public class Caretaker {

    Map<String, Memento> savedList;

    public Caretaker() {
        savedList = new HashMap<String, Memento>();
    }

    public void save(String saveName, Memento memento) {
        savedList.put(saveName, memento);
    }

    public Memento restore(String saveName) {
        return savedList.get(saveName);
    }
}
