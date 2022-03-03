package org.example.strategy.demo1;

/**
 * Created by yuanchao on 2018/4/19.
 */
public class CashierNomal implements Cashier {
    @Override
    public double getResult(double price, int num) {
        return price * num;
    }
}
