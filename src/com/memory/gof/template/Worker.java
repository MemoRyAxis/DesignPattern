package com.memory.gof.template;

/**
 * @author MemoRyAxis
 * @todo Abstract Template(Core) : defined the primitive method and template method
 * @date 2014/9/1 14:23
 */
public abstract class Worker {

    /**
     * Primitive Method(Core) : main logic that couldn't be changed
     */
    public void aDay() {
        System.out.println("a " + this.getClass().getSimpleName() + "'s day.");
        workInMorning();
        noonBreak();
        workInAfternoon();
    }

    /**
     * Template Method(Hook Method) : a method that will extend in subclass is usually null
     */
    public void workInMorning() {

    }

    /**
     * Template Method(Concrete Method) : have realized
     */
    public final void noonBreak() {
        System.out.println("have a break . z Z");
    }

    /**
     * Template Method(Abstract Method)
     */
    public abstract void workInAfternoon();
}
