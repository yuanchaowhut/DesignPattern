package org.example.observer.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanchao on 2018/6/7.
 */
public class Noticer {
    private static Noticer noticer = null;
    List<OnUpdateListener> listeners = new ArrayList<>();

    private Noticer() {
    }

    /**
     * 单例模式
     * @return
     */
    public static Noticer getInstance() {
        if (noticer == null) {
            synchronized (Noticer.class) {
                if (noticer == null) {
                    noticer = new Noticer();
                }
            }
        }
        return noticer;
    }


    public void register(OnUpdateListener listener) {
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    public void unRegister(OnUpdateListener listener) {
        if (listeners.contains(listener)) {
            listeners.remove(listener);
        }
    }

    /**
     * 通知所有订阅者
     */
    public void notice() {
        for (OnUpdateListener listener : listeners) {
            listener.update();
        }
    }
}
