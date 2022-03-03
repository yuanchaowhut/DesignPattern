package org.example.command.demo04;

/**
 * Created by yuanchao on 2018/12/24.
 */
public class Invoker {
    protected Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
