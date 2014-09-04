package com.memory.gof.command;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/9/2 17:52
 */
public class User {

    public static void main(String[] args) {
        Shortcut shortcut = new ShortcutIntellij(new OS());

        Invoker invoker = new Invoker();
        invoker.setShortcut(shortcut);

        invoker.invoke();
    }
}
