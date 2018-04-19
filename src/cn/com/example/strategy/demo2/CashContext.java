package cn.com.example.strategy.demo2;

/**
 * Created by yuanchao on 2018/4/19.
 */
public class CashContext {
    public static final int PROMOTION_NONE = 0;
    public static final int PROMOTION_DISCOUNT = 1;
    public static final int PROMOTION_MJ = 2;

    private Strategy strategy;

    // 将策略模式和简单工厂模式相结合,和简单工厂模式一样,客户端传递参数,后台根据参数选择需要实例化的对象.
    public CashContext(int promType) {
        if (promType == PROMOTION_NONE) {
            this.strategy = new CashierNomal();
        } else if (promType == PROMOTION_DISCOUNT) {
            this.strategy = new CashierDis();
        } else if (promType == PROMOTION_MJ) {
            this.strategy = new CashierMJ();
        }
    }

    // 给Context配置一个getResult.根据具体的策略对象,调用其算法方法.
    public double getResult() {
        double result = strategy.algorithmIntegace();
        return result;
    }

}
