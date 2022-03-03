package org.example.command.demo02;

/**
 * Created by yuanchao on 2018/12/24.
 * 命令抽象类
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void executeCommand();
}
