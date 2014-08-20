package com.memory.gof.dynamicProxy;

import com.memory.gof.base.MDate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author MemoRyAxis
 * @todo Proxy : weaving advice to pointcut in target
 * @date 2014/8/19 16:34
 */
public class GameProxy implements InvocationHandler {

    private Object obj;

    public GameProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(MDate.getFormatDate("yyyy-MM-dd hh:mm:ss"));
        Object result =  method.invoke(this.obj, args);

        return result;
    }

}
