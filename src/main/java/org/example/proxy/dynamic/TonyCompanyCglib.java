package org.example.proxy.dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TonyCompanyCglib {

    public static Object proxyInterface(Object target) {
        // CGLIB的增强器，即代理人
        Enhancer e = new Enhancer();
        // 设置代理增强动作 - 回调
        e.setCallback(new MyMethodInterceptor(target));
//        当有多个callback时，需要通过callbackFilter来指定被代理方法使用第几个callback
//        e.setCallbacks(new Callback[]{new MyMethodInterceptor(tc), new YouMethodInterceptor(tc)});
//        e.setCallbackFilter(new CallbackFilter() {
//            @Override
//            public int accept(Method method) {
//                // 返回多个callback中的第几个，索引值
//                if ("dating".equals(method.getName())) {
//                    return 1;
//                }
//                return 0;
//            }
//        });
        // 获得接口代理对象
        e.setInterfaces(target.getClass().getInterfaces());

        return e.create();
    }

    public static Object proxyClass(Object target) {
        // CGLIB的增强器，即代理人
        Enhancer e = new Enhancer();
        // 设置代理增强动作 - 回调
        e.setCallback(new MyMethodInterceptor(target));
//        当有多个callback时，需要通过callbackFilter来指定被代理方法使用第几个callback
//        e.setCallbacks(new Callback[]{new MyMethodInterceptor(tc), new YouMethodInterceptor(tc)});
//        e.setCallbackFilter(new CallbackFilter() {
//            @Override
//            public int accept(Method method) {
//                // 返回多个callback中的第几个，索引值
//                if ("dating".equals(method.getName())) {
//                    return 1;
//                }
//                return 0;
//            }
//        });
        // 对类生成代理对象
        e.setSuperclass(target.getClass());
        e.setInterfaces(null);
        return e.create();
    }

    static class MyMethodInterceptor implements MethodInterceptor {
        private Object target;

        public MyMethodInterceptor(Object target) {
            this.target = target;
        }

        @Override
        public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            doSomethingBefore();
            Object res = method.invoke(target, args);
            doSomethingAfter();
            return res;
        }

        private void doSomethingBefore() {
            System.out.println("老板，这个我试过了，很不错，推荐给你！");
        }

        private void doSomethingAfter() {
            System.out.println("老板，你觉得怎样，欢迎下次再约！");
        }
    }
}
