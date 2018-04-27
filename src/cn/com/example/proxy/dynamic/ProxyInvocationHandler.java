package cn.com.example.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by yuanchao on 2018/4/27.
 * 动态代理对象生成工厂及调用处理程序类。
 */
public class ProxyInvocationHandler implements InvocationHandler {
    // 目标对象--真实对象
    private Object target;

    public ProxyInvocationHandler(Object target) {
        this.target = target;
    }

    //通过set方法传参也可以。
//    public void setTarget(Object target) {
//        this.target = target;
//    }

    /**
     * 生成代理对象.
     * target.getClass().getInterfaces() 代理真实对象实现的所有接口方法.
     *
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * proxy:代理类对象.
     * method:代理类的调用处理程序的方法对象(调用处理程序实际上就是真实角色)
     * args:代理类的调用处理程序的方法的参数.
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();  //看房子
        Object result = method.invoke(target, args);  //租房
        fare();  //收取中介费
        return result;
    }


    public void seeHouse() {
        System.out.println("带房客看房");
    }

    public void fare() {
        System.out.println("收取中介费");
    }
}
