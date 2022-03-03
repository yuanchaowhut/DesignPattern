package org.example.strategy.demo2;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/4/19.
 * 策略模式中这个类是重点,它是由众多算法聚合而成的一个类.可以称之为算法家族.所以它的构造方法需要传递一个算法对象给它.
 */
public class Client {

    @Test
    public void testContext() {
//        Strategy strategy = new CashierNomal();
//        Strategy strategy = new CashierDis();
        Strategy strategy = new CashierMJ();
        Context context = new Context(strategy);

        double result = context.getResult();
        System.out.println(result);
    }

    @Test
    public void testCashierContext() {
//        CashContext context = new CashContext(CashContext.PROMOTION_NONE);
//        CashContext context = new CashContext(CashContext.PROMOTION_DISCOUNT);
        CashContext context = new CashContext(CashContext.PROMOTION_MJ);

        double result = context.getResult();
        System.out.println(result);
    }
}
