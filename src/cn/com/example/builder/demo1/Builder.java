package cn.com.example.builder.demo1;

/**
 * Created by yuanchao on 2018/3/31.
 */
public interface Builder {
    void buildDoor();  //门体

    void buildBox();   //箱体

    void buildCompressor();  //压缩机

    Fridge build();
}
