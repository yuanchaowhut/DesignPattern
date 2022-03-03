package org.example.singleton;

/**
 * Created by yuanchao on 2018/11/20.
 * 静态内部类单例模式==>推荐
 */
public class Singleton05 {

    private Singleton05() {
    }

    public static Singleton05 getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final Singleton05 sInstance = new Singleton05();
    }
}
