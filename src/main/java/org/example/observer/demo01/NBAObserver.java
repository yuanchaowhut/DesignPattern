package org.example.observer.demo01;

/**
 * Created by yuanchao on 2018/6/7.
 */
public class NBAObserver extends Observer {
    public NBAObserver(String name, Notifier notifier) {
        super(name, notifier);
    }

    @Override
    public void update() {
        System.out.println(notifier.getCurState() + "," + name + ",停止看NBA!");
    }
}
