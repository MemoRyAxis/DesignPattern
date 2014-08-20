package com.memory.gof.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author MemoRyAxis
 * @todo InvocationHandler & Proxy
 * @date 2014/8/19 16:39
 */
public class Play {
    public static void main(String[] args) {
        Gamer p1 = new GamePlayer("Tom");
        InvocationHandler handler = new GameProxy(p1);
        Gamer proxy = (Gamer) Proxy.newProxyInstance(p1.getClass().getClassLoader(), new Class[]{Gamer.class}, handler);

        // achieve GameProxy effect but haven't concreted GameProxy nor concreted Gamer

        proxy.loginin();
        proxy.levelup();
        proxy.loginout();
    }
}
