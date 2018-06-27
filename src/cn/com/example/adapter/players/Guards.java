package cn.com.example.adapter.players;

/**
 * Created by yuanchao on 2018/6/27.
 * 前锋
 */
public class Guards implements Player{
    private String name;

    public Guards(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(String.format("后卫%s进攻",name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("后卫%s防守",name));
    }
}
