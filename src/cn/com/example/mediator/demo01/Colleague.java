package cn.com.example.mediator.demo01;

import javax.print.attribute.standard.Media;

/**
 * Created by yuanchao on 2019/1/2.
 * 抽象同事类
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    protected abstract void sendMessage(String message);

    protected abstract void getMessage(String message);
}
