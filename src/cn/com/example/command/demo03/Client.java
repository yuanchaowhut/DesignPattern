package cn.com.example.command.demo03;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/12/24.
 */
public class Client {

    @Test
    public void testBake() {
        //开店前的准备(厨师，服务员，菜单(命令)等)
        Barbecuer receiver = new Barbecuer();
        Waiter waiter = new Waiter();
        BakeMuttonCommand mutton1 = new BakeMuttonCommand(receiver);
        BakeMuttonCommand mutton2 = new BakeMuttonCommand(receiver);
        BakeChikenWingCommand chikenWing = new BakeChikenWingCommand(receiver);

        //开门营业 顾客点菜
        waiter.setOrder(mutton1);
        waiter.setOrder(mutton2);
        waiter.setOrder(chikenWing);
        waiter.cancelOrder(mutton2);

        //点菜完毕 通知厨房
        waiter.notifyExecute();
    }
}
