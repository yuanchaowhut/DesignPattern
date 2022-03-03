package org.example.strategy.demo1;

/**
 * Created by yuanchao on 2018/4/19.
 */
public class CashierDis implements Cashier {
    private static final double discount = 0.8;
    private static final int total = 300;
    private static final double cut = 100;
    private static final int num = 8;
    private static final double price = 250d;

    @Override
    public double getResult(double price, int num) {
        //先从配置文件获取折扣力度,当做是使用者输入或者选择的折扣.
//        ResourceBundle rb = ResourceBundle.getBundle("config/promotion");
//        double discount = Double.parseDouble(rb.getString("discount"));

        return price * num * discount;
    }
}
