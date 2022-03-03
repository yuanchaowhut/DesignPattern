package org.example.prototype.demo3;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/4/2.
 */
public class Client {

    @Test
    public void test(){
        OrderDealFactory factory = new OrderDealFactory();
        CompanyOrder order = new CompanyOrder();
        order.setOrderName("汽车玩具");
        order.setOrderNumber(5000);
        factory.dealOrder(order);
    }
}
