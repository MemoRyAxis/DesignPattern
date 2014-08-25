package com.memory.gof.builder;

/**
 * @author MemoRyAxis
 * @todo Builder
 * @date 2014/8/25 16:47
 */
public interface CoderBuilder {

    void setTeamWork(String teamWork);

    void setCodeStyle(String codeStyle);

    void setSummarizing(String summarizing);

    Coder createCoder();
}
