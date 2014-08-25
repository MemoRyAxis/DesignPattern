package com.memory.gof.builder;

/**
 * @author MemoRyAxis
 * @todo Concrete Builder
 * @date 2014/8/25 16:45
 */
public class CoderBuilder_cn implements CoderBuilder {

    private Coder cn;

    public CoderBuilder_cn() {
        cn = new Coder_cn();
    }

    @Override
    public void setTeamWork(String teamWork) {
        cn.setTeamWork(teamWork);
    }

    @Override
    public void setCodeStyle(String codeStyle) {
        cn.setCodeStyle(codeStyle);
    }

    @Override
    public void setSummarizing(String summarizing) {
        cn.setSummarizing(summarizing);
    }

    @Override
    public Coder createCoder() {
        System.out.println("这是一个团队协作" + cn.getTeamWork() + ", 代码风格" + cn.getCodeStyle() + ", 总结学习" + cn.getSummarizing() + "的优秀程序员.");
        return cn;
    }
}
