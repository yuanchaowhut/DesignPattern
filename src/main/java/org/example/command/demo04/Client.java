package org.example.command.demo04;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/12/24.
 */
public class Client {

    @Test
    public void testCommand(){
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
