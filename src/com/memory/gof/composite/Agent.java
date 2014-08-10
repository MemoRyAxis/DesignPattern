package com.memory.gof.composite;

import java.util.List;

/**
 * @author MemoRyAxis
 * @todo Composite : contain many leaf object
 * @date 2014/8/10 20:54
 */
public class Agent implements Vbill {

    String agentNm;

    String agentNo;

    List<Merchant> mercList;

    public String getAgentNm() {
        return agentNm;
    }

    public void setAgentNm(String agentNm) {
        this.agentNm = agentNm;
    }

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    public int getMercCount() {
        return 0;
    }

    public List<Merchant> getMercList() {
        return mercList;
    }

    public void setMercList(List<Merchant> mercList) {
        this.mercList = mercList;
    }

    // 安全方式 : 只在Composite中添加对应管理Leaf的方法
    // 透明方式 : Composite Leaf均继承来自于Component中的管理方法
    public void addMerc(Merchant merc) {
        mercList.add(merc);
    }

    public void removeMerc(Merchant merc) {
        mercList.remove(merc);
    }

    public int mercCount() {
        return mercList.size();
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public void orderPOS() {

    }
}
