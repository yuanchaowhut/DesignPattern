package org.example.command.demo04;

/**
 * Created by yuanchao on 2018/12/24.
 */
public class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
