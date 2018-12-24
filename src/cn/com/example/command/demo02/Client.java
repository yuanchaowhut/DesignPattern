package cn.com.example.command.demo02;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/12/24.
 * 烧烤店---松耦合设计
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

        //开门营业
        waiter.setOrder(mutton1);
        waiter.notifyExecute();

        waiter.setOrder(chikenWing);
        waiter.notifyExecute();

        waiter.setOrder(mutton2);
        waiter.notifyExecute();
    }
}
