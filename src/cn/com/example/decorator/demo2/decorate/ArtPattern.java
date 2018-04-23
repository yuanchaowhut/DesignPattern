package cn.com.example.decorator.demo2.decorate;

import cn.com.example.decorator.demo2.base.Decorator;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class ArtPattern extends Decorator {
    public void addDecorate() {
        System.out.println("长头发,胡子,不修边幅"); //增强功能
    }
}
