package cn.com.example.decorator.demo1;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class Artist {
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public void decorate() {
        System.out.println(name + "----->" + "抽象");  //假设这是艺术家的核心功能
        System.out.println("长头发,胡子,不修边幅");
    }
}
