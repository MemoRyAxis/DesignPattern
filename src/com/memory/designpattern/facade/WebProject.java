package com.memory.designpattern.facade;

/**
 * @author MemoRyAxis
 * @todo facade class
 * @date 2014/8/10 3:01
 */
public class WebProject {

    public void request(MVC mvc) {
        mvc.view();
        mvc.controller();
        mvc.service();
        mvc.dao();
    }
}
