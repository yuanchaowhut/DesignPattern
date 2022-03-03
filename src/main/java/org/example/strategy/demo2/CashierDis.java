package org.example.strategy.demo2;

/**
 * Created by yuanchao on 2018/4/19.
 * 折扣类
 */
public class CashierDis implements Strategy {

    @Override
    public double algorithmIntegace() {
        double price = Double.parseDouble(Utils.get("price"));
        int num = Integer.parseInt(Utils.get("num"));
        double discount = Double.parseDouble(Utils.get("discount"));

        double result = price * num * discount;
        return result;
    }
}
