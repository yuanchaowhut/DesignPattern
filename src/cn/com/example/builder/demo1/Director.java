package cn.com.example.builder.demo1;

/**
 * Created by yuanchao on 2018/3/31.
 */
public class Director {

    public Fridge buildFridge(Builder builder) {
        builder.buildDoor();
        builder.buildBox();
        builder.buildCompressor();
        return builder.build();
    }
}
