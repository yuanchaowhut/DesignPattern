package cn.com.example.bridge.demo03;

/**
 * Created by yuanchao on 2018/12/20.
 */
public class MobileGame extends MobileSoft{

    public MobileGame(String softName) {
        super(softName);
    }

    @Override
    public void run() {
        System.out.println("运行" + this.softName + "程序");
    }
}
