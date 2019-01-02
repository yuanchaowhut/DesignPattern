package cn.com.example.mediator.demo01;

/**
 * Created by yuanchao on 2019/1/2.
 * 具体同事类2
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    protected void sendMessage(String message) {
        this.mediator.send(message, this);
    }

    @Override
    protected void getMessage(String message) {
        System.out.println("Colleague2收到消息:" + message);
    }
}
