package cn.com.example.strategy.demo2;

/**
 * Created by yuanchao on 2018/4/19.
 * 满减类
 */
public class CashierMJ implements Strategy {
    @Override
    public double algorithmIntegace() {
        double price = Double.parseDouble(Utils.get("price"));
        int num = Integer.parseInt(Utils.get("num"));
        double total = Double.parseDouble(Utils.get("total"));
        double cut = Double.parseDouble(Utils.get("cut"));

        double result = price * num - (Math.floor(price * num / total)) * cut;
        return result;
    }
}
