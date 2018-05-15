package cn.com.example.responsibility_chain.demo02.interceptor;

import cn.com.example.responsibility_chain.demo02.InterceptorChain;
import cn.com.example.responsibility_chain.demo02.Response;

/**
 * Created by yuanchao on 2018/5/15.
 */
public abstract class Interceptor {
    protected String name;

    public Interceptor(String name) {
        this.name = name;
    }

    public abstract Response intercept(InterceptorChain chain);
}
