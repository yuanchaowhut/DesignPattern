package cn.com.example.observer.demo01;

/**
 * Created by yuanchao on 2018/6/7.
 */
public class Secretary extends Notifier {

    @Override
    public String getCurState() {
        return "老板回来啦！";
    }
}
