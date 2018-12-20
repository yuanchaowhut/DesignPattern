package cn.com.example.bridge.demo03;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/12/20.
 */
public class Client {
    @Test
    public void testMobile() {
        MobileBrand brandA = new BrandA("手机品牌A");
        MobileSoft game = new MobileGame("游戏");
        brandA.setSoft(game);
        brandA.run();
        MobileSoft address = new MobileAddress("通讯录");
        brandA.setSoft(address);
        brandA.run();

        System.out.println("--------------------------------------");

        MobileBrand brandB = new BrandA("手机品牌B");
        MobileSoft game1 = new MobileGame("游戏");
        brandB.setSoft(game1);
        brandB.run();
        MobileSoft address1 = new MobileAddress("通讯录");
        brandB.setSoft(address1);
        brandB.run();
    }
}
