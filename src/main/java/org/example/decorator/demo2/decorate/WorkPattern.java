package org.example.decorator.demo2.decorate;


import org.example.decorator.demo2.base.Decorator;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class WorkPattern extends Decorator {
    @Override
    public void addDecorate() {
        System.out.println("西装,皮鞋,领带"); //增强功能
    }
}
