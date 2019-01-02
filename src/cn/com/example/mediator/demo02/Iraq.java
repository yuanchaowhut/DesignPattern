package cn.com.example.mediator.demo02;

/**
 * Created by yuanchao on 2019/1/2.
 */
public class Iraq extends Country {
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    protected void declare(String message) {
        mediator.declare(message, this);
    }

    @Override
    protected void getMessage(String message) {
        System.out.println("伊拉克获得对方消息:" + message);
    }
}
