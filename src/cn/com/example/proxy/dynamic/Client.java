package cn.com.example.proxy.dynamic;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/4/27.
 */
public class Client {

    @Test
    public void testProxy() {
        Rent host = new Host();

        ProxyInvocationHandler handler = new ProxyInvocationHandler(host);

        //代理对象(动态代理就是基于接口的,target.getClass().getInterfaces())
        Rent proxy = (Rent) handler.getProxy();

        proxy.rent();
    }
}
