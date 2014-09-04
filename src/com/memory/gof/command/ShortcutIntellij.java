package com.memory.gof.command;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/9/2 17:44
 */
public class ShortcutIntellij implements Shortcut {

    private OS os = null;

    public ShortcutIntellij(OS os) {
        this.os = os;
    }

    @Override
    public void execute() {
        os.action();
    }
}
