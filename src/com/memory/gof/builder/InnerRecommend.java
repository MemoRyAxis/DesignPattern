package com.memory.gof.builder;

/**
 * @author MemoRyAxis
 * @todo Director
 * @date 2014/8/25 16:51
 */
public class InnerRecommend {

    public Coder hire(CoderBuilder cb) {
        cb.setTeamWork("素质高");
        cb.setCodeStyle("优雅飘逸");
        cb.setSummarizing("能力强");
        return cb.createCoder();
    }
}
