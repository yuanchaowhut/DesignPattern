package cn.com.example.responsibility_chain.demo02.interceptor;

import cn.com.example.responsibility_chain.demo02.InterceptorChain;
import cn.com.example.responsibility_chain.demo02.Request;
import cn.com.example.responsibility_chain.demo02.Response;

/**
 * Created by yuanchao on 2018/5/15.
 */
public class CacheInterceptor extends Interceptor {

    public CacheInterceptor(String name) {
        super(name);
    }

    @Override
    public Response intercept(InterceptorChain chain) {
        Request request = chain.getRequest();

        System.out.println(String.format("%s开始处理请求-------------处理缓存配置----------请求名：%s，请求类型：%s，url：%s", this.name, request.getName(), request.getType(), request.getUrl()));

        Response response = chain.proceed(request);

        //do something

        return response;
    }
}
