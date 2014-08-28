package com.memory.gof.factory;

/**
 * @author MemoRyAxis
 * @todo Factory(Factory Method) : can concrete various of object by different params
 * @date 2014/8/27 18:01
 */
public class ChocolateFactory implements AbstractChocolateFactory {

    @Override
    public Sweetmeat getSweetmeat(Class<? extends Sweetmeat> clazz) {
        Sweetmeat sweetmeat = null;
        try {
            sweetmeat = (Sweetmeat) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sweetmeat;
    }

    // unrealized
    @Override
    public Sweetmeat getSweetmeat() {
        return null;
    }
}
