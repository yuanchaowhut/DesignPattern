package cn.com.example.adapter;

/**
 * Created by yuanchao on 2018/6/27.
 * 前锋
 */
public class ForeignCenter {
    private String name;

    public ForeignCenter(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println(String.format("外籍中锋%s进攻",name));
    }

    public void 防守() {
        System.out.println(String.format("外籍中锋%s防守",name));
    }
}
