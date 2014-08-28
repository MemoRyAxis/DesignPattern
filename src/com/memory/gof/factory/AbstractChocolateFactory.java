package com.memory.gof.factory;

/**
 * @author MemoRyAxis
 * @todo Factory
 * @date 2014/8/28 9:34
 */
public interface AbstractChocolateFactory {

    // normal factory method
    Sweetmeat getSweetmeat(Class<? extends Sweetmeat> clazz);

    // multiple factory
    Sweetmeat getSweetmeat();
}
