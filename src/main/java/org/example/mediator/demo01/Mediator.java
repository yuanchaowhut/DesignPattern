package org.example.mediator.demo01;

/**
 * Created by yuanchao on 2019/1/2.
 * 抽象中介者类
 */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
