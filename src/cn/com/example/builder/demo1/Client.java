package cn.com.example.builder.demo1;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/3/31.
 */
public class Client {

    @Test
    public void testBuildFridge() {
        Director director = new Director();
        Builder builder = new HaierBuilder();
//        Builder builder = new MediaBuilder();
        Fridge fridge = director.buildFridge(builder);
        System.out.println(fridge.toString());
    }
}
