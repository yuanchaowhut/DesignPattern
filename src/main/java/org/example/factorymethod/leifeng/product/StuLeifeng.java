package org.example.factorymethod.leifeng.product;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class StuLeifeng implements Leifeng {
    @Override
    public void washClothes() {
        System.out.println("学生洗衣服!");

    }

    @Override
    public void swap() {
        System.out.println("学生扫地!");

    }

    @Override
    public void cook() {
        System.out.println("学生做饭!");

    }

}
