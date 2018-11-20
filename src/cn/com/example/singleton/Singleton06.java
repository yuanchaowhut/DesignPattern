package cn.com.example.singleton;

/**
 * Created by yuanchao on 2018/11/20.
 * 对于一个标准的enum单例模式，最优秀的写法还是实现接口的形式
 */
public enum Singleton06 implements ISingleton {
    INSTANCE {
        @Override
        public void doSomething() {
            //TODO
        }
    };

    //这个构造函数在枚举里可以省略
//    private Singleton06() {
//    }

    public static Singleton06 getInstance() {
        return INSTANCE;
    }
}