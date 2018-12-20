package cn.com.example.bridge.demo02;

/**
 * Created by yuanchao on 2018/12/20.
 * 手机软件基类
 */
public abstract class MobileSoft {
    protected String softName;

    public MobileSoft(String softName) {
        this.softName = softName;
    }

    protected abstract void run();
}
