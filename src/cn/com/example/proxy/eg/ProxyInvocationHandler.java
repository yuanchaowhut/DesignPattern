package cn.com.example.proxy.eg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by yuanchao on 2018/4/27.
 */
public class ProxyInvocationHandler implements InvocationHandler {
    // 目标对象--真实对象
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成代理类.
     *
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * proxy:代理类对象. method:代理类的调用处理程序的方法对象(调用处理程序实际上就是真实角色)
     * args:代理类的调用处理程序的方法的参数.
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }


    public void before() {
        System.out.println("调用之前-----公共方法,一些细枝末节但不可缺少的操作");
    }

    public void after() {
        System.out.println("调用之后-----公共方法,一些细枝末节但不可缺少的操作");
    }
}
