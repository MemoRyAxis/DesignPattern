package com.memory.gof.proxy;

/**
 * @author MemoRyAxis
 * @todo Real Subject : the class who achieve logic and method actually
 * @date 2014/8/19 0:36
 */
public class GamerPlayer implements Gamer {

    private String name;
    private int rank;
    private Gamer proxy = null;

    public GamerPlayer(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public GamerPlayer(String name) {
        this.rank = 0;
        this.name = name;
    }

    public boolean levelup() {
        if (isProxy()) {
            System.out.println(this.name + " | level up!");
            this.rank += 50;
            return true;
        } else {
            System.out.println("Couldn't login without proxy!");
            return false;
        }
    }

    @Override
    public boolean getEquipment() {
        if (isProxy()) {
            System.out.println(this.name + " | unbelievable, epic equipment");
            this.rank += 300;
            return true;
        } else {
            System.out.println("Couldn't login without proxy!");
            return false;
        }
    }

    @Override
    public boolean pk(Gamer player) {
        return false;
    }

    @Override
    public Gamer getProxy() {
        this.proxy = new GamerProxy(this, "Proxy." + this.name);
        return proxy;
    }

    private boolean isProxy() {
        return !(this.proxy == null);
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }
}
