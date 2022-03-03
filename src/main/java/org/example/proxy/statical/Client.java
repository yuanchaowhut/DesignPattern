package org.example.proxy.statical;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/4/27.
 */
public class Client {

    @Test
    public void testProxy(){
        SchoolGirl mm = new SchoolGirl("娇娇");
        Proxy proxy = new Proxy(mm);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolates();
    }
}
