package com.memory.gof.cor;

import com.memory.gof.base.Level;

/**
 * @author MemoRyAxis
 * @todo Handler & Concrete Handler : the role who execute request
 * @date 2014/8/21 10:56
 */
public abstract class Handler {
    protected Handler nextHandler;
    protected Level handlerLevel;

    public void execute(Request request) {
        if (request.getRequestLevel().compareTo(this.handlerLevel) >= 1) {
            System.out.println(this.getClass().getSimpleName() + " -> " + nextHandler.getClass().getSimpleName());
            nextHandler.execute(request);
        } else {
            System.out.println(this.getClass().getSimpleName() + " do it.");
            request.execute();
        }
    }
}

class Handler1 extends Handler {
    Handler1() {
        this.handlerLevel = Level.LEVEL01;
        this.nextHandler = new Handler2();
    }
}

class Handler2 extends Handler {
    Handler2() {
        this.handlerLevel = Level.LEVEL02;
        this.nextHandler = new Handler3();
    }
}

class Handler3 extends Handler {
    Handler3() {
        this.handlerLevel = Level.LEVEL03;
    }

    @Override
    public void execute(Request request) {
        request.execute();
    }
}
