package cn.com.example.strategy.demo1;

import java.util.ResourceBundle;

/**
 * Created by yuanchao on 2018/4/19.
 */
public class CashierDis implements Cashier {
    @Override
    public double getResult(double price, int num) {
        //先从配置文件获取折扣力度,当做是使用者输入或者选择的折扣.
        ResourceBundle rb = ResourceBundle.getBundle("config/promotion");
        double discount = Double.parseDouble(rb.getString("discount"));

        return price * num * discount;
    }
}
