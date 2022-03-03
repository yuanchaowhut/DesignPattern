package org.example.observer.demo01;

/**
 * Created by yuanchao on 2018/6/7.
 */
public abstract class Observer {
    protected String name;
    protected Notifier notifier;

    public Observer(String name, Notifier notifier) {
        this.name = name;
        this.notifier = notifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Notifier getNotifier() {
        return notifier;
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public abstract void update();
}
