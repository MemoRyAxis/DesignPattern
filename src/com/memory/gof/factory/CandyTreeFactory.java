package com.memory.gof.factory;

/**
 * @author MemoRyAxis
 * @todo Factory Concrete
 * @date 2014/8/28 9:37
 */
public class CandyTreeFactory implements AbstractChocolateFactory {

    // unrealized
    @Override
    public Sweetmeat getSweetmeat(Class<? extends Sweetmeat> clazz) {
        return null;
    }

    @Override
    public Sweetmeat getSweetmeat() {
        return new CandyTree();
    }
}
