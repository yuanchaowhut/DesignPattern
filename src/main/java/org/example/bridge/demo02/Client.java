package org.example.bridge.demo02;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/12/20.
 */
public class Client {
    @Test
    public void testMobileSoft() {
        MobileSoft softGame = new MobileSoftGameA("游戏");
        softGame.run();
        softGame = new MobileSoftGameB("游戏");
        softGame.run();

        MobileSoft softAddress = new MobileSoftAddressA("通讯录");
        softAddress.run();
        softAddress = new MobileSoftAddressB("通讯录");
        softAddress.run();
    }
}
