package cn.com.example.command.demo04;

/**
 * Created by yuanchao on 2018/12/24.
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
