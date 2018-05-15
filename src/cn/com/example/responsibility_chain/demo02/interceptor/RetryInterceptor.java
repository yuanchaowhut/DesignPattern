package cn.com.example.responsibility_chain.demo02.interceptor;

import cn.com.example.responsibility_chain.demo02.InterceptorChain;
import cn.com.example.responsibility_chain.demo02.Request;
import cn.com.example.responsibility_chain.demo02.Response;

/**
 * Created by yuanchao on 2018/5/15.
 */
public class RetryInterceptor extends Interceptor {

    public RetryInterceptor(String name) {
        super(name);
    }

    @Override
    public Response intercept(InterceptorChain chain) {
        Request request = chain.getRequest();

        System.out.println(String.format("%s开始处理请求-------------处理重试与重定向----------请求名：%s，请求类型：%s，url：%s", this.name, request.getName(), request.getType(), request.getUrl()));

        Response response = chain.proceed(request);

        //do something

        return response;
    }
}
