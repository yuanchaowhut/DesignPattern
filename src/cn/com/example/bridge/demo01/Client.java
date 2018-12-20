package cn.com.example.bridge.demo01;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/12/20.
 */
public class Client {
    @Test
    public void testMobileBrand() {
        MobileBrand brandA = new MobileBrandAGame("手机品牌A");
        brandA.run();
        brandA = new MobileBrandAAddress("手机品牌A");
        brandA.run();

        MobileBrand brandB = new MobileBrandAGame("手机品牌B");
        brandB.run();
        brandB = new MobileBrandAAddress("手机品牌B");
        brandB.run();
    }
}
