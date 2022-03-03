package org.example.decorator.demo2.role;


import org.example.decorator.demo2.base.Person;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class Superman extends Person {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    @Override
    public void decorate() {

        System.out.println(name + "----->" + "内裤外穿"); //重写父类的方法,但是只关注自己的核心功能.
    }
}
