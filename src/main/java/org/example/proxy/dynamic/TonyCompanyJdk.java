package org.example.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TonyCompanyJdk {
    public static Object proxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new MyInvocationHandler(target));
    }

    private static class MyInvocationHandler implements InvocationHandler {
        private Object target;

        public MyInvocationHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
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
