package org.example.flyweight.demo01;

/**
 * Created by yuanchao on 2019/1/7.
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int flag) {
        System.out.println("不共享的具体的Flyweight:" + flag);
    }
}
