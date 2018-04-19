package cn.com.example.strategy.demo1;

import java.util.ResourceBundle;

/**
 * Created by yuanchao on 2018/4/19.
 */
public class CashierMJ implements Cashier {
    @Override
    public double getResult(double price, int num) {
        //先从配置文件获取满多少total减多少cut.
        ResourceBundle rb = ResourceBundle.getBundle("config/promotion");
        double total = Double.parseDouble(rb.getString("total"));
        double cut = Double.parseDouble(rb.getString("cut"));

        double result = price * num - (Math.floor(price * num / total)) * cut;
        return result;
    }
}
