package org.example.decorator.demo1;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void decorate() {
        System.out.println(name + "----->" + "年轻");  //假设这是学生的核心功能.
        System.out.println(name + "----->" + "大T恤,垮裤,破球鞋");
    }
}
