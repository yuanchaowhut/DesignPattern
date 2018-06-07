package cn.com.example.observer.demo02;

/**
 * Created by yuanchao on 2018/6/7.
 */
public class StockObserver implements OnUpdateListener {
    private String name;

    public StockObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("老板回来啦！" + "," + name + "，停止玩股票！");
    }
}
