package org.example.strategy.demo1;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/4/19.
 */
public class Client {
    @Test
    public void testCashier(){
        Cashier cashier = CashierFactory.createCashier(CashierFactory.PROMOTION_MJ);
        double result = cashier.getResult(100, 20);
        System.out.println(result);
    }
}
