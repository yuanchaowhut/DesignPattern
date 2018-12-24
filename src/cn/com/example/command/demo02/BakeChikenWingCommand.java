package cn.com.example.command.demo02;

/**
 * Created by yuanchao on 2018/12/24.
 * 命令具体类：烤鸡翅的命令
 */
public class BakeChikenWingCommand extends Command {
    public BakeChikenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
