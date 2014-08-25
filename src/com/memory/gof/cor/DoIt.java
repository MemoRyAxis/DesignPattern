package com.memory.gof.cor;

import com.memory.gof.base.Level;

/**
 * @author MemoRyAxis
 * @todo just do it ~
 * @date 2014/8/21 13:20
 */
public class DoIt {
    public static void main(String[] args) {

        Request request = new Request("Hello World, Hello chain of responsibility!");
        request.setRequestLevel(Level.LEVEL03);

        Handler handler = new Handler1();
        handler.execute(request);

        /*
            Handler handler1 = new Handler1();
            Handler handler2 = new Handler2();
            Handler handler3 = new Handler3();
            handler1.setNextHandler(handler2);
            handler2.setNextHandler(handler3);
            handler1.execute(request);
        */
    }
}
