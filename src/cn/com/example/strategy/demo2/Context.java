package cn.com.example.strategy.demo2;

/**
 * Created by yuanchao on 2018/4/19.
 */
public class Context {
    private Strategy strategy;

    //由客户端决定采用什么算法.
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //给Context配置一个getResult.根据具体的策略对象,调用其算法方法.
    public double getResult() {
        double result = strategy.algorithmIntegace();
        return result;
    }
}
