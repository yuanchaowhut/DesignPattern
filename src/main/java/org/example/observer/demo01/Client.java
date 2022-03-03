package org.example.observer.demo01;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/6/7.
 * 观察者模式又叫发布/订阅模式。 publish/subscribe
 */
public class Client {

    @Test
    public void testNotice() {
        Notifier secreary = new Secretary();    //发布者
        Observer stock = new StockObserver("李大霄", secreary);  //订阅者
        Observer nba = new NBAObserver("詹姆斯", secreary);      //订阅者
        secreary.attach(stock);
        secreary.attach(nba);
        secreary.notice();

        System.out.println("\n------------------------------------------");

        Notifier boss = new Boss();    //发布者
        Observer lidaxiao = new StockObserver("李大霄", boss);  //订阅者
        Observer james = new NBAObserver("詹姆斯", boss);      //订阅者
        boss.attach(lidaxiao);
        boss.attach(james);
        boss.notice();
    }
}
