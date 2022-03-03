package org.example.observer.demo01;

/**
 * Created by yuanchao on 2018/6/7.
 */
public class Boss extends Notifier {
    @Override
    public String getCurState() {
        return "我胡汉三回来啦！";
    }
}
