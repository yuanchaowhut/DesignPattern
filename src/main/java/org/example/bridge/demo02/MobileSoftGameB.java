package org.example.bridge.demo02;

/**
 * Created by yuanchao on 2018/12/20.
 * 手机品牌A
 */
public class MobileSoftGameB extends MobileSoftGame {
    public MobileSoftGameB(String brandName) {
        super(brandName);
    }

    @Override
    protected void run() {
        System.out.println("手机品牌B运行" + this.softName + "程序");
    }
}
