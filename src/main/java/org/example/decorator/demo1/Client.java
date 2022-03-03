package org.example.decorator.demo1;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class Client {

    @Test
    public void testDemo() {
        Student stu = new Student("小强");
        Worker worker = new Worker("旺财");
        Artist at = new Artist("周星驰");
        Superman sm = new Superman("奥特曼");

        stu.decorate();
        worker.decorate();
        at.decorate();
        sm.decorate();
    }
}
