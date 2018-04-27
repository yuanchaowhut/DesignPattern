package cn.com.example.proxy.eg;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanchao on 2018/4/27.
 * 最简单的动态代理，只要某个类实现了接口，那么我们就可以代理它的接口方法。
 * 注意：动态代理就是基于接口的。
 */
public class Client {

    @Test
    public void testProxy(){
        //真实角色
        List<String> target = new ArrayList<>();
        //代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(target);
        //抽象角色
        List<String> proxy = (List<String>) handler.getProxy();
        proxy.add("张三");
        proxy.add("李四");
        proxy.add("王五");
        System.out.println(proxy.toString());
    }
}
