package com.memory.gof.composite;

/**
 * @author MemoRyAxis
 * @todo Leaf : basic object that haven't subobject
 * @date 2014/8/10 20:56
 */
public class Merchant implements Vbill {

    String mercNo;

    String mercNm;

    public String getMercNo() {
        return mercNo;
    }

    public void setMercNo(String mercNo) {
        this.mercNo = mercNo;
    }

    public String getMercNm() {
        return mercNm;
    }

    public void setMercNm(String mercNm) {
        this.mercNm = mercNm;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public void orderPOS() {

    }
}
