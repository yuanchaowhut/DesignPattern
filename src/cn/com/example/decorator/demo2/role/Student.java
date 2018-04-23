package cn.com.example.decorator.demo2.role;

import cn.com.example.decorator.demo2.base.Person;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class Student extends Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void decorate() {

        System.out.println(name + "----->" + "年轻"); //重写父类的方法,但是只关注自己的核心功能.
    }
}