package com.memory.gof.bridge;

/**
 * @author MemoRyAxis
 * @todo Concrete Implementor
 * @date 2014/8/10 23:26
 */
public class IntelliJ implements IDE {

    @Override
    public void useIDE() {
        System.out.println("useIDE : IntelliJ");
    }
}
