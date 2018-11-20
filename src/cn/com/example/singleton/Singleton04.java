package cn.com.example.singleton;

/**
 * Created by yuanchao on 2018/11/20.
 */
public class Singleton04 {
    private volatile static Singleton04 instance;

    private Singleton04() {
    }

    //加锁及双重判断
    public static Singleton04 getInstance() {
        if (instance == null) {
            synchronized (Singleton04.class) {
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}
