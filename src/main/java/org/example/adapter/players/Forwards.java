package org.example.adapter.players;

/**
 * Created by yuanchao on 2018/6/27.
 * 前锋
 */
public class Forwards implements Player{
    private String name;

    public Forwards(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(String.format("前锋%s进攻",name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("前锋%s防守",name));
    }
}
