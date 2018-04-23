package cn.com.example.decorator.demo2.decorate;

import cn.com.example.decorator.demo2.base.Decorator;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class SuperPattern extends Decorator {
    @Override
    public void addDecorate() {
        System.out.println("红披风,蓝色紧身服,内裤外穿"); //增强功能
    }
}
