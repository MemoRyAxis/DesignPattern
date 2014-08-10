package com.memory.gof.composite;

/**
 * @author MemoRyAxis
 * @todo Component : provided common interface
 * @date 2014/8/10 20:48
 */
public interface Vbill {

    //安全方式 : 提供Composite Leaf共有的方法 且不提供对Leaf的管理方法 这里提供给客户端的方法均为安全的方法
    int getLevel();

    void orderPOS();

    //透明方式 : 提供所有公共方法 及Leaf的管理方法 使客户端能够将Composite Leaf都为Composite统一看待 操作
    /*
    void addMerchant(Merchant merc);
    void removeMerchant(Merchant merc);
     */
}
