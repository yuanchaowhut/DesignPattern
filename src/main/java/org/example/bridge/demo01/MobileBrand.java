package org.example.bridge.demo01;

/**
 * Created by yuanchao on 2018/12/20.
 * 手机品牌基类
 */
public abstract class MobileBrand {
    protected String brandName;

    public MobileBrand(String brandName) {
        this.brandName = brandName;
    }

    protected abstract void run();
}
