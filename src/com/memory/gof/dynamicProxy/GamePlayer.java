package com.memory.gof.dynamicProxy;

/**
 * @author MemoRyAxis
 * @todo Real Subject : the class who achieve method actually
 * @date 2014/8/19 16:37
 */
public class GamePlayer implements Gamer{

    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void loginin() {
        System.out.println(this.name + " | Login in ");
    }

    @Override
    public void levelup() {
        System.out.println(this.name + " | Level up ");
    }

    @Override
    public void loginout() {
        System.out.println(this.name + " | Login out ");
    }
}
