package org.example.builder.demo2;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/3/31.
 */
public class Client {

    @Test
    public void testBuildRoom() {
        WorkBuilder workBuilder = new WorkBuilder();
        Room room = workBuilder
                .buildDoor("中式风格大门")
                .buildFloor("实木地板")
                .buildWindow("百叶窗")
                .build();
        System.out.println(room.toString());
    }
}
