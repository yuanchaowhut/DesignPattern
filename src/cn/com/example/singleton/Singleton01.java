package cn.com.example.singleton;

/**
 * Created by yuanchao on 2018/11/20.
 * 饿汉式，由于静态初始化，故会提前占用系统内存，但是不存在线程安全问题。
 */
public class Singleton01 {
    private static Singleton01 instance = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return instance;
    }
}
