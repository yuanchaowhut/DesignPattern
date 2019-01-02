package cn.com.example.mediator.demo01;

import org.junit.Test;

/**
 * Created by yuanchao on 2019/1/2.
 */
public class Client {
    @Test
    public void testSend() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.sendMessage("吃过饭了吗？");
        colleague2.sendMessage("没呢，你打算请客？");
    }
}
