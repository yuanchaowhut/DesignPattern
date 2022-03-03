package org.example.responsibilitychain.demo01;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/5/15.
 */
public class Client {

    @Test
    public void testReq() {
        Manager zongjingli = new GeneralManager("总经理");
        Manager zongjian = new Majordomo("总监");
        Manager jingli = new CommonManager("经理");
        jingli.setSuperior(zongjian);            //经理的上级是总监--->职责链是客户端自己定义的,可以灵活的更改.
        zongjian.setSuperior(zongjingli);        //总监的上级是总经理

        //创建请求.
        Request req = new Request();
        req.setName("旺财");
        req.setRequestType("请假");
        req.setNum(4);

        Request req2 = new Request();
        req2.setName("小强");
        req2.setRequestType("加薪");
        req2.setNum(600);

        //我们这里职责链的入口都是经理
        jingli.executeRequest(req);
        jingli.executeRequest(req2);
    }
}
