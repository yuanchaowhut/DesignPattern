package org.example.mediator.demo01;

/**
 * Created by yuanchao on 2019/1/2.
 * 具体同事类1
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    protected void sendMessage(String message) {
        this.mediator.send(message,this);
    }

    @Override
    protected void getMessage(String message) {
        System.out.println("Colleague1收到消息：" + message);
    }
}
