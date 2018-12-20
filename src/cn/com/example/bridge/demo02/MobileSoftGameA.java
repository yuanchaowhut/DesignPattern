package cn.com.example.bridge.demo02;

/**
 * Created by yuanchao on 2018/12/20.
 * 手机品牌A
 */
public class MobileSoftGameA extends MobileSoftGame {
    public MobileSoftGameA(String softName) {
        super(softName);
    }

    @Override
    protected void run() {
        System.out.println("手机品牌A运行" + this.softName + "程序");
    }
}
