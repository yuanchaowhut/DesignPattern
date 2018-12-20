package cn.com.example.bridge.demo03;

/**
 * Created by yuanchao on 2018/12/20.
 */
public class MobileBrand {
    protected String brandName;
    protected MobileSoft soft;

    public MobileBrand(String brandName) {
        this.brandName = brandName;
    }

    public void setSoft(MobileSoft soft) {
        this.soft = soft;
    }

    public void run() {
        System.out.println(this.brandName + "--->");
        soft.run();
    }
}
