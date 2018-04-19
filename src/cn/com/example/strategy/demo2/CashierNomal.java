package cn.com.example.strategy.demo2;

/**
 * Created by yuanchao on 2018/4/19.
 */
public class CashierNomal implements Strategy {
    @Override
    public double algorithmIntegace() {
        double price = Double.parseDouble(Utils.get("price"));
        int num = Integer.parseInt(Utils.get("num"));
        return price * num;
    }
}
