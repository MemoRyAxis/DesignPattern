package com.memory.gof.proxy;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/19 1:01
 */
public class Play {
    public static void main(String[] args) {
        Gamer p1 = new GamerPlayer(1000, "Tom");
        p1.getEquipment();
        p1.levelup();
        System.out.println();

        Gamer px1 = new GamerProxy(p1, "IPlay");
        px1.getEquipment();
        px1.levelup();
        System.out.println();

        px1 = p1.getProxy();
        px1.getEquipment();
        px1.getEquipment();
        px1.levelup();
    }
}
