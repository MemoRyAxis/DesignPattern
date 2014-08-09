package com.memory.designpattern.base;

/**
 * @author MemoRyAxis
 * @todo a simple abstract class
 * @date 2014/8/10 1:03
 */
public abstract class BaseAbstractClass {

    String field1;

    protected BaseAbstractClass() {

    }

    protected BaseAbstractClass(String field1) {
        this.field1 = field1;
    }

    public abstract void method1();

    public void method2() {
        System.out.println("baseAbstractClass.method2");
        System.out.println("field1 = " + this.field1);
    }
}
