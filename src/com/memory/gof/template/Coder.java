package com.memory.gof.template;

/**
 * @author MemoRyAxis
 * @todo Concrete Template : realize superclass' methods to achieve main logic
 * @date 2014/9/1 14:46
 */
public class Coder extends Worker {

    @Override
    public void workInMorning() {
        super.workInMorning();
        System.out.println("coding...");
    }

    @Override
    public void workInAfternoon() {
        System.out.println("coding...");
    }
}
