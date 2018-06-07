package cn.com.example.observer.demo02;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/6/7.
 */
public class Client {

    @Test
    public void testNotice() {
        OnUpdateListener stock = new StockObserver("李大霄");
        OnUpdateListener nba = new NBAObserver("詹姆斯");
        Noticer.getInstance().register(stock);
        Noticer.getInstance().register(nba);
        Noticer.getInstance().notice();
    }
}
