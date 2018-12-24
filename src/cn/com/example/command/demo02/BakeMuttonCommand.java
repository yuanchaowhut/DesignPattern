package cn.com.example.command.demo02;

/**
 * Created by yuanchao on 2018/12/24.
 * 命令具体类：烤羊肉串的命令
 */
public class BakeMuttonCommand extends Command{

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
