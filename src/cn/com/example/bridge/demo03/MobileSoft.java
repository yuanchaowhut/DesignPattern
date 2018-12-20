package cn.com.example.bridge.demo03;

/**
 * Created by yuanchao on 2018/12/20.
 */
public abstract class MobileSoft {
    protected String softName;

    public MobileSoft(String softName) {
        this.softName = softName;
    }

    public abstract void run();
}
