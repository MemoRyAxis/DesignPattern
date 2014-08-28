package com.memory.gof.Prototype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/28 11:29
 */
public class Potato implements Serializable, Cloneable {

    private String potatoNo;
    private List<String> potatoList;

    public Potato() {
        potatoList = new ArrayList<String>();
    }

    public String getPotatoNo() {
        return potatoNo;
    }

    public void setPotatoNo(String potatoNo) {
        this.potatoNo = potatoNo;
    }

    public List<String> getPotatoList() {
        return potatoList;
    }

    public void setPotatoList(List<String> potatoList) {
        this.potatoList = potatoList;
    }

    public void add(String str) {
        this.potatoList.add(str);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Potato potato = (Potato) o;

        if (potatoList != null ? !potatoList.equals(potato.potatoList) : potato.potatoList != null) return false;
        if (potatoNo != null ? !potatoNo.equals(potato.potatoNo) : potato.potatoNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = potatoNo != null ? potatoNo.hashCode() : 0;
        result = 31 * result + (potatoList != null ? potatoList.hashCode() : 0);
        return result;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class PotatoTest {
    public static void main(String[] args) throws Exception {

        Potato p1 = new Potato();
        p1.setPotatoNo("no.1");
        p1.add("no.1");

        Potato p2 = (Potato) p1.clone();

//        System.out.println(p2.getPotatoList().get(1));
        p1.add("no.2");
        System.out.println(p2.getPotatoList().get(1));

        System.out.println(p2.getPotatoNo());
        p1.setPotatoNo("no.2");
        System.out.println(p2.getPotatoNo());

        System.out.println(p2 == p1);
        System.out.println(p2.equals(p1));
    }
}
