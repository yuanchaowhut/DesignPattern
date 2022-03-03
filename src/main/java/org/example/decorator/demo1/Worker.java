package org.example.decorator.demo1;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void decorate() {
        System.out.println(name + "----->" + "干练");  //假设这是职场人士的核心功能.
        System.out.println(name + "----->" + "西装,皮鞋,领带");
    }
}
