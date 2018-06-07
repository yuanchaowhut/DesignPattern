package cn.com.example.observer.demo02;

/**
 * Created by yuanchao on 2018/6/7.
 */
public class NBAObserver implements OnUpdateListener {
    private String name;

    public NBAObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("老板回来啦！" + "," + name + "，停止看NBA！");
    }
}
