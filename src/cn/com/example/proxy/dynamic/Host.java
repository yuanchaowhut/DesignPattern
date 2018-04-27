package cn.com.example.proxy.dynamic;

/**
 * Created by yuanchao on 2018/4/27.
 * 房东
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("我要出租房子");
    }
}
