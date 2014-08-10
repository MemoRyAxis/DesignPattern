package com.memory.gof.base;

import java.io.Serializable;

/**
 * @author MemoRyAxis
 * @todo base class
 * @date 2014/8/10 1:10
 */
public class BaseClass extends BaseAbstractClass implements BaseInterface, Serializable {

    public BaseClass() {
    }

    protected BaseClass(String field1) {
        super(field1);
    }

    @Override
    public void method1() {
        System.out.println("baseClass.method1");
    }

    @Override
    public void method3() {
        System.out.println("baseClass.method3");
    }

    @Override
    public void method4() {

    }

    public static void main(String[] args) {
        BaseAbstractClass base1 = new BaseClass("abstract field");
        base1.method1();
        // method from abstract class
        base1.method2();

        BaseInterface base2 = new BaseClass();
        // final field from interface
        System.out.println(base2.field2);
        // method from interface
        base2.method3();
    }

}