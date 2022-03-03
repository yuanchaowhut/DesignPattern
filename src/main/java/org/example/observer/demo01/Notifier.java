package org.example.observer.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanchao on 2018/6/7.
 */
public abstract class Notifier {
    List<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        if (!list.contains(observer)) {
            list.add(observer);
        }
    }


    public void detach(Observer observer) {
        if (list.contains(observer)) {
            list.remove(observer);
        }
    }


    public void notice() {
        for (Observer observer : list) {
            observer.update();
        }
    }


    public abstract String getCurState();
}
