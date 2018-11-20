package cn.com.example.singleton;

/**
 * Created by yuanchao on 2018/11/20.
 */
public class Singleton03 {
    private static Singleton03 instance = null;

    private Singleton03() {
    }

    //同步函数
    public static synchronized Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}
