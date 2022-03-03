package org.example.mediator.demo01;

import javax.print.attribute.standard.Media;

/**
 * Created by yuanchao on 2019/1/2.
 * 具体中介者类
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague==colleague1){
            colleague2.getMessage(message);
        }else{
            colleague1.getMessage(message);
        }
    }
}
