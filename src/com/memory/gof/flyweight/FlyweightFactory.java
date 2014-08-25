package com.memory.gof.flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author MemoRyAxis
 * @todo Flyweight Factory : create and manage flyweight object
 * @date 2014/8/25 10:23
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public static void getAll() {
        if (flyweights == null || flyweights.isEmpty()) {
            System.out.println("cache is null.");
        } else {
            Set set = flyweights.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

    public static void clear() {
        flyweights = new HashMap<String, Flyweight>();
    }

    public static Flyweight getFlyweight(String intrinsic) {
        Flyweight fly = flyweights.get(intrinsic);
        if (fly == null) {
            fly = new ConcreteFlyweight(intrinsic);
            flyweights.put(intrinsic, fly);
        }
//        FlyweightFactory.getAll();
        return fly;
    }
}
