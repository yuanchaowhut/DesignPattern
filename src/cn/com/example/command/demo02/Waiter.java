package cn.com.example.command.demo02;

/**
 * Created by yuanchao on 2018/12/24.
 */
public class Waiter {
    private Command command;

    //设置订单
    public void setOrder(Command command) {
        this.command = command;
    }

    //通知执行
    public void notifyExecute() {
        this.command.executeCommand();
    }
}
