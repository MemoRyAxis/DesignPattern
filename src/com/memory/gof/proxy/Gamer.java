package com.memory.gof.proxy;

/**
 * @author MemoRyAxis
 * @todo Subject : interface
 * @date 2014/8/19 0:37
 */
public interface Gamer {

    boolean levelup();

    boolean getEquipment();

    boolean pk(Gamer gamer);

    Gamer getProxy();
}
