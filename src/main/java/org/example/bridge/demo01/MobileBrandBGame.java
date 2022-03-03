package org.example.bridge.demo01;

/**
 * Created by yuanchao on 2018/12/20.
 * 手机品牌A
 */
public class MobileBrandBGame extends MobileBrandA {
    public MobileBrandBGame(String brandName) {
        super(brandName);
    }

    @Override
    protected void run() {
        System.out.println(this.brandName + "运行游戏程序");
    }
}
