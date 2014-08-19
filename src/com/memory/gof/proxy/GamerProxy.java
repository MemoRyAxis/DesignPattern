package com.memory.gof.proxy;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/19 0:48
 */
public class GamerProxy implements Gamer, Proxy {

    private String name;
    private Gamer player;
    private int fee;

    public GamerProxy(Gamer player, String name) {
        this.player = player;
        this.name = name;
    }

    @Override
    public boolean levelup() {
        if (this.player.levelup()) {
            this.fee += 100;
            this.getTotalCost();
            return true;
        }
        return false;
    }

    @Override
    public boolean getEquipment() {
        if (this.player.getEquipment()) {
            this.fee += 1000;
            this.getTotalCost();
            return true;
        }
        return false;
    }

    @Override
    public boolean pk(Gamer player) {
        return this.player.pk(player);
    }

    @Override
    public Gamer getProxy() {
        return this;
    }

    @Override
    public void getTotalCost() {
        System.out.println(this.getName() + " | Total cost : " + fee);
    }

    public String getName() {
        return name;
    }
}
