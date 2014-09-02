package com.memory.gof.template;

/**
 * @author MemoRyAxis
 * @todo Concrete Template : realize superclass' methods to achieve main logic
 * @date 2014/9/1 14:44
 */
public class Offical extends Worker {

    @Override
    public void workInMorning() {
        super.workInMorning();
        System.out.println("news");
        System.out.println("music");
    }

    @Override
    public void workInAfternoon() {
        System.out.println("chew the fat");
        System.out.println("afternoon tea");
    }
}
