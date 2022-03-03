package org.example.builder.demo1;

/**
 * Created by yuanchao on 2018/3/31.
 */
public class HaierBuilder implements Builder {
    Fridge fridge = new Fridge();

    @Override
    public void buildDoor() {
        fridge.setDoor("意式三门");
        System.out.println("创建意式三门门体");
    }

    @Override
    public void buildBox() {
        fridge.setBox("250L");
        System.out.println("创建250L箱体");
    }

    @Override
    public void buildCompressor() {
        fridge.setCompressor("德国造压缩机");
        System.out.println("创建德国制造压缩机");
    }

    @Override
    public Fridge build() {
        return fridge;
    }
}
