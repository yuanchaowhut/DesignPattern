package cn.com.example.bridge.demo01;

/**
 * Created by yuanchao on 2018/12/20.
 * 手机品牌A
 */
public class MobileBrandBAddress extends MobileBrandA {
    public MobileBrandBAddress(String brandName) {
        super(brandName);
    }

    @Override
    protected void run() {
        System.out.println(this.brandName + "运行通讯录程序");
    }
}
