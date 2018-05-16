package cn.com.example.builder.demo03;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/5/16.
 */
public class Client {

    @Test
    public void testBuild() {
        Room.Builder builder = new Room.Builder()
                .door("黄金打造大门")
                .floor("实木地板")
                .window("百叶窗");

        Room room1 = builder.build();
        Room room2 = builder.build2();

        System.out.println(room1.toString());
        System.out.println(room2.toString());
    }
}
