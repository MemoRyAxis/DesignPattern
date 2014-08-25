package com.memory.gof.builder;

/**
 * @author MemoRyAxis
 * @todo Product
 * @date 2014/8/25 15:31
 */
public class Coder {

    private String coderName;
    private int coderAge;

    private String teamWork;
    private String codeStyle;
    private String summarizing;

    public Coder() {
    }

    public String getCoderName() {
        return coderName;
    }

    public void setCoderName(String coderName) {
        this.coderName = coderName;
    }

    public int getCoderAge() {
        return coderAge;
    }

    public void setCoderAge(int coderAge) {
        this.coderAge = coderAge;
    }

    public String getTeamWork() {
        return teamWork;
    }

    public String getCodeStyle() {
        return codeStyle;
    }

    public String getSummarizing() {
        return summarizing;
    }

    // -------------------------------------

    public Coder setTeamWork(String teamWork) {
        this.teamWork = teamWork;
        return this;
    }

    public Coder setCodeStyle(String codeStyle) {
        this.codeStyle = codeStyle;
        return this;
    }

    public Coder setSummarizing(String summarizing) {
        this.summarizing = summarizing;
        return this;
    }

    public Coder create() {
        return this;
    }

}
