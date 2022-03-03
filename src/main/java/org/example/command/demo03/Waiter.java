package org.example.command.demo03;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yuanchao on 2018/12/24.
 */
public class Waiter {
    private List<Command> commands = new ArrayList<>();

    //增加订单（假如鸡翅已经没有了）
    public void setOrder(Command command) {
        if (command instanceof BakeChikenWingCommand) {
            System.out.println("烤鸡翅没有了，请点其他烧烤!");
        } else {
            commands.add(command);
            System.out.println("增加订单:" + getDateStr());
        }
    }

    //取消订单
    public void cancelOrder(Command command) {
        if (commands.contains(command)) {
            commands.remove(command);
            System.out.println("取消订单:" + getDateStr());
        }
    }

    //通知执行
    public void notifyExecute() {
        for (Command command : commands) {
            command.executeCommand();
        }
    }


    public String getDateStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = format.format(new Date());
        return time;
    }
}
