package org.example.mediator.demo02;

/**
 * Created by yuanchao on 2019/1/2.
 */
public class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    protected void declare(String message) {
        mediator.declare(message, this);
    }

    @Override
    protected void getMessage(String message) {
        System.out.println("美国获得对方消息:" + message);
    }
}
