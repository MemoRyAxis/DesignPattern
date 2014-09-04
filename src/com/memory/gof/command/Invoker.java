package com.memory.gof.command;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/9/2 17:46
 */
public class Invoker {

    private Shortcut shortcut;

    public void setShortcut(Shortcut shortcut) {
        this.shortcut = shortcut;
    }

    public void invoke() {
        this.shortcut.execute();
    }
}
