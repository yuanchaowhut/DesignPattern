package cn.com.example.adapter.players;

/**
 * Created by yuanchao on 2018/6/27.
 * 前锋
 */
public class Center implements Player{
    private String name;

    public Center(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(String.format("中锋%s进攻",name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("中锋%s防守",name));
    }
}
