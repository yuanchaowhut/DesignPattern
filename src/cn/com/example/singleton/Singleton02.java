package cn.com.example.singleton;

/**
 * Created by yuanchao on 2018/11/20.
 * 懒汉式，有线程不安全问题.
 */
public class Singleton02 {
    private static Singleton02 instance = null;

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }
}
