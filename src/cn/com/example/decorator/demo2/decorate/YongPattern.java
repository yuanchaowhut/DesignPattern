package cn.com.example.decorator.demo2.decorate;

import cn.com.example.decorator.demo2.base.Decorator;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class YongPattern extends Decorator {

    @Override
    public void addDecorate() {
        System.out.println("大T恤,垮裤,破球鞋"); //增强功能
    }
}
